/**
  * Created by Amine Sagaama on 11/03/2017.
  */
class Cafe {

  def buyCoffee(cc: CreditCard, p: Payments): Coffee = {


    val cup = new Cofee();

    p.charge(cc, cup.price)

    cup
  }

}
