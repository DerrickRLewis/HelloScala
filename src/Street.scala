
class Street (size:Int , age: Int ,name:String) {

  val sqMi: Int = size
  var est: Int = age
  var streetName : String= name
  /**
    * This is the street class
    */

  override def toString = s"Street($sqMi, $est, $streetName)"
}
