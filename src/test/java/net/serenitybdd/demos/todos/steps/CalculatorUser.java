package net.serenitybdd.demos.todos.steps;

import static org.assertj.core.api.StrictAssertions.assertThat;

import net.serenitybdd.demos.todos.pages.CalculatorPage;
import net.thucydides.core.annotations.Step;

public class CalculatorUser {


    @Step
    public void opens_the_calculator_application() {
    	calculatorPage.open();
    }

    CalculatorPage calculatorPage;

    @Step
    public void del_value() {
    	calculatorPage.pressButton("del");;
    }

    @Step
    public void enter_number(String number) {
    	calculatorPage.pressButton(number);;
    }
    
   
    
    @Step
    public void calculate_value() {
    	calculatorPage.pressButton("=");;
    }

    @Step
    public void should_see_the_result(String number) {
        assertThat(calculatorPage.getTextValue().equals(number));
    }

}
