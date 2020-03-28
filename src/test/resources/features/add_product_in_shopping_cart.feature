Feature:Adding products to the shopping cart

  @AddingTechnologicalProductsToTheShoppingCart
  Scenario Outline: Validation of adding products to the shopping cart
    Given The user is in the <product> product
    When he will add the technological product to the shopping cart
      | amount | 1 |
    Then the valid that the product is registered
    Examples:
      | product                       |
      | Iphone 11 Pro 64GB - Negro    |

  @AddingClothingProductsToTheShoppingCart
  Scenario Outline: Validation of adding products to the shopping cart
    Given The user is in the <product> product
    When he will add the clothing product to the shopping cart
      | amount | 1 |
      | size   | M |
    Then the valid that the product is registered
    Examples:
      | product                                 |
      | Polera Con Capucha New York 45 Rojo     |

  @AddingProductsToTheShoppingCart2
  Scenario Outline: Validation of adding products to the shopping cart
    Given the user is in the <product> product, search 2
      | color                  | Azul            |
      | condition              | Reacondicionado |
      | international_delivery | No              |
    When he will add the product to the shopping cart
      | quantity | 2 |
    Then the valid that the product is registered
    Examples:
      | product   |
      | IPhone 11 |
      | Reloj MK  |