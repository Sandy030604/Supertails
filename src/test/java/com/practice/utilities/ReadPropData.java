//package com.practice.utilities;
//
//import org.testng.annotations.DataProvider;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Properties;
//
//public class ReadPropData {
//
//    @DataProvider(name="loginSuperTail")
//    public String[][] readprop() throws IOException {
//        String[][] data=new String[2][2];
//        Properties probables=new Properties();
//        InputStream input=new FileInputStream("C:\\Users\\santhosh.krishnan\\eclipse-workspace\\SuperTails\\src\\test\\java\\com\\practice\\testdata\\supertail.properties");
//        probables.load(input);
//        data[0][0]= probables.getProperty("url");
//        data[0][1]=probables.getProperty("browser");
//
//        return data;
//
//
//    }
//}
