package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    @Step
    public void setUserEmail(String email) {
        loginPage.setEmailField(email);
    }

    @Step
    public void setPassword(String password) {
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLogin() {
        loginPage.clickLoginContinueButton();
    }
    @Step
    public void verifyUserIsLoggedIn(String userName) {
        Assert.assertEquals("Gabriel Dalanyi", loginPage.getVerifyUserIsLoggedIn());
    }
}
