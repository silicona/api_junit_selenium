/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author nadies
 */
public class SeleniumTest {
    
    static WebDriver driver;
    
    public SeleniumTest() {
        
    }

    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "./libs/drivers/chromedriver");

        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDownClass() {
        driver.quit();
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void initialTest() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\yehasha.hettiarachch\\Desktop\\New folder (3)\\chromedriver_win32\\chromedriver.exe");


        driver.get("https://google.com");
        driver.manage().window().maximize();

                WebElement in = driver.findElement(By.name("q"));
                assertEquals(in.getTagName(), "input");
        ///System.out.println("in: " + in);
        //Select selectByValue = new Select(driver.findElement(By.name("q")));
        //selectByValue.selectByValue("ta-lk");
        
        //driver.close();
    }
}
