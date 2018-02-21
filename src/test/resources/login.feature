Feature:checking the login functionality
@login1
  Scenario: Verify user is able to  Login successfully
  Given user is in homepage
  When user clicks on Sign in button
  And  user enters email address "choclate@gmail.com" and password "toffeesnacks"
  And clicks on Sign in button
  Then User should able to login successfully and view am messgae "Welcome to your account"
  When user navigates back

  @Notlogin
  Scenario Outline: Verify user is not able to register with invalid details
    Given user is in homepage
    When user clicks on Sign in button
    And user enters "<Email address>" and "<Password>"
    And clicks on Sign in button
    Then user is not able to register with the "<Error message>"
    When user navigates back
    Examples:
      | Email address  | Password | Error message              |
      |                | toffees11| An email address required. |
      | test@gnail.com |          | Password is required.      |
      |                |          | An email address required. |

  @login2
  Scenario: verifying  forgot the password functionality working as per expected
    Given user is in homepage
    When user clicks on Sign in button
    And user clicks on Forgot your password
    And  enters the email address "test11@gmail.com"
    And user clicks on Retrieve password
    Then user is able to land on a page with message "A confirmation email has been sent to your address"
    When user navigates back
