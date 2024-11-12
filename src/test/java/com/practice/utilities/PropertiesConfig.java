package com.practice.utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class PropertiesConfig {
    Properties probables;
    public PropertiesConfig() throws IOException {
        probables=new Properties();
        InputStream input=new FileInputStream("C:\\Users\\santhosh.krishnan\\eclipse-workspace\\SuperTails\\src\\test\\java\\com\\practice\\testdata\\supertail.properties");
        probables.load(input);
    }

    public String getUrl()
    {
        String urls=probables.getProperty("url");
        return urls;
    }
    public String getbrowser()
    {
        String browsers=probables.getProperty("browser");
        return browsers;
    }


}

