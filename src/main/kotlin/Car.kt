class Car (color_param:String,model_param:Int) {
    var color=color_param
        set(value) {
            if (value.length>1) field=value
        }


    val model=model_param

    fun printInfo(){
        println("Color:$color and Model:$model")
    }

    init {
        println("car (model:$model) is created")
    }
}