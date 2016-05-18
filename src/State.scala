
class State (size:Int , age: Int ,name:String) {
val sqMi : Int = size
  var est: Int = age
  var stateName : String= name
  /**
    * This is the State Class
    */

  override def toString = s"State($sqMi, $est, $stateName)"
}
