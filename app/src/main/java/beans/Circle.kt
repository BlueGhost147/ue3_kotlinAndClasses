package beans

import kotlin.math.pow

class Circle(protected val r : Double) : Shape()
{
    override fun calculateArea(): Double {
        return r.pow(2) * Math.PI
    }
}