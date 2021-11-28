package attributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class AttributesInsurantSampleapp extends BasePage {

    @FindBy(id = "country")
    protected WebElement selectCountry;

    @FindBy(id = "occupation")
    protected WebElement selectOccupation;

    @FindBy(id = "firstname")
    protected WebElement fieldFirstName;

    @FindBy(id = "lastname")
    protected WebElement fieldLastName;

    @FindBy(id = "streetaddress")
    protected WebElement fieldStreetAddress;

    @FindBy(id = "zipcode")
    protected WebElement fieldZipCode;

    @FindBy(id = "city")
    protected WebElement fieldCity;

    @FindBy(id = "website")
    protected WebElement fieldWebsite;

    @FindBy(id = "birthdate")
    protected WebElement fieldBirthday;

    protected WebElement selectGender(String gender){
        return findElementByXpath("//input[contains(@id,'gender"+gender+"')]/..//span[@class='ideal-radio']");
    }

    protected WebElement selectHoobies(String hobbies){
        return findElementByXpath("//input[@name = 'Hobbies' and contains(@id,'"+hobbies+"')]/..//span[@class='ideal-check']");
    }


}
