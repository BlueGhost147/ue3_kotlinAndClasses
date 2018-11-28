package beans

open class Rectangle(protected val a: Double, protected val b: Double) : Shape {
    override fun calculateArea(): Double {
        return a * b
    }
}