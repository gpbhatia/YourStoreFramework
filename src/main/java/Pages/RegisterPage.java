package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static Utils.Hooks.driver;

public class RegisterPage {

    @FindBy(id = "email_create")
    private WebElement registeremail;

    @FindBy(id = "SubmitCreate")
    private WebElement clickAccount ;

    @FindBy(id = "id_gender2")
    private WebElement radiobutton ;

    @FindBy(id = "customer_firstname")
    private WebElement firstname;

    @FindBy(id = "customer_lastname")
    private WebElement lastname ;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "days")
    private WebElement day;

    @FindBy(id = "months")
    private WebElement months;

    @FindBy(id = "years")
    private WebElement years;

    @FindBy(id = "address1")
    private WebElement addres ;

    @FindBy(id = "city")
    private WebElement city1 ;

    @FindBy(id ="id_state")
    private WebElement state;

    @FindBy(id="postcode")
    private WebElement code;

    @FindBy(id = "phone_mobile")
    private WebElement phone;

    @FindBy(id = "submitAccount")
    private WebElement submit;

    @FindBy(id = "submitAccount")
    private WebElement createAccount;









    public RegisterPage(){
        PageFactory.initElements(driver, this);}

    public void enterEmail() {
        Random r = new Random();
        int val = r.nextInt();
        registeremail.sendKeys("enter" + val + "@gmail.com");

    }

    public void createAnAccountClick() {
        clickAccount.click();
    }

    public void selectRadiobtn() {
        radiobutton.click();
    }

    public void enterDetails(String fname, String lname, String pwd) {
        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        password.sendKeys(pwd);

    }

    public void selectingDayMonthYear(String date, String month, String year) {
        Select Day_dropdown = new Select(day);
        Day_dropdown.selectByIndex(7);

        Select Month_dropdown = new Select(months);
        Month_dropdown.selectByIndex(1);

        Select Year_dropdown= new Select(years);
        Year_dropdown.selectByIndex(49);
    }


    public void enterAddressCity(String address, String city) {
        addres.sendKeys(address);
        city1.sendKeys(city);
    }

    public void selectState() {
        Select state_dropdown= new Select(state);
        state_dropdown.selectByValue(String.valueOf(30));
    }

    public void enterCodeAndMobile(String zip, String mphone) {
        code.sendKeys(zip);
        phone.sendKeys(mphone);

    }

    public void clickRegBtn() {
        createAccount.click();
    }


    public boolean IsMessagePresent(String text) {
        return driver.getPageSource().contains(text);
    }
}
