package beans_game

import android.util.Log

open class LivingThing(val name : String, var health : Int, var attackStrength : Int, var isAlive : Boolean)
{
    fun attack(attackee: LivingThing) {
    Log.i("LivingThing", "Attacking ${attackee.name} with attackStrength: ${attackStrength}")
    attackee.takeDamageFrom(this, attackStrength)
}

    fun takeDamageFrom(attackee: LivingThing, damage: Int) {
        Log.i("LivingThing", "${name} is taking ${attackee.attackStrength} damage from: ${attackee.name}")
    }
}