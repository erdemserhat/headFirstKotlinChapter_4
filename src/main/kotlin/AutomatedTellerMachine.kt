import java.util.Scanner

fun main(args:Array<String>) {
    val scanner:Scanner=Scanner(System.`in`)
    println("Please register...")

    print("Name:")
    val name:String=scanner.next()

    print("Surname")
    val surname:String=scanner.next()

    print("Age:")
    val age:Int=scanner.nextInt()

    print("ID:")
    val id:Int=scanner.nextInt()

    print("Credit:")
    val credit:Int=scanner.nextInt()


    val user:User=User(name,surname,age,id,credit)
    user.showMenu()

}