package attributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class AttributesHomeSampleapp extends BasePage {

    @FindBy(xpath = "//h2")
    protected WebElement resultSendingEmail;

    protected WebElement buttonNext(String nextPage) {
        return findElementByXpath("//button[contains(@id,'next" + nextPage + "')]");
    }

}
