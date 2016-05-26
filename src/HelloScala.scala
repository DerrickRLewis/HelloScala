/**
  * Created by admin on 5/17/16.
  */
object HelloScala {

  def main(args: Array[String]) = {

    val tennessee = new State(42,1796,"Tennessee")
    val nashville = new City (526,1806,"Nashville")
    val mainStreet= new Street(4,1807,"Main Street")




    //override def toString: String  ={


      //return
    println( s"  The state of  ${tennessee} ,the city of ${nashville} and the street of ${mainStreet} ")


    }






}