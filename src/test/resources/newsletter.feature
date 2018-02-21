Feature:checking the signup newsletter functionality
  Background: user is in homepage
  @newsletter
  Scenario: verifying the user is able to signup newletter successfully
    When user enters valid email address
    And clicks on Subscribe button
    Then user is able to subscribe successfully and view message "You have successfully subscribed to this newsletter"
    When user navigates back

  @notSubscribeNewsletter
  Scenario Outline: verifying the user is not  able to signup newsletter successfully
    When user enters  email address "<Email>"
    And clicks on Subscribe button
    Then user is  not able to subscribe and view a message "<Error>"
    When user navigates back
    Examples:
      | Email              | Error                                     |
      | surprise@gmail.com | This email address is already registered. |
      | Email   11         | Invalid email address                     |
