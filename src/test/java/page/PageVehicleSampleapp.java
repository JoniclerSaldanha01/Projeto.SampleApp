package page;

import attributes.AttributesVehicleSampleapp;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import static utils.Utils.getPropertySettings;

public class PageVehicleSampleapp extends AttributesVehicleSampleapp {

    public PageVehicleSampleapp() {
        PageFactory.initElements(getDriver() , this);
    }

    /**
     * Preenche formuçário dados veicular
     */
    public void fillFormVehicleData() {
        select(selectMake , getPropertySettings("Sampleapp.data.make"));
        select(selectModel , getPropertySettings("Sampleapp.data.model"));
        setText(fieldCylinderCapacity , getPropertySettings("Sampleapp.data.cylinderCapacity"));
        setText(fieldEnginePerformance , getPropertySettings("Sampleapp.data.engine"));
        inserDteDate(getPropertySettings("Sampleapp.data.date"));
        select(selectNumberOfSeats , getPropertySettings("Sampleapp.data.seats"));
        click(selectDriven(getPropertySettings("Sampleapp.data.rightHandDriven")));
        select(selectNumberofSeatsMotorcycle , getPropertySettings("Sampleapp.data.numberofSeatsMotorcycle"));
        select(selectFuel , getPropertySettings("Sampleapp.data.fuelType"));
        setText(fielPayLoad , getPropertySettings("Sampleapp.data.payLoad"));
        setText(fieldTotalWeight , getPropertySettings("Sampleapp.data.totalWeight"));
        setText(fieldListprice , getPropertySettings("Sampleapp.data.price"));
        setText(fieldLicensePlateNumber , getPropertySettings("Sampleapp.data.plate"));
        setText(fieldAnnualMileage , getPropertySettings("Sampleapp.data.annualMileage"));
    }

    /**
     * Seleciona a data de fabricação através do calendario
     * @param date
     */
    private void inserDteDate(String date) {
        moveToElement(buttoncalendar);
        click(buttoncalendar);
        String[] Date = date.split("/");
        verifyDate(Integer.valueOf(Date[1]) , Integer.valueOf(Date[2]));
        click(selectDay(Date[0]));

    }

    /**
     * Verifica data para caso seja necessario altera
     *
     * @param year
     * @param month
     */
    private void verifyDate(int month , int year) {
        int actualyear = Integer.valueOf(getText(actualYear));

        while (actualyear != year) {
            if (actualyear > year) {
                click(buttonPreviousMonth);
            } else {
                click(buttonNextMonth);
            }
            actualyear = Integer.valueOf(getText(actualYear));
        }

        int actualmonth = month(getText(actualMonth));
        while (actualmonth != month) {
            if (actualmonth > month) {
                click(buttonPreviousMonth);
            } else {
                click(buttonNextMonth);
            }
            actualmonth = month(getText(actualMonth));
        }
    }

    /**
     * Convert o mes para int
     * @param monthName
     * @return
     */
    private int month(String monthName) {
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
