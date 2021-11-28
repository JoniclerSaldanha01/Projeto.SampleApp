package attributes;

import org.openqa.selenium.WebElement;
import utils.BasePage;

public class AttributesPriceOptionSampleapp extends BasePage {


    protected WebElement planRadioButton(String plan){
        return findElementByXpath("//input[contains(@id,'select"+plan+"')]/..//span");
    }

}
