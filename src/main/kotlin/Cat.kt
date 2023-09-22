import java.math.BigInteger

class Cat(val name:String, age_param:Int) {
    val age=age_param
    var type="cat is a cat" //Default value
    lateinit var eyeColor: BigInteger
    val nameInEnglish:String
        get() = name

    // var eyeColor:String
}