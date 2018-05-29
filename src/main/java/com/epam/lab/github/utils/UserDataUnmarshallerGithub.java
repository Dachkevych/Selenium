package com.epam.lab.github.utils;

import com.epam.lab.github.dataobject.UserModelGithub;
import com.epam.lab.github.dataobject.UsersGithub;
import org.sonatype.plexus.components.sec.dispatcher.model.ConfigProperty;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

import static com.epam.lab.utils.ConfigProperties.getTestProperty;

public class UserDataUnmarshallerGithub {

    public List<UserModelGithub> createObjectsUserData() {
        try {
            ConfigProperty configProperty = new ConfigProperty();
            JAXBContext context = JAXBContext.newInstance(UsersGithub.class);
            Unmarshaller un = context.createUnmarshaller();
            UsersGithub usersGithub = (UsersGithub) un.unmarshal(new File(getTestProperty("linkXMLGithub")));
            System.out.println(usersGithub.toString());
            return usersGithub.getUserModelGithubs();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}