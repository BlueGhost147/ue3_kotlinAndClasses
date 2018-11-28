package beans_game

import android.util.Log

open class LivingThing(val name: String, var health: Int, var attackStrength: Int, var isAlive: Boolean) {
    fun attack(attackee: LivingThing) {

        if (this.isAlive) {

            Log.i("LivingThing", "Attacking ${attackee.name} with attackStrength: ${attackStrength}")

            if (attackee.isAlive)
                attackee.takeDamageFrom(this, attackStrength)
            else
                Log.i("LivingThing", "But ${attackee.name} is already dead!")
        }
        else
            Log.i("LivingThing", "${this.name} can´t attack, it is already dead!")
    }

    fun takeDamageFrom(attackee: LivingThing, damage: Int) {
        Log.i("LivingThing", "${name} is taking ${attackee.attackStrength} damage from: ${attackee.name}")
        attackee.health = attackee.health - damage
        if (attackee.health <= 0) {
            attackee.isAlive = false
            Log.i("LivingThing", "${attackee.name} died!")
        }

    }
}