package com.epam.lab.gmail.utils;

import com.epam.lab.gmail.dataobject.UserModelGmail;
import com.epam.lab.gmail.dataobject.UsersGmail;
import org.sonatype.plexus.components.sec.dispatcher.model.ConfigProperty;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

import static com.epam.lab.utils.ConfigProperties.getTestProperty;

public class UserDataUnmarshallerGmail {

    public List<UserModelGmail> createObjectsUserData() {
        try {
            ConfigProperty configProperty = new ConfigProperty();
            JAXBContext context = JAXBContext.newInstance(UsersGmail.class);
            Unmarshaller un = context.createUnmarshaller();
            UsersGmail usersGmail = (UsersGmail) un.unmarshal(new File(getTestProperty("linkXMLGmail")));
            System.out.println(usersGmail.toString());
            return usersGmail.getUserModelGmails();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
