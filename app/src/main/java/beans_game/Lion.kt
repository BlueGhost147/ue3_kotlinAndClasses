package beans_game

import android.util.Log

class Lion(name : String, health : Int, attackStrength : Int, isAlive : Boolean) : LivingThing(name,health,attackStrength,isAlive) {

    init {
        roar()
    }

    fun roar()
    {
        if(this.isAlive)
            Log.w("GameLog","ROAR!!!!!!")
        else
            Log.v("GameLog","Dead Lions can´t roar")
    }

    override fun attack(target: LivingThing) {
        roar()
        super.attack(target)
    }
}
