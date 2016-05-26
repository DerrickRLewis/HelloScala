import scala.io.Source

/**
  * Created by admin on 5/22/16.
  */
object FileIO {

  def main(args: Array[String]) {


    val cities = Source
      .fromFile("myData")
      .getLines.toList

    cities.foreach(line => println(line))

    println
    cities.zipWithIndex.foreach( line => println(s"Line ${line._2}: ${line._1}") )
    
  }



}
