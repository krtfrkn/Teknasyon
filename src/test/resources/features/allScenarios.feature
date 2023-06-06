Feature: Feature

  Background:

  @scenario1
  Scenario: check Action Bar Tabs page
    Given go to app
    And click action bar
    When click action bar tabs
    Then verify that toggle tab mode is passive
    And if toggle tab is passive, make it active
    And add 3 tabs
    Then verify that given number of tabs are added
    And remove last tab
    Then verify that the last tab is removed
    And remove all tabs
    Then verify that there is no existing tab

  @scenario2
  Scenario: check Custom Title
    Given go to app
    And click activity
    When click custom title
    Then verify that default text is "Left is best" for left in textBox
    Then verify that default text is "Right is always right" for right in textBox
    Then verify that default textBox and navigationBar are same
    When change the text in left and right input boxes
    Then verify that left and right navigationBar texts are changed with given texts

  @scenario3
  Scenario: check List dialog
    Given go to app
    And click alert dialog
    And click list dialog
    When click 1. number of dialog
    Then verify that the order and name of the selected element is same in the alert message

  @scenario4
  Scenario: check Context menu
    Given go to app
    And click fragment
    And click context menu
    When click long press button
    Then verify that if Menu A and Menu B are present

  @scenario5
  Scenario: check hide and show
    Given go to app
    And click fragment
    When click hide and show
    Then verify that 2 text box and hide buttons are ready on the page
    And click 2. hide button
    Then verify that 2. text box is hidden and hide button became show
    And click on show button
    Then verify that text box is exist and show button became hide

  @scenario6
  Scenario: check notification
    Given go to app
    And click notification
    When click incoming message
    Then verify that notification bar area is open

  @scenario7
  Scenario: check
    Given go to views
    And click "Tabs"
    And click "5. Scrollable"
    And click the last tab
    Then verify that the text is changed based on the tab number