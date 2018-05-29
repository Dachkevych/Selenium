package com.epam.lab.github.utils;

import com.epam.lab.github.dataobject.UserModelGithub;

import java.util.List;

public class DataReaderGithub {
    public Object[][] getXMLData() {
        List<UserModelGithub> userModelGithubs = new UserDataUnmarshallerGithub().createObjectsUserData();
        Object[][] gmailData = new Object[userModelGithubs.size()][1];
        for (int i = 0, j = 0; i < userModelGithubs.size(); i++, j++) {
            gmailData[i][0] = userModelGithubs.get(i);
        }
        return gmailData;
    }
}