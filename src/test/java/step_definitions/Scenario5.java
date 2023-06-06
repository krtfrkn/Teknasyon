package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.TestPage;
import utilities.MobileUtilities;

public class Scenario5 {
    TestPage testPage = new TestPage();
    int no;

    @When("click hide and show")
    public void clickHideAndShow() {
        testPage.hideAndShow.click();
    }

    @Then("verify that {int} text box and hide buttons are ready on the page")
    public void verifyThatTextBoxAndHideButtonsAreReadyOnThePage(int num) {

        for (int i=1;i<=num;i++){
            By by = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout["+num+"]/android.widget.LinearLayout/android.widget.EditText");
            Assert.assertTrue(MobileUtilities.isElementPresent(by));
        }
        for (int i=1;i<=num;i++){
            By by = By.id("com.hmh.api:id/frag"+num+"hide");
            Assert.assertTrue(MobileUtilities.isElementPresent(by));
        }

    }

    @And("click {int}. hide button")
    public void clickHideButton(int num) {
        testPage.hideButton(num).click();
    }

    @Then("verify that {int}. text box is hidden and hide button became show")
    public void verifyThatTextBoxIsHiddenAndHideButtonBecameShow(int num){
        no=num;
        Assert.assertTrue(testPage.hideButton(num).getText().equals("SHOW"));
        By by = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout["+num+"]/android.widget.LinearLayout/android.widget.EditText");
        Assert.assertFalse(MobileUtilities.isElementPresent(by));

    }

    @And("click on show button")
    public void clickOnShowButton() {
        testPage.hideButton(no).click();
    }

    @Then("verify that text box is exist and show button became hide")
    public void verifyThatTextBoxIsExistAndShowButtonBecameHide() {
        Assert.assertTrue(testPage.hideButton(no).getText().equals("HIDE"));
        By by = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout["+no+"]/android.widget.LinearLayout/android.widget.EditText");
        Assert.assertTrue(MobileUtilities.isElementPresent(by));
    }


}
