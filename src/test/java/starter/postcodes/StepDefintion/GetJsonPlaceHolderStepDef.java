package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.GetJsonPlaceHolder;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class GetJsonPlaceHolderStepDef {
    @Steps
    GetJsonPlaceHolder getJsonPlaceHolder;

    @When("user want to Get Json PlaceHolder")
    public void userwanttoGetJsonPlaceHolder() {
        getJsonPlaceHolder.userwanttoGetJsonPlaceHolder();
    }
    @Then("user get JsonPlaceHolder")
    public void usergetJsonPlaceHolder(){
        SerenityRest.then()
                .statusCode(200);

        seeThatResponse("ok",
                response -> {
                    response.statusCode(200);
                });
    }
}
