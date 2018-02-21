Feature:checking the Register option working as per expected
  @register
  Scenario:Verify user is able to register successfully with valid details
    Given user is in homepage
    When user clicks on Sign in button
    And enters the email address
    And clicks on  create an account button
    And select  the radiobutton Mrs
    And types in firstname "enter" lastname "email" password "donut"
    And select "7" for date "Jan" as  month "1990" as year
    And type in address "test" city "xyz"
    And select state as "New Jersey"
    And type in zipcode as "65770" mobile phone "1234567891"
    And click on REGISTER button
    Then user is able to register and land on the page with the message "Welcome to your account"
    When user navigates back


