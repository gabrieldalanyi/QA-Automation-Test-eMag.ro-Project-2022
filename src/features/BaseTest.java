package features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HomeSteps;
import steps.LoginSteps;
import steps.ProductSteps;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected HomeSteps homeSteps;
    @Steps
    protected ProductSteps productSteps;




    @Before
    public void init() {
        driver.manage().window().maximize();
        driver.get("https://emag.ro");

    }
}

