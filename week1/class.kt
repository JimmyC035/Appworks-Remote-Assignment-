open class Human(val name :String, var mana :Boolean = true){

   open fun attack(){
        println("$name use Fist Attack!")
    }
}
class Mage(name: String,mana: Boolean) : Human(name,mana){

    override fun attack() {
        if(mana){
            println("$name use Fireball!")
            mana = false
        }else{ //no mana use fist attack instend
            println("Run out of Mana :(")
            super.attack()
        }
    }
}

fun main() {
    val human = Human("human") // a Human name human
    human.attack() // fist attack don't require Mana
    
    val gandalf = Mage("Gandalf",true) //  a Mage name gandalf
    gandalf.attack() // cast spell
    gandalf.attack() // run out of Mana
    gandalf.attack() // still no Mana

}

