package attributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class AttributesProductSampleapp extends BasePage {

    @FindBy(id = "insurancesum")
    protected WebElement selectInsuranceSum;

    @FindBy(id = "meritrating")
    protected WebElement selectMeritRating;

    @FindBy(id = "damageinsurance")
    protected WebElement selectDamageInsurance;

    @FindBy(id = "courtesycar")
    protected WebElement selectCourtesyCar;

    @FindBy(xpath = "//a[contains(@class,'prev')]")
    protected WebElement buttonPreviousMonth;

    @FindBy(xpath = "//a[contains(@class,'-next')]")
    protected WebElement buttonNextMonth;

    @FindBy(id = "openstartdatecalender")
    protected WebElement buttoncalendar;

    @FindBy(xpath = "//span[contains(@class,'month')]")
    protected WebElement actualMonth;

    @FindBy(xpath = "//span[contains(@class,'year')]")
    protected WebElement actualYear;

    protected WebElement selectDay(String dia){
        return findElementByXpath("//a[contains(text(),'"+dia+"')]");
    }

    protected WebElement selectProducts(String option){
        return findElementByXpath("//input[contains(@id,'"+option+"')]/..//span[@class='ideal-check']");
    }

}
