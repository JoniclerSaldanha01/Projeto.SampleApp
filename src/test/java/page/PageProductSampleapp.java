package page;

import attributes.AttributesProductSampleapp;
import org.openqa.selenium.support.PageFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static utils.Utils.getPropertySettings;
public class PageProductSampleapp extends AttributesProductSampleapp {

    public PageProductSampleapp() {
        PageFactory.initElements(getDriver() , this);
    }

    /**
     * Preenche dados do formulário dados de produtos
     */
    public void insertProductForm() {
        insertDate(getPropertySettings("Sampleapp.data.startDate"));
        select(selectInsuranceSum , getPropertySettings("Sampleapp.data.insuranceSum"));
        select(selectMeritRating , getPropertySettings("Sampleapp.data.meritRating"));
        select(selectDamageInsurance , getPropertySettings("Sampleapp.data.damageInsurance"));
        click(selectProducts(getPropertySettings("Sampleapp.data.products")));
        select(selectCourtesyCar, getPropertySettings("Sampleapp.data.courtesyCar"));
    }

    /**
     * Seleciona a data de fabricação através do calendario
     *
     * @param date
     */
    private void insertDate(String date) {
        moveToElement(buttoncalendar);
        click(buttoncalendar);
        String[] Date = date.split("/");
        dateVery(Integer.valueOf(Date[1]) , Integer.valueOf(Date[2]));
        click(selectDay(Date[0]));

    }

    /**
     * Verifica a data para caso necessario altera
     *
     * @param year
     * @param month
     */
    private void dateVery(int month , int year) {
        int actualyear = Integer.valueOf(getText(actualYear));

        while (actualyear != year) {
            if (actualyear > year) {
                click(buttonPreviousMonth);
            } else {
                click(buttonNextMonth);
            }
            actualyear = Integer.valueOf(getText(actualYear));
        }

        int actualmonth = insertMonth(getText(actualMonth));
        while (actualmonth != month) {
            if (actualmonth > month) {
                click(buttonPreviousMonth);
            } else {
                click(buttonNextMonth);
            }
            actualmonth = insertMonth(getText(actualMonth));
        }
    }

    /**
     * Convert o mes para int
     * @param monthName
     * @return
     */
    private int insertMonth(String monthName) {
        Date date = null;
        try {
            date = new SimpleDateFormat("MMMM" , Locale.US).parse(monthName);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.get(Calendar.MONTH);
        return cal.get(Calendar.MONTH) + 1;
    }


}
