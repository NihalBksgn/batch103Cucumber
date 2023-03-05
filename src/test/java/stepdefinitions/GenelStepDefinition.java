package stepdefinitions;

import io.cucumber.java.en.Then;
import utilities.ReusableMethods;

public class GenelStepDefinition {
    @Then("ekran goruntusu al")
    public void ekran_goruntusu_al(){
        ReusableMethods.getScreenshot("ekran_goruntusu");
    }

}
