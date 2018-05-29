package com.epam.lab.gmail.dataobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserModelGmail {

    private String login;
    private String password;
    private String receiver;
    private String subject;
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
