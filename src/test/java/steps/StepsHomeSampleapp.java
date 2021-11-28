package steps;

import io.cucumber.java.pt.Entao;
import page.PageHomeSampleapp;

public class StepsHomeSampleapp {
    @Entao("valido que o email foi enviado com sucesso")
    public void validateEmail() {
        new PageHomeSampleapp().checkEmail();
    }


}
