package com.epam.lab.gmail.dataobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "usersGmail")
@XmlAccessorType(XmlAccessType.FIELD)
public class UsersGmail {

    @XmlElement(name = "user")
    private List<UserModelGmail> userModelGmails = null;

    public List<UserModelGmail> getUserModelGmails() {
        return userModelGmails;
    }
}
