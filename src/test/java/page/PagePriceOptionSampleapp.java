package page;

import attributes.AttributesPriceOptionSampleapp;
import org.openqa.selenium.support.PageFactory;
import static utils.Utils.getPropertySettings;

public class PagePriceOptionSampleapp extends AttributesPriceOptionSampleapp {

    public PagePriceOptionSampleapp() {
        PageFactory.initElements(getDriver() , this);
    }

    /**
     *  Seleciona o plano
     */
    public void insertPlan() {
        click(planRadioButton(getPropertySettings("Sampleapp.data.planType")));
    }

}
