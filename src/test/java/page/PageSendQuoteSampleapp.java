package page;


import attributes.AttributesSendQuoteSampleapp;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateName;
import utils.GenerateTelephone;
import static utils.Utils.getPropertySettings;
public class PageSendQuoteSampleapp extends AttributesSendQuoteSampleapp {

    public PageSendQuoteSampleapp() {
        PageFactory.initElements(getDriver() , this);
    }

    /**
     *  Preenche o formulario cotacao
     *
     */
    public void QuoteForm() {
        setText(fieldEmail,GenerateName.getRandomName() + "@mailinator.com");
        setText(fieldPhone, GenerateTelephone.telephoneRandon());
        setText(fieldUsername, "Auto" + GenerateName.getRandomName());
        setText(fieldPassword,getPropertySettings("Sampleapp.data.password"));
        setText(fieldConfirmPassword,getPropertySettings("Sampleapp.data.confirmPassword"));
        setText(textAreaComments,getPropertySettings("Sampleapp.data.comments"));
    }

    /**
     * Realiza envio do email
     */
    public void emailSeending(){
        click(buttonSend);
    }

}
