package com.epam.lab.gmail.utils;

import com.epam.lab.gmail.dataobject.UserModelGmail;

import java.util.List;

public class DataReaderGmail {
    public Object[][] getXMLData() {
        List<UserModelGmail> userModelGmails = new UserDataUnmarshallerGmail().createObjectsUserData();
        Object[][] gmailData = new Object[userModelGmails.size()][1];
        for (int i = 0, j = 0; i < userModelGmails.size(); i++, j++) {
            gmailData[i][0] = userModelGmails.get(i);
        }
        return gmailData;
    }
}
