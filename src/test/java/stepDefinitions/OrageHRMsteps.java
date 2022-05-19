package stepDefinitions;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrageHRMsteps {
    WebDriver driver;
    @Given("I Launch a Browser")
    public void i_launch_a_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anil\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver= new ChromeDriver();
    }

    @When("I open hrm homepage")
    public void i_open_hrm_homepage() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Then("i verify the Logo is present")
    public void i_verify_the_logo_is_present() {
        // Write code here that turns the phrase above into concrete actions
        boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true,status);
    }

    @Then("close browser")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }
}
