Feature:checking Add to cart  option working as per expected
  @add
  Scenario:verifying user is able to add an item to the cart
    Given user is in homepage
    When user clicks on Dresses
    And clicks on summer dresses
    And clicks on printed dress
    And clicks on Add to cart button
    Then user is able to add the product successfully and view a message "Product successfully added to your shopping cart"
    When user navigates back
    And user is able to view the cart option in the homepage to be updated with the number of  product in the cart "Cart"

