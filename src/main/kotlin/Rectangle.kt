class Rectangle(override var name: String, var a : Double, var b : Double) : Shape() {
    override fun getPerimeter(): Double {
        println("It's a rectangle. Perimeter: " + (a + b) * 2)
        return (a + b) * 2
    }

    override fun getSquare(): Double {
        println("It's a rectangle. Square: " + a * b)
        return a * b
    }
}