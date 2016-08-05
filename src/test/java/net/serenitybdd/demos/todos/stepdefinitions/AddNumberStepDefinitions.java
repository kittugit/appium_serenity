package net.serenitybdd.demos.todos.stepdefinitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.demos.todos.steps.CalculatorUser;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class AddNumberStepDefinitions {
	
	@Managed(driver = "appium")
    WebDriver calculatorApp;
	
	 @Steps CalculatorUser calculatorUser;
	
    @Given("I am on the calculator app")
    public void i_need_to(String doSomething) throws Throwable {
    	calculatorUser.opens_the_calculator_application();
    	calculatorUser.del_value();
    }

   

    @When("I press number 2 and 3")
    public void i_add_the_todo_action(String actionName) throws Throwable {
    	calculatorUser.enter_number("2");
    	calculatorUser.enter_number("+");
    	calculatorUser.enter_number("3");
    	calculatorUser.enter_number("=");
    }

    @Then("result should show 5")
    public void action_should_appear_in_my_todo_list(String action) throws Throwable {
    	calculatorUser.should_see_the_result("5");
    }

}
