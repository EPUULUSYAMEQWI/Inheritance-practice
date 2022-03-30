fun main() {
    var banker=Banker("Lucy",22)
    var doctor=Doctor("Mearcy",35)
    var farmer=Farmer("Male", 67)
     banker.eat()
    farmer.cultivateLand()
    doctor.eat()
    doctor.treatpatient("epuu","TB")
    var x=banker.countMoney(arrayOf(1,2,3,4))
    println(x)
    doctor.talk("Hello")
    doctor.sleep()
    println(banker is Banker)
    banker.eat()
    banker.introduction()
    doctor.introduction()
    farmer.introduction()










}
open class Person(var name:String,var age:Int ){
    fun top(words:String){
        println(words)
    }

    fun talk(words: String) {
        println(words)
    }

    open fun eat() {
        println("yum")
    }

    fun sleep() {
        println("zzzz")
    }
   open fun introduction(){
        println("Hi,my name is $name")

    }
}

  class Banker( name:String,  age:Int):Person(name,age){

    fun countMoney(notes:Array<Int>):Int{
        var sum = notes.sum()
        return sum
    }
}
class Doctor(name:String, age:Int):Person(name,age){
    fun countMoney(notes: Array<Int>): Int {
            var sum = notes.sum()
            return sum
        }
    fun instruction(){
        override
    }

        fun treatpatient(patient: String, disease: String){
            println("treating $patient for $disease")
        }
    }
    class Farmer(name:String, age:Int):Person(name,age) {

        fun cultivateLand() {
            println("dig dig dig")

        }


        override fun eat() {
            super.eat()
            println("I am eating all the food that i've grown")

        }
    }