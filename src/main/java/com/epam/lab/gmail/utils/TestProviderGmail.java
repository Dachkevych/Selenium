package com.epam.lab.gmail.utils;

import org.testng.annotations.DataProvider;

public class TestProviderGmail {
    @DataProvider(parallel = true)
    public Object[][] getUsersData() {
        return new DataReaderGmail().getXMLData();
    }
}
