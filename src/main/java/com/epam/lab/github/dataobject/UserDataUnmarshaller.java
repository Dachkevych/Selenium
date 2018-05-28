package com.epam.lab.github.dataobject;

import org.sonatype.plexus.components.sec.dispatcher.model.ConfigProperty;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class UserDataUnmarshaller {

    public List<UserModel> createObjectsUserData() {
        try {
            ConfigProperty configProperty = new ConfigProperty();
            JAXBContext context = JAXBContext.newInstance(Users.class);
            Unmarshaller un = context.createUnmarshaller();
            Users users = (Users) un.unmarshal(new File("src/main/resources/dataGithub.xml"));
            System.out.println(users.toString());
            return users.getUserModels();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}