package demo;

import demo.Basepage.basepage;
import demo.pages.Registerpage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterTestpage {

    WebDriver driver;

    basepage BasePage = new basepage();

    Properties prop = new Properties();

    Registerpage registerpage;
    @BeforeMethod

    public void openBrowser(){
        BasePage = new basepage();
        prop = basepage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = BasePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
        registerpage = new Registerpage(driver);
    }


 @Test
public void registerTest() {
     registerpage.clickOnRegisterLink();
     registerpage.clikconGender();
     registerpage.doRegister(prop.getProperty("gender"), prop.getProperty("fname"), prop.getProperty("lname"), prop.getProperty("bday"), prop.getProperty("bmonth"), prop.getProperty("byear"), prop.getProperty("email"), prop.getProperty("companyname"), prop.getProperty("password"), prop.getProperty("confirmpassword"));
     registerpage.clikconRegister();
 }

 }
