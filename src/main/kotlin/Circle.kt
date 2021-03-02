class Circle(override var name: String, var radius : Double) : Shape() {
    override fun getPerimeter(): Double {
        println("It's a circle. Perimeter: " + 2 * Math.PI * radius)
        return 2 * Math.PI * radius
    }

    override fun getSquare(): Double {
        println("It's a circle. Square: " + Math.PI * radius * radius)
        return Math.PI * radius * radius
    }

    fun getIntersection(triangle: Triangle) {
        println("It's an intersection of Circle & Triangle!")
    }
    fun getIntersection(rectangle: Rectangle) {
        println("It's an intersection of Circle & Rectangle!")
    }
}