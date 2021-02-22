import java.lang.Math.sqrt

class Triangle(override var name: String, var A : Double, var B : Double, var cos : Double) : Shape{
    override fun getPerimeter(): Double {
        val p : Double = A + B + sqrt(A * A + B * B - 2 * A * B * cos)
        println("It's a triangle. Perimeter: " + p)
        return p
    }

    override fun getSquare(): Double {
        val sin : Double = sqrt(1 - cos * cos)
        val s : Double = (A * B * sin) / 2
        println("It's a triangle. Square: " + s)
        return s
    }
}