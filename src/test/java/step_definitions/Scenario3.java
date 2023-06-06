package step_definitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import pages.TestPage;
import utilities.Driver;
import utilities.MobileUtilities;

import java.util.List;

public class Scenario3 {

    TestPage testPage = new TestPage();
    MobileElement el;
    String indexOfDialog;
    String textOfDialog;
    @And("click alert dialog")
    public void clickAlertDialog() {
        testPage.alertDialog.click();
    }

    @When("click list dialog")
    public void clickListDialog() {
        testPage.listDialog.click();
    }

    @When("click {int}. number of dialog")
    public void clickNumberOfDialog(int num) {
        el = Driver.get().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView["+num+"]"));
        //indexOfDialog = el.getAttribute("index");
        textOfDialog = el.getText();
        el.click();
    }

    @Then("verify that the order and name of the selected element is same in the alert message")
    public void verifyThatTheOrderAndNameOfTheSelectedElementIsSameInTheAlertMessage() {
        String alertMessage = testPage.dialogAlertMessage.getText();
        String numInAlertMessage = alertMessage.substring(14,15);
        String textInAlertMessage = alertMessage.substring(18,alertMessage.length());
        //Assert.assertTrue(indexOfDialog.equals(numInAlertMessage));
        Assert.assertTrue(textOfDialog.equals(textInAlertMessage));
    }


}
