import java.util.*

class User(name_param:String, salary_param:Int) {
    var name=name_param
        get() { return name.length.toString() }
        set(value) {
            field = if (name.length<3) "" else value
        }
}