package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class _06_CheckingProductsAddedCart {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    @Given("navigate to dresses page")
    public void navigateToDressesPage() {
        ln.Myclick(ln.dressesBtn);
    }

    @When("User chooses random products")
    public void userChoosesRandomProducts() {
        for (int i = 0; i < 3; i++) {

            int randomDress = (int) (Math.random() * dc.summerDress.size());
            dc.summerDress.get(randomDress).click();
            dc.Myclick(dc.addToCart);
            dc.Myclick(dc.continueShopping);
            GWD.getDriver().navigate().back();
        }
        dc.Myclick(dc.shoppingCart);
    }

    @Then("User verifies that there are three products in shopping cart")
    public void userVerifiesThatThereAreThreeProductsInShoppingCart() {
        Assert.assertTrue(dc.shoppingText.getText().contains("3"));
    }
}
