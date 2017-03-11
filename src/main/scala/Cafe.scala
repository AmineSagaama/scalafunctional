/**
  * Created by Amine Sagaama on 11/03/2017.
  */
class Cafe {

  def buyCoffee(cc: CreditCard): Coffee = {


    val cup = new Cofee();

    cc.charge(cup.price)

    cup
  }

}
