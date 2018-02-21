import Pages.HomePage;
import Pages.RegisterPage;
import Utils.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Register_MyStepdefs extends Hooks {
    public HomePage homePage;
    public RegisterPage registerPage;


    @When("^user clicks on Sign in button$")
    public void userClicksOnSignInButton() {
       // driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
        //driver.findElement(By.xpath("//a[@class='login']")).click();
        homePage= new HomePage();
        homePage.UserclicksOnSignIn();
    }

    @And("^enters the email address$")
    public void entersTheEmailAddress() {
        registerPage= new RegisterPage();
        registerPage.enterEmail();
       // Random r = new Random();
        //int val = r.nextInt();
        //driver.findElement(By.id("email_create")).sendKeys("enter" + val + "@gmail.com");
    }

    @And("^clicks on  create an account button$")
    public void clicksOnCreateAnAccountButton() {
        registerPage.createAnAccountClick();
       // driver.findElement(By.id("SubmitCreate")).click();
    }
    @And("^select  the radiobutton Mrs$")
    public void selectTheRadiobuttonMrs() {
       // driver.findElement(By.id("id_gender2")).click();
        registerPage.selectRadiobtn();
    }


    @And("^types in firstname \"([^\"]*)\" lastname \"([^\"]*)\" password \"([^\"]*)\"$")
    public void typesInFirstnameLastnamePassword(String fname, String lname, String pwd) {
        registerPage.enterDetails(fname, lname, pwd);

       // driver.findElement(By.id("customer_firstname")).sendKeys(fname);
        //driver.findElement(By.id("customer_lastname")).sendKeys(lname);
        //driver.findElement(By.id("passwd")).sendKeys(pwd);


    }

    @And("^select \"([^\"]*)\" for date \"([^\"]*)\" as  month \"([^\"]*)\" as year$")
    public void selectForDateAsMonthAsYear(String date, String month, String year) {
        registerPage.selectingDayMonthYear(date,month,year);


       // WebElement SelectDay = driver.findElement(By.id("days"));
        //Select Day_dropdown = new Select(SelectDay);
        //Day_dropdown.selectByIndex(7);

        //WebElement Selectmonth = driver.findElement(By.id("months"));
       // Select month_dropdown;
       //Select month_dropdown = new Select(Selectmonth);
        //month_dropdown.selectByIndex(1);

        //WebElement Selectyear = driver.findElement(By.id("years"));
        //Select year_dropdown = new Select(Selectyear);
      // year_dropdown.selectByValue(String.valueOf(1990));


    }

    @And("^type in address \"([^\"]*)\" city \"([^\"]*)\"$")
    public void typeInAddressCity(String address, String city) {
        registerPage.enterAddressCity(address,city);
       // driver.findElement(By.id("address1")).sendKeys(address);
        //driver.findElement(By.id("city")).sendKeys(city);


    }

    @And("^select state as \"([^\"]*)\"$")
    public void selectStateAs(String state) {
        registerPage.selectState();
      //  WebElement Selectstate= driver.findElement(By.id("id_state"));
       // Select state_dropdown= new Select(Selectstate);
       // state_dropdown.selectByValue(String.valueOf(30));
    }

    @And("^type in zipcode as \"([^\"]*)\" mobile phone \"([^\"]*)\"$")
    public void typeInZipcodeAsMobilePhone(String zip, String mphone) {
        registerPage.enterCodeAndMobile(zip,mphone);
     //driver.findElement(By.id("postcode")).sendKeys(zip);
      //  driver.findElement(By.id("phone_mobile")).sendKeys(mphone);

    }

    @And("^click on REGISTER button$")
    public void clickOnREGISTERButton(){
        registerPage.clickRegBtn();
        //driver.findElement(By.id("submitAccount")).click();

    }

    @Then("^user is able to register and land on the page with the message \"([^\"]*)\"$")
    public void userIsAbleToRegisterAndLandOnThePageWithTheMessage(String text)throws Throwable {
        //boolean IsTextPresent= driver.getPageSource().contains(text);
        //assertTrue(IsTextPresent);
       // boolean IsMessagePresent= driver.getPageSource().contains(text);
        Assert.assertTrue(registerPage.IsMessagePresent(text));

    }


}
