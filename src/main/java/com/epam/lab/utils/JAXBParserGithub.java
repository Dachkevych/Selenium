package com.epam.lab.utils;

import com.epam.lab.github.dataobject.UserModel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBParserGithub {

    public UserModel readXml(File file) {
        UserModel userModel = new UserModel();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(UserModel.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            userModel = (UserModel) unmarshaller.unmarshal(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userModel;
    }
}
