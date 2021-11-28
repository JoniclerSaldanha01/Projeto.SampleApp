package page;


import attributes.AttributesHomeSampleapp;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class PageHomeSampleapp extends AttributesHomeSampleapp {

    public PageHomeSampleapp() {
        PageFactory.initElements(getDriver() , this);
    }

    /**
     * Acessa o próximo formulario
     */
    public void nextButton(String nextPage){
        click(buttonNext(nextPage));

    }

    /**
     * Valida email enviado com sucesso
     */
    public void checkEmail() {
        implicitWait(resultSendingEmail,10);
        Assert.assertEquals("Sending e-mail success!",getText(resultSendingEmail));
    }
}
