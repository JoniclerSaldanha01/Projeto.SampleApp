package page;

import attributes.AttributesInsurantSampleapp;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateName;
import static utils.Utils.getPropertySettings;

public class PageInsurantSampleapp extends AttributesInsurantSampleapp {
    public PageInsurantSampleapp() {
        PageFactory.initElements(getDriver() , this);
    }

    /**
     * Realiza preenchimento do formuçário dados do seguro
     */
    public void fillInsuratForm() {
        setText(fieldFirstName , GenerateName.getRandomName());
        setText(fieldLastName , GenerateName.getRandomName());
        setText(fieldBirthday,getPropertySettings("Sampleapp.data.birthDay"));
        click(selectGender(getPropertySettings("Sampleapp.data.gender")));
        setText(fieldStreetAddress , getPropertySettings("Sampleapp.data.streetAddress"));
        select(selectCountry , getPropertySettings("Sampleapp.data.country"));
        setText(fieldZipCode , getPropertySettings("Sampleapp.data.zipCode"));
        setText(fieldCity , getPropertySettings("Sampleapp.data.city"));
        select(selectOccupation , getPropertySettings("Sampleapp.data.occupation"));
        click(selectHoobies(getPropertySettings("Sampleapp.data.hobbies")));
        setText(fieldWebsite , getPropertySettings("Sampleapp.data.website"));
    }

}
