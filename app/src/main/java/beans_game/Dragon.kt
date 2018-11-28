package beans_game

import android.util.Log

class Dragon(name : String, health : Int, attackStrength : Int, isAlive : Boolean) : LivingThing(name,health,attackStrength,isAlive) {

    init {
        breathFire()
    }

    fun breathFire()
    {
        if(this.isAlive)
            Log.e("GameLog","Ahhhhh Fire, Ahhhh!!!")
        else
            Log.v("GameLog","Dead Dragons can´t breath fire")
    }

    override fun attack(target: LivingThing) {
        breathFire()
        super.attack(target)
    }
}
