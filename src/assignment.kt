fun main() {
    var info=Human ("Blessed",23,49.50.toFloat() )
    info.eat(2)
    info.speak("I enjoy coding")
    info .birthday()
    var patient =User ("Precious","Angel","preciousangel@gmail.com","0110023450","blessed")
    println(patient.phoneNumber)
    println(patient.lastName )
}
class Human(var name:String,var age:Int , var weight:Float){
    fun eat(foodWeight: Int){
        weight=foodWeight +weight
        println("I am eating $foodWeight kgs of food")
        println(weight )
    }
    fun speak(speech: String ){
        println(speech )
    }
    fun birthday(){
        println(age+1)
    }
}
data class User(val firstName:String,val lastName:String,var email:String,val phoneNumber:String,var passWord:String){

}
