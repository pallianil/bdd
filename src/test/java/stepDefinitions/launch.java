package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
    public static void  main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\anil\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");


    }
}
