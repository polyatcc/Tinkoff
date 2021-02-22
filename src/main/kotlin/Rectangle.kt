class Rectangle(override var name: String, var A : Double, var B : Double) : Shape{
    override fun getPerimeter(): Double {
        println("It's a rectangle. Perimeter: " + (A + B) * 2)
        return (A + B) * 2
    }

    override fun getSquare(): Double {
        println("It's a rectangle. Square: " + A * B)
        return A * B
    }
}