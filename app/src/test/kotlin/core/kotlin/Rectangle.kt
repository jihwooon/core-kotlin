package core.kotlin


class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}


fun main() {
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}
