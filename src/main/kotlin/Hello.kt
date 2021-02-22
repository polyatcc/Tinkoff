fun main() {
    val TRNGl = Triangle ("Треугольник", 5.6, 6.4, 0.2)
    val CRCL = Circle("Круг", 5.9)
    val RCTNGL = Rectangle("Прямоугольник", 3.2, 4.3)

    TRNGl.getPerimeter()
    RCTNGL.getPerimeter()
    CRCL.getPerimeter()

    TRNGl.getSquare()
    RCTNGL.getSquare()
    CRCL.getSquare()
}