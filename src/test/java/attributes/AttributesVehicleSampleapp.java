package attributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class AttributesVehicleSampleapp extends BasePage {

    @FindBy(id = "make")
    protected WebElement selectMake;

    @FindBy(id = "model")
    protected WebElement selectModel;

    @FindBy(id = "numberofseats")
    protected WebElement selectNumberOfSeats;

    @FindBy(id = "fuel")
    protected WebElement selectFuel;

    @FindBy(id = "numberofseatsmotorcycle")
    protected WebElement selectNumberofSeatsMotorcycle;

    @FindBy(id = "engineperformance")
    protected WebElement fieldEnginePerformance;

    @FindBy(id = "cylindercapacity")
    protected WebElement fieldCylinderCapacity;

    @FindBy(id = "listprice")
    protected WebElement fieldListprice;

    @FindBy(id = "licenseplatenumber")
    protected WebElement fieldLicensePlateNumber;

    @FindBy(id = "annualmileage")
    protected WebElement fieldAnnualMileage;

    @FindBy(id = "payload")
    protected WebElement fielPayLoad;

    @FindBy(id = "totalweight")
    protected WebElement fieldTotalWeight;

    @FindBy(xpath = "//a[contains(@class,'prev')]")
    protected WebElement buttonPreviousMonth;

    @FindBy(xpath = "//a[contains(@class,'-next')]")
    protected WebElement buttonNextMonth;

    @FindBy(id = "opendateofmanufacturecalender")
    protected WebElement buttoncalendar;

    @FindBy(xpath = "//span[contains(@class,'month')]")
    protected WebElement actualMonth;

    @FindBy(xpath = "//span[contains(@class,'year')]")
    protected WebElement actualYear;

    protected WebElement selectDay(String dia){
        return findElementByXpath("//a[contains(text(),'"+dia+"')]");
    }

    protected WebElement selectDriven(String option){
        return findElementByXpath("//input[contains(@id,'righthanddrive"+option+"')]/..//span[@class='ideal-radio']");
    }

}
