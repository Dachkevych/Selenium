package com.epam.lab.gmail.dataobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dataObjectGmail")
@XmlAccessorType(XmlAccessType.FIELD)
public class DataObjectGmail {

    @XmlElement(name = "login")
    private String login;
    @XmlElement(name = "password")
    private String password;
    @XmlElement(name = "receiver")
    private String receiver;
    @XmlElement(name = "subject")
    private String subject;
    @XmlElement(name = "text")
    private String text;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }
}
