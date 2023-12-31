package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _11_BestSellersPage {


    DialogContent dc=new DialogContent();

    @When("user clicks on best sellers")
    public void userClicksOnBestSellers() {

        dc.Myclick(dc.bestSellersButton);
    }

    @Then("best sellers page should be displayed")
    public void bestSellersPageShouldBeDisplayed() {

        dc.VerifycontainsText(dc.bestSellerText, "TOP SELLERS");
    }
}
