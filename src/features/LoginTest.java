package features;

import org.junit.Before;
import org.junit.Test;
import utils.Constans;

public class LoginTest extends BaseTest{



    @Test
    public void loginWithValidCredentialsTest() {

        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.clickLogin();
        loginSteps.waitABit(10000);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.waitABit(15000);
        loginSteps.verifyUserIsLoggedIn("Gabriel Dalanyi");




    }
    @Before
    public void init() {
        driver.manage().window().maximize();
        driver.get("https://auth.emag.ro/user/login");

    }
}
