import java.util.*

fun main() {
    val TRNGl = Triangle ("Треугольник", 5.6, 6.4, 0.2)
    val CRCL = Circle("Круг", 5.9)
    val RCTNGL = Rectangle("Прямоугольник", 3.2, 4.3)

    val shapes : List<Shape> = listOf(TRNGl, CRCL, RCTNGL)

    for (sh in shapes){
        sh.getPerimeter()
        sh.getSquare()
    }
}