package Pages;

import Utils.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Hooks.driver;

public class HomePage   {

    @FindBy(tagName = "body")
    private WebElement text;

    @FindBy(id = "search_query_top")
    private WebElement search;

    @FindBy(xpath = "//button[@name='submit_search']")
       private WebElement clickOn;

    @FindBy(xpath = "//a[@class='login']")
    private WebElement signIn;















    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isUserInHomePage() {
        return text .getText().contains(("Automation Practice Website"));

    }

    public void UserSearchType(String text) {
        search.sendKeys(text);
    }

    public void UserclicksOnSearchIcon() {
        clickOn.click();
    }

    public void UserSearchTypeInvalid(String text1) {
        search.sendKeys(text1);
    }

    public void UserclicksOnSignIn() {
        signIn.click();

    }
}

