interface Shape {
    var name : String

    fun getSquare () : Double {
        println("I'm abstract, pls implement me!")
        return 0.0
    }
    fun getPerimeter () : Double {
        println("I'm abstract, pls implement me!")
        return 0.0
    }
}