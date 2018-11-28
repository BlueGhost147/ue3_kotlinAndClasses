package beans_game

class Player(
    name : String, health : Int, attackStrength : Int, isAlive : Boolean, var level : Int, var exp : Int) : LivingThing(name,health,attackStrength,isAlive) {
}