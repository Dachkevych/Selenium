package com.epam.lab.github.dataobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserModelGithub {

    private String login;
    private String password;

    public UserModelGithub(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public UserModelGithub() {
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "UserModelGithub{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
