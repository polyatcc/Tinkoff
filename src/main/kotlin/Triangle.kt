import java.lang.Math.sqrt

class Triangle(override var name: String, var a : Double, var b : Double, var cos : Double) : Shape() {
    override fun getPerimeter(): Double {
        val p : Double = a + b + sqrt(a * a + b * b - 2 * a * b * cos)
        println("It's a triangle. Perimeter: " + p)
        return p
    }

    override fun getSquare(): Double {
        val sin : Double = sqrt(1 - cos * cos)
        val s : Double = (a * b * sin) / 2
        println("It's a triangle. Square: " + s)
        return s
    }
}