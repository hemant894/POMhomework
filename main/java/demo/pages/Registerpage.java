package demo.pages;

import demo.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registerpage {

    WebDriver driver;
    Utils utils;

    By registerLink = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    By Gender = By.xpath("//*[@id=\"gender-male\"]");
    By Firstname = By.id("FirstName");
    By lastname = By.id("LastName");
    By day = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
    By month = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
    By year = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
    By emilId = By.id("Email");
    By company  = By.id("Company");
    By Password = By.id("Password");
    By confirmpassword = By.id("ConfirmPassword");

    By register = By.xpath("//*[@id=\"register-button\"]");

    public Registerpage(WebDriver driver){
        this.driver=driver;
        utils = new Utils(driver);
    }

    public void clickOnRegisterLink() { utils.doClick(registerLink);}

    public void clikconRegister(){utils.doClick(register);}

    public void clikconGender(){utils.doClick(Gender);}


    public void doRegister(String gender ,String fname , String lname ,String bday , String bmonth , String byear, String email, String companyname , String password , String Confirmpassword ){
    utils.doSendkey(Gender,gender);
    utils.doSendkey(Firstname,fname);
    utils.doSendkey(lastname,lname);
    utils.doSendkey(day,bday);
    utils.doSendkey(month,bmonth);
    utils.doSendkey(year,byear);
    utils.doSendkey(emilId,email);
    utils.doSendkey(company,companyname);
    utils.doSendkey(Password,password);
    utils.doSendkey(confirmpassword,Confirmpassword);

    }
}
