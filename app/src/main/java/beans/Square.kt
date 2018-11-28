package beans

class Square(a : Double) : Rectangle(a,a)
{
    override fun calculateArea(): Double {
        return a * a
    }
}