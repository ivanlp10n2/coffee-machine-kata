package example

import example.Translator.{Chocolate, Coffee, Order, Tea, translate}

class TranslatorSpec extends munit.FunSuite {
  test("returns T:1:0 when 1 tea with 1 sugar and a stick") {
    val input = Order(Tea, 1, true)
    val output = "T:1:0"
    assertEquals(translate(input), output)
  }

  test("returns H:: when 1 chocolate with no sugar and no stick"){
    val input = Order(Chocolate, 0, false)
    val output = "H::"
    assertEquals(translate(input), output)
  }

 test("returns C:2:0 when 1 coffee with 2 sugar and a stick"){
    val input = Order(Coffee, 2, true)
    val output = "C:2:0"
    assertEquals(translate(input), output)
  }
}
