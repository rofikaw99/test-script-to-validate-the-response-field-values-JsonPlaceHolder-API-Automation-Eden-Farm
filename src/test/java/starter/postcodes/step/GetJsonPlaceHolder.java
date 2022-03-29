package starter.postcodes.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.setDefaultRequestSpecification;

public class GetJsonPlaceHolder {
    public String URLjsonPlaceHolder="https://jsonplaceholder.typicode.com/todos/1";

    @Step
    public void userwanttoGetJsonPlaceHolder(){

        SerenityRest.given()
                .when()
                .get(URLjsonPlaceHolder);
    }
}
