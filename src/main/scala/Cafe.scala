/**
  * Created by Amine Sagaama on 11/03/2017.
  */
class Cafe {

  def buyCoffee(cc: CreditCard): (Coffee, Charge) = {


    val cup = new Cofee();

    (cup, Charge(cc, cup.price))
  }

}
