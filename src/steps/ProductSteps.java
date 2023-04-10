package steps;

import net.thucydides.core.annotations.Step;

public class ProductSteps extends BaseSteps {

    @Step
    public void productInAirPodsGoFit(){
        productPage.clickProductInAirPodsGoFit();
    }
    @Step
    public void productInAirWhiteGoFit(){
        productPage.clickProductInAirWhitePodsGoFit();
    }
    @Step
    public void addFavoriteButton(){
        productPage.clickAddFavoriteButton();
    }
}
