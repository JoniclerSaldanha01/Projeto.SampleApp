package steps;

import io.cucumber.java.pt.Dado;
import static utils.Hooks.*;

public class StepsLoadSampleapp {

    @Dado("que acessei o sampleapp no chrome")
    public void openSite() {
        openBrowser();
        navigate("url.Sampleapp");
    }
}
