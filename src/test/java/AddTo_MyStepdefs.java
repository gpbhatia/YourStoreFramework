import Pages.HomePage;
import Utils.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class AddTo_MyStepdefs extends Hooks {
    HomePage homePage;

    @When("^user clicks on Dresses$")
    public void userClicksOnDresses() {
     //driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a")).click();
     //driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a")).click();
        driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a")).click();
    }

    @Given("^user is in homepage$")
    public void userIsInHomepage() {
       // driver.findElement(By.tagName("body")).getText().contains("Automation Practice Website");
        homePage=new HomePage();
        Assert.assertTrue(homePage.isUserInHomePage());

    }

    @And("^clicks on summer dresses$")
    public void clicksOnSummerDresses() {
        driver.findElement(By.xpath(".//*[@id='subcategories']/ul/li[3]/h5/a")).click();
        //driver.findElement(By.xpath(".//*[@id='subcategories']/ul/li[3]/h5/a")).click();
    }

    @And("^clicks on printed dress$")
    public void clicksOnPrintedDress() {
        driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[2]/h5/a")).click();
       // driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[2]/h5/a")).click();
    }

    @And("^clicks on Add to cart button$")
    public void clicksOnAddToCartButton() {
       // driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[1]/div/div/div[3]/a")).click();
       // driver.findElement(By.xpath(".//*[@id='add_to_cart']/button")).click();
        driver.findElement(By.xpath("//span[text()='Add to cart']")).click();//created
    }

    @Then("^user is able to add the product successfully and view a message \"([^\"]*)\"$")
    public void userIsAbleToAddTheProductSuccessfullyAndViewAMessage(String text) {
       boolean IsPageDisplay = driver.getPageSource().contains(text);
       assertTrue(IsPageDisplay);
    }

    @When("^user navigates back$")
    public void userNavigatesBack() {
        driver.navigate().back();
    }

    @And("^user is able to view the cart option in the homepage to be updated with the number of  product in the cart \"([^\"]*)\"$")
    public void userIsAbleToViewTheCartOptionInTheHomepageToBeUpdatedWithTheNumberOfProductInTheCart(String text) {
        boolean IsPageDisplay = driver.getPageSource().contains(text);
       assertTrue(IsPageDisplay);

    }
}
