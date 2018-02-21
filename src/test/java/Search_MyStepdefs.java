import Pages.HomePage;
import Pages.SearchPage;
import Utils.Hooks;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static Utils.Hooks.driver;
import static org.junit.Assert.assertTrue;

public class Search_MyStepdefs   {
    HomePage homePage;
    SearchPage searchPage;


    @When("^user types in valid data in the search box \"([^\"]*)\"$")
    public void userTypesInValidDataInTheSearchBox(String text)  {
        //driver.findElement(By.id("search_query_top")).sendKeys(text);
        homePage= new HomePage();
        homePage.UserSearchType(text);
    }

    @And("^clicks on search icon$")
    public void clicksOnSearchIcon() {
        //driver.findElement(By.xpath("//button[@name='submit_search']")).click();
        homePage.UserclicksOnSearchIcon();   }

    @Then("^user should  able to view the message \"([^\"]*)\"$")
    public void userShouldAbleToViewTheMessage(String text) throws Throwable {
        searchPage= new SearchPage();
       Assert.assertTrue(searchPage.IsTextPresent(text));
      // boolean IsTextPresent= driver.getPageSource().contains(text);
       //assertTrue(IsTextPresent);


    }

    @When("^user types in invalid data in the search box as \"([^\"]*)\"$")
    public void userTypesInInvalidDataInTheSearchBoxAs(String invaliddata) throws Throwable {
        homePage= new HomePage();
        homePage.UserSearchTypeInvalid(invaliddata);
    }

    @Then("^user should view the message \"([^\"]*)\"$")
    public void userShouldViewTheMessage(String errormessage) throws Throwable {
       // boolean viewErrorMessage= driver.getPageSource().contains(errormessage);
        //assertTrue(viewErrorMessage);

        searchPage= new SearchPage();
        Assert.assertTrue(searchPage.userShouldViewTheMessage(errormessage));
    }


    // @When("^user types in invalid data in the search box as \"([^\"]*)\"$")
    //public void userTypesInInvalidDataInTheSearchBoxAs(String notValid) {
       //driver.findElement(By.id("search_query_top")).sendKeys(notValid);
      // homePage.typesInvalidItem();


    //}



}
