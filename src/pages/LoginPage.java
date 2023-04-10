package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;




public class LoginPage extends PageObject {

    @FindBy(id = "user_login_email")
    private WebElementFacade emailField;

    @FindBy(id = "user_login_continue")
    private WebElementFacade loginContinueButton;

    @FindBy(id = "user_login_password")
    private WebElementFacade passwordField;

    @FindBy(css = ".field-value.js-personal-details-name")
    private WebElementFacade verifyUserIsLoggedIn;



    public void setEmailField(String value) {
        typeInto(emailField, value);
    }

    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }

    public void clickLoginContinueButton() {
        clickOn(loginContinueButton);
    }

    public String getVerifyUserIsLoggedIn(){ return verifyUserIsLoggedIn.getText();}

}




