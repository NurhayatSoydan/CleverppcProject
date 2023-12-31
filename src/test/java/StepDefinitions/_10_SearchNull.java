package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class _10_SearchNull {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @When("user search with null")
    public void userSearchWithNull() {

        ln.MysendKeys(ln.search, "" + Keys.ENTER);
    }

    @Then("warning message should be displayed")
    public void warningMessageShouldBeDisplayed() {

        dc.VerifycontainsText(dc.alertText, "keyword");
    }
}
