package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import java.util.concurrent.TimeUnit;

public class Stepdefs {

	Belly belly = new Belly();

	@Given("^I have (\\d+) cukes in my belly$")
	public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
		belly.eat(cukes);
	}

	@When("^I wait (\\d+) moment$")
	public void i_wait_moment(int arg1) throws Exception {
		TimeUnit.SECONDS.sleep(arg1);
	}

	@Then("^my belly should growl$")
	public void my_belly_should_growl() throws Exception {
		belly.grow();
	}
}
