/**
  * Created by Amine Sagaama on 11/03/2017.
  */
class Cafe {

  def buyCoffee(cc: CreditCard): (Coffee, Charge) = {


    val cup = new Cofee();

    (cup, Charge(cc, cup.price))
  }

  case class Charge(cc: CreditCard, amount: Double) {

    def combine(other: Charge): Charge = {

      if (cc == other.cc)
        Charge(cc, amount + other.amount)
      else
        throw new Exception("Can't combine charges to different cards")
    }
  }

}
