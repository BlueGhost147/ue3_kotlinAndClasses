package beans_game

import android.util.Log

open class LivingThing(val name: String, var health: Int, var attackStrength: Int, var isAlive: Boolean) {
    open fun attack(target: LivingThing) {

        if (this.isAlive) {

            Log.i("GameLog", "Attacking ${target.name} with attackStrength: ${attackStrength}")

            if (target.isAlive)
                target.takeDamageFrom(this, attackStrength)
            else
                Log.v("GameLog", "But ${target.name} is already dead!")
        }
        else
            Log.v("GameLog", "${this.name} can´t attack, it is already dead!")
    }

    fun takeDamageFrom(attacker: LivingThing, damage: Int) {
        Log.i("GameLog", "${name} is taking ${damage} damage from: ${attacker.name}")
        this.health = this.health - damage
        if (this.health <= 0) {
            this.isAlive = false
            Log.i("GameLog", "${this.name} died!")
        }

    }
}