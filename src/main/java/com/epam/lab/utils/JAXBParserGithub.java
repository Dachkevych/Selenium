package com.epam.lab.utils;

import com.epam.lab.github.dataobject.DataObjectGithub;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBParserGithub {

    public DataObjectGithub readXml(File file) {
        DataObjectGithub dataObject = new DataObjectGithub();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(DataObjectGithub.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            dataObject = (DataObjectGithub) unmarshaller.unmarshal(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataObject;
    }
}
