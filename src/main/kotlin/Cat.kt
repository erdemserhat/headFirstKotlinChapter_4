import java.math.BigInteger

class Cat(val name:String, age_param:Int) {
    val age=age_param
    var type="cat is a cat" //Default value
    lateinit var eyeColor: BigInteger

    // var eyeColor:String
}