Feature:Adding products to the shopping cart

  @AddingClothingProductsToTheShoppingCart
  Scenario Outline: Validation of adding products to the shopping cart
    Given The user is in the <product> product
    When he will add the clothing product to the shopping cart
      | amount | 1 |
      | size   | M |
    Then he valid that the <product> product is registered
    Examples:
      | product                                      |
      | Polera Con Capucha New York 45 Rojo          |

  @AddingTechnologicalProductsToTheShoppingCart
  Scenario Outline: Validation of adding products to the shopping cart
    Given The user is in the <product> product
    When he will add the technological product to the shopping cart
      | amount | 1 |
    Then he valid that the <product> product is registered
    Examples:
      | product                       |
      | Iphone 11 Pro 64GB - Negro    |
      | Monitor MSI OPTIX G27C4 - 27" |