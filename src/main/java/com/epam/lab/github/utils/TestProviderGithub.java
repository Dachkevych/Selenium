package com.epam.lab.github.utils;

import org.testng.annotations.DataProvider;

public class TestProviderGithub {
    @DataProvider(parallel = true)
    public Object[][] getUsersData() {
        return new DataReaderGithub().getXMLData();
    }
}