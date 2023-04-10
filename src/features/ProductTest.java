package features;

import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test

    public void searchForNewProduct(){
        homeSteps.acceptCookieButton();
        homeSteps.searchField("casti");
        homeSteps.waitABit(2000);
        productSteps.productInAirPodsGoFit();
        productSteps.productInAirWhiteGoFit();
        productSteps.addFavoriteButton();

    }
}
