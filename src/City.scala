
class City (size:Int , age: Int ,name:String) {

  val sqMi : Int = size
  var est: Int = age
  var cityName : String= name
  /**
    * This is the City class.
    */

  override def toString = s"City($sqMi, $est, $cityName)"
}
