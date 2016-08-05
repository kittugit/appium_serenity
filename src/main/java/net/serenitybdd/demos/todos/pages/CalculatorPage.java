package net.serenitybdd.demos.todos.pages;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CalculatorPage extends PageObject {
	
	
	public void pressButton(String buttonName){
		
		WebElementFacade numberButton = this.find( MobileBy.name( "buttonName" ) )
                .withTimeoutOf( 10, TimeUnit.SECONDS );
		numberButton.click();
	}
	
	public String getTextValue(){
		return this.find(MobileBy.className("android.widget.EditText")).getText();
		
	}

}
