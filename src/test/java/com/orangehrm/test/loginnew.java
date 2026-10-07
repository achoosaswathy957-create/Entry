package com.orangehrm.test;


import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginnew {

    WebDriver driver;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        driver.findElement(By.name("username"))
              .sendKeys(username);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        driver.findElement(By.name("password"))
              .sendKeys(password);
    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        driver.findElement(By.cssSelector("button[type='submit']"))
              .click();
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Assert.assertTrue(
            driver.getCurrentUrl().contains("dashboard")
        );
        driver.quit();
    }
}
