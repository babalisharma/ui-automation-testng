/**
 * @author jagdeepjain
 *
 */
package org.jagdeep.example.ui.automation.testng.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    private WebDriver driver;
    private String urlUnderTest = "http://www.google.co.in";
    
    public Browser(WebDriver driver) {
        this.driver = driver;
    }
    
    // using fireFox to test application
    public WebDriver setBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    
    // return the driver with fire fox instance
    public WebDriver getBrowser() {
        return setBrowser();
    }
    
    // launch URL with the driver instance
    public void openURL() {
        driver.manage().window().maximize();
        driver.get(urlUnderTest);
    }
}
