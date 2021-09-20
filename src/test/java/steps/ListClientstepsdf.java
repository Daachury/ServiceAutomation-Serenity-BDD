package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.*;

public class ListClientstepsdf {

    private static String path = "https://jsonplaceholder.typicode.com/posts";

    @Given("Se tiene una configuracion para el servicio")
    public void seTieneUnaConfiguracionParaElServicio() {
        System.out.println("Se Tiene la configuracion Lista!!.");
    }

    @When("Se consume el servicio de listas")
    public void seConsumeElServicioDeListas() {
        given().log()
                .all()
                .contentType("config/application/json")
                .when()
                .header("Content-Type", "application/json")
                .get(path);
    }

    @Then("Se listan conrrectamente los usuarios")
    public void seListanConrrectamenteLosUsuarios() {
        then().assertThat()
                .statusCode(is(equalTo(200)))
                .and()
                .body("code", response -> notNullValue());
        //.extract()
        // .asString();
    }
}
