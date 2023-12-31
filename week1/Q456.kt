open class Human(val name :String, var mana :Int = 0){

    open fun attack(){
        println("$name use Fist Attack!")
    }
}
class Mage(name: String,mana: Int) : Human(name,mana){

    override fun attack() {
        if(mana != 0){
            println("$name use Fireball!")
            mana = 0
        }else{ //no mana use fist attack instead
            println("Run out of Mana :(")
            super.attack()
        }
    }
}

fun main() {
    val human = Human("human") // a Human name human
    human.attack() // fist attack don't require Mana

    val gandalf = Mage("Gandalf",100) //  a Mage name gandalf
    gandalf.attack() // cast spell
    gandalf.attack() // run out of Mana
    gandalf.attack() // still no Mana

}

