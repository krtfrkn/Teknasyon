package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TestPage;

public class Scenario6 {

    TestPage testPage = new TestPage();

    @And("click notification")
    public void clickNotification() {
        testPage.notification.click();
    }

    @When("click incoming message")
    public void clickIncomingMessage() {
        testPage.incomingMessage.click();
    }

    @Then("verify that notification bar area is open")
    public void verifyThatNotificationBarAreaIsOpen() {
        Assert.assertTrue(testPage.notificationBarPageTitle.getText().equals("App/Notification/IncomingMessage"));
    }


}
