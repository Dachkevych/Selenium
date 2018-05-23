package com.epam.lab.github.dataobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dataObjectGithub")
@XmlAccessorType(XmlAccessType.FIELD)
public class DataObjectGithub {

    @XmlElement(name = "login")
    private String login;
    @XmlElement(name = "password")
    private String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
