package com.epam.lab.github.dataobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "usersGithub")
@XmlAccessorType(XmlAccessType.FIELD)
public class UsersGithub {

    @XmlElement(name = "user")
    private List<UserModelGithub> userModelGithubs = null;

    public List<UserModelGithub> getUserModelGithubs() {
        return userModelGithubs;
    }

    public void setUserModelGithubs(List<UserModelGithub> userModelGithubs) {
        this.userModelGithubs = userModelGithubs;
    }

    @Override
    public String toString() {
        return "UsersGithub{" +
                "userModelGithubs=" + userModelGithubs +
                '}';
    }
}