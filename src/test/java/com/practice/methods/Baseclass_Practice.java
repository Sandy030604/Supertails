package com.practice.methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass_Practice {
    WebDriver driverSuper;
//    public Baseclass_Practice(WebDriver drivermain)
//    {
//        this.driverSuper=drivermain;
//    }
    public WebDriver setup(String urlzzzz,String browserzzzz)
    {
        switch(browserzzzz){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driverSuper=new ChromeDriver();
                driverSuper.get(urlzzzz);
                System.out.println("Hiii");
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driverSuper=new EdgeDriver();
                driverSuper.get(urlzzzz);
                System.out.println("Byeee");
                break;
        }
        return driverSuper;
    }
    public void teardown()
    {
        driverSuper.quit();
    }
}
