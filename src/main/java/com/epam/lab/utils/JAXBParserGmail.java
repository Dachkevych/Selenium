package com.epam.lab.utils;

import com.epam.lab.gmail.dataobject.DataObjectGmail;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBParserGmail {

    public DataObjectGmail readXml(File file) {
        DataObjectGmail dataObject = new DataObjectGmail();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(DataObjectGmail.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            dataObject = (DataObjectGmail) unmarshaller.unmarshal(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataObject;
    }
}
