package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page.*;

public class StepsFillForSampleapp {

    @Quando("preencho o formulario {string} e pressione next")
    public void insertForm(String form) throws InterruptedException {
        switch (form.toLowerCase()) {
            case "enter vehicle data":
                new PageVehicleSampleapp().fillFormVehicleData();
                new PageHomeSampleapp().nextButton("enterinsurantdata");
                Thread.sleep(4000);
                break;
            case "enter insurant data":
                new PageInsurantSampleapp().fillInsuratForm();
                new PageHomeSampleapp().nextButton("enterproductdata");
                Thread.sleep(4000);
                break;
            case "enter product data":
                new PageProductSampleapp().insertProductForm();
                new PageHomeSampleapp().nextButton("selectpriceoption");
                Thread.sleep(4000);
                break;
            case "select price option":
                new PagePriceOptionSampleapp().insertPlan();
                new PageHomeSampleapp().nextButton("sendquote");
                Thread.sleep(4000);
                break;
            default:
                Assert.fail("Formulario informado não existe.");
                break;
        }

    }


    @E("preencho o fomrulario Send Quote e pressione Send")
    public void insertSendQuoteForm() {
        new PageSendQuoteSampleapp().QuoteForm();
        new PageSendQuoteSampleapp().emailSeending();
    }
}
