import java.awt.geom.CubicCurve2D

fun main() {
    var person=Human("Sharon Akoth",21,60.5.toFloat())
   person.eat(2)
    person.speak("I enjoy codding in Kotlin")
    person.birthday()
    var employee=User("Sharon","Akoth","oitosharonakoth@gmail.com","0701219609","shorn001")
    println(employee.password)
    println(employee.email)
}
class Human(var name:String,var age:Int,var Weight:Float){
    fun eat(foodWeight:Int){
println("I am eating $foodWeight kgs of food ")
   Weight= Weight+ foodWeight
        println(Weight)
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age=age + 1
        println(age)
    }
}
data class User(val firstName:String,val lastName:String,var email:String,var phoneNumber:String,var password:String)