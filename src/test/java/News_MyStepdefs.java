import Utils.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.util.Random;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;

public class News_MyStepdefs extends Hooks {
    
    @When("^user enters valid email address$")
    public void userEntersValidEmailAddress() {
        Random rad = new Random();
        int value = rad.nextInt();
        driver.findElement(By.xpath("//input[@id='newsletter-input'][@name='email']")).sendKeys("dynamic" +value +"@gmail.com");
    }

    @And("^clicks on Subscribe button$")
    public void clicksOnSubscribeButton() {
      //  driver.findElement(By.xpath("//button[@type='submit']")).click();

       // driver.findElement(By.xpath("//button[@name='submitNewsletter']")).click();
       driver.findElement(By.xpath("//button[@class='btn btn-default button button-small']")).click();
    }


    @Then("^user is able to subscribe successfully and view message \"([^\"]*)\"$")
    public void userIsAbleToSubscribeSuccessfullyAndViewMessage(String message) throws Throwable {
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        boolean IsPageDisplay = driver.getPageSource().contains(message);
        assertTrue(IsPageDisplay);
    }

    @When("^user enters  email address \"([^\"]*)\"$")
    public void userEntersEmailAddress(String email)  {
         driver.findElement(By.xpath(".//*[@id='newsletter-input']")).sendKeys(email);


    }

    @Then("^user is  not able to subscribe and view a message \"([^\"]*)\"$")
    public void userIsNotAbleToSubscribeAndViewAMessage(String errormessage) throws Throwable {
        boolean IsPageDisplay = driver.getPageSource().contains(errormessage);
        assertTrue(IsPageDisplay);


    }
}
