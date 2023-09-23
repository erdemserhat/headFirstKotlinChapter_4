import java.lang.Exception
import java.util.*

class User(name: String, surname: String, age: Int, id: Int, private var credit: Int) {
    init {
        credit=0
    }
    private var name=name
        set(value){
            field=if (value.isNotEmpty()) name else throw Exception("Please enter a valid name")
        }
        get() {
            return field.uppercase(Locale.getDefault())
        }
    private var surname=surname
        set(value){
            field=if (value.isNotEmpty()) surname else throw Exception("Please enter a valid surname")
        }
        get() = field.toUpperCase(Locale.getDefault())

    private var age=age
        set(value) {
            field=if (age>=18) value else throw Exception("You should older than 18 to use Bank")

        }

    fun depositMoney(amount:Int){
        credit=credit+amount
    }
    fun withdrawMoney(amount:Int){
        credit=credit-amount
    }

    fun showCreditInfo(){
        println("Credit = $credit")
    }
    fun showMenu(){
        println("To Deposit Enter 1")
        println("To Withdraw Enter 2")
        println("To Show Credit Info Enter 3")
        print("Type here:")
        val scanner:Scanner=Scanner(System.`in`)
        var answer:Int=scanner.nextInt()
        var amount=0

        if (answer==1){
            print("How much money do you want to deposit :")
            amount=scanner.nextInt()
            depositMoney(amount)
        }else if (answer==2){
            print("How much money to you want to withdraw :")
            amount=scanner.nextInt()
            withdrawMoney(amount)
        }else if (answer==3){
            showCreditInfo()
        }
        println()
        showMenu()
    }

}