package example


object Translator{
  type Sugar = Int
  case class Order(drink: DrinkType, sugars: Sugar, hasStick: Boolean)
  sealed trait DrinkType
  case object Tea extends DrinkType
  case object Chocolate extends DrinkType
  case object Coffee extends DrinkType

  def translate(input: Order): String = {
    val checkDrink = input.drink match {
      case Tea => "T"
      case Chocolate => "H"
      case Coffee => "C"
    }

    val checkSugar = if (input.sugars == 0) "" else input.sugars.toString
    val checkStick = if (input.hasStick) "0" else ""

    s"$checkDrink:$checkSugar:$checkStick"
  }
}