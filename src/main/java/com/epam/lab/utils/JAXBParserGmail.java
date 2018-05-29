package com.epam.lab.utils;

import com.epam.lab.gmail.dataobject.UserModelGmail;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBParserGmail {

    public UserModelGmail readXml(File file) {
        UserModelGmail dataObject = new UserModelGmail();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(UserModelGmail.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            dataObject = (UserModelGmail) unmarshaller.unmarshal(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataObject;
    }
}
