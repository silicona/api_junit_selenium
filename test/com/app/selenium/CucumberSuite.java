/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.selenium;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author nadies
 */
//@RunWith(Suite.class)
@RunWith(Cucumber.class)
//@Suite.SuiteClasses({com.app.selenium.SeleniumTest.class})
@CucumberOptions(
    features = "test/com/app/features",
        plugin = {
            "pretty",
            "html:target/cucumber",
            "json:target/cucumber.json"
        }
)
public class CucumberSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
