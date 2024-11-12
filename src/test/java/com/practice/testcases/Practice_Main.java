package com.practice.testcases;

import com.practice.methods.Baseclass_Practice;
import com.practice.pageobjects.Practice_POM;
import com.practice.utilities.PropertiesConfig;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Practice_Main {
    WebDriver drivermain;

    //Test(dataProvider = "loginSuperTail")
    @Test
    public  void initiate() throws IOException {
        Baseclass_Practice obj=new Baseclass_Practice();
        PropertiesConfig promain=new PropertiesConfig();
        String url=promain.getUrl();
        String browser=promain.getbrowser();


//        drivermain.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        drivermain=obj.setup(url,browser);
        drivermain.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//        drivermain=obj.setup(url,browsertype);
        drivermain.manage().window().maximize();

        Practice_POM pommain=new Practice_POM(drivermain);
        pommain.hoverXpath("/html/body/div[4]/div[5]/header/nav/ul/li[2]");
        System.out.println("Xpath hovered");

        pommain.clickActionByXpath("/html/body/div[4]/div[5]/header/nav/ul/li[2]/div/div/div/div/div[1]/ul/li[1]/a");
        System.out.println("Clicked Dog Food");


        JavascriptExecutor js=(JavascriptExecutor) drivermain;
        js.executeScript("window.scrollBy(0,700)");
        System.out.println("SCroll happened to view Add to cart button");


        pommain.clickActionById("AddToCart-8017757602030");
        pommain.clickActionById("AddToCart-8017757602030");
        System.out.println("Added to cart");

        pommain.clickActionByXpath("/html/body/div[4]/div[5]/header/div/div[2]/div[2]/div[1]/a[4]");
        System.out.println("Went to view cart");

        pommain.elementfindxpath("/html/body/div[2]/main/div/div[3]/form/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[1]/a");
        System.out.println("Element found");
    }
}
