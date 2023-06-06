package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TestPage;

public class Scenario2 {

    TestPage testPage = new TestPage();

    String newLeft;
    String newRight;
    @And("click activity")
    public void clickActivity() {
        testPage.Activity.click();
    }

    @When("click custom title")
    public void clickCustomTitle() {
        testPage.CustomTitle.click();
    }

    @Then("verify that default text is {string} for left in textBox")
    public void verifyThatDefaultTextIsForLeftInTextBox(String str) {
        Assert.assertTrue(str.equals(testPage.leftTextInputBox.getText()));
    }

    @Then("verify that default text is {string} for right in textBox")
    public void verifyThatDefaultTextIsForRightInTextBox(String str) {
        Assert.assertTrue(str.equals(testPage.rightTextInputBox.getText()));
    }

    @Then("verify that default textBox and navigationBar are same")
    public void verifyThatDefaultTextBoxAndNavigationBarAreSame() {
        String leftBar = testPage.leftNavigationBar.getText();
        String leftInput = testPage.leftTextInputBox.getText();
        String rightBar = testPage.rightNavigationBar.getText();
        String rightInput = testPage.rightTextInputBox.getText();
        Assert.assertEquals(leftInput,leftBar);
        Assert.assertEquals(rightInput,rightBar);
    }

    @When("change the text in left and right input boxes")
    public void changeTheTextInLeftAndRightInputBoxes() {
        newLeft = "This is new left";
        newRight = "This is new right";
        testPage.leftTextInputBox.clear();
        testPage.leftTextInputBox.sendKeys(newLeft);
        testPage.changeLeftButton.click();
        testPage.rightTextInputBox.clear();
        testPage.rightTextInputBox.sendKeys(newRight);
        testPage.changeRightButton.click();
    }

    @Then("verify that left and right navigationBar texts are changed with given texts")
    public void verifyThatLeftAndRightNavigationBarTextsAreChangedWithGivenTexts() {
        String leftBar = testPage.leftNavigationBar.getText();
        String leftInput = testPage.leftTextInputBox.getText();
        String rightBar = testPage.rightNavigationBar.getText();
        String rightInput = testPage.rightTextInputBox.getText();
        Assert.assertEquals(newLeft,leftInput);
        Assert.assertEquals(newRight,rightInput);
        Assert.assertEquals(leftInput,leftBar);
        Assert.assertEquals(rightInput,rightBar);
    }


}
