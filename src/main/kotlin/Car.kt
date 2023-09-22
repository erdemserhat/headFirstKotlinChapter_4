class Car (color_param:String,model_param:Int) {
    val color=color_param
    val model=model_param

    fun printInfo(){
        println("Color:$color and Model:$model")
    }

    init {
        println("car (model:$model) is created")
    }
}