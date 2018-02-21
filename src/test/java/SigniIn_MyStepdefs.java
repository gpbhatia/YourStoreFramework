import Utils.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class SigniIn_MyStepdefs extends Hooks {


    @And("^user enters email address \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userEntersEmailAddressAndPassword(String email, String pwd) {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(pwd);

    }

    @And("^clicks on Sign in button$")
    public void clicksOnSignInButton() {
        driver.findElement(By.id("SubmitLogin")).click();

        }

    @Then("^User should able to login successfully and view am messgae \"([^\"]*)\"$")
    public void userShouldAbleToLoginSuccessfullyAndViewAmMessgae(String msg) {
        boolean IsPageDisplay= driver.getPageSource().contains(msg);


    }

    @And("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersAnd(String emailid, String pwd) {
        driver.findElement(By.id("email")).sendKeys(emailid);
        driver.findElement(By.id("passwd")).sendKeys(pwd);

    }

    @Then("^user is not able to register with the \"([^\"]*)\"$")
    public void userIsNotAbleToRegisterWithThe(String errormessage) {
        boolean IsTextPresent= driver.getPageSource().contains(errormessage);
        assertTrue(IsTextPresent);
    }

    @And("^user clicks on Forgot your password$")
    public void userClicksOnForgotYourPassword() {
        driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
      //  driver.findElement(By.xpath("/a[@href='http://automationpractice.com/index.php?controller=password']")).click();

    }

    @And("^enters the email address \"([^\"]*)\"$")
    public void entersTheEmailAddress(String email) {
        driver.findElement(By.id("email")).sendKeys(email);

    }


    @And("^user clicks on Retrieve password$")
    public void userClicksOnRetrievePassword() {
        driver.findElement(By.xpath("//span[text()='Retrieve Password']")).click();

    }


    @Then("^user is able to land on a page with message \"([^\"]*)\"$")
    public void userIsAbleToLandOnAPageWithMessage(String cmessage) {
        boolean IsPageDisplay = driver.getPageSource().contains(cmessage);
        assertTrue(IsPageDisplay);

    }
}
