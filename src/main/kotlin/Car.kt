class Car(brand: String, model: String, year: Int) {
    // Properties taking parameters from the constructor.
    var brand: String = brand
        get() {
            println("Brand property is called.")
            return field
        }
        set(value) {
            println("Brand property is updated.")
            field = value
        }

    var model: String = model
        get() {
            println("Model property is called.")
            return field
        }
        set(value) {
            println("Model property is updated.")
            field = value
        }

    var year: Int = year
        get() {
            println("Year property is called.")
            return field
        }
        set(value) {
            println("Year property is updated.")
            field = value
        }

    // Other methods or operations can be defined here.
}

fun main() {
    val car = Car("Toyota", "Camry", 2023)
    println("Car Brand: ${car.brand}")
    println("Car Model: ${car.model}")
    println("Year of Manufacture: ${car.year}")

    car.brand = "Honda"
    car.year = 2024

    println("Car Brand (Updated): ${car.brand}")
    println("Year of Manufacture (Updated): ${car.year}")
}
