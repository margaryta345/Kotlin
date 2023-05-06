fun main() {

    val figures = listOf(
        Figure(2, 10),
        Figure(5, 5),
        Figure(8, 10)
    )

    var totalArea = 0

    for (figure in figures) {
        totalArea += figure.area
    }

    println("Total area: $totalArea")
    val shapes = listOf(
        Shape.Oval(),
        Shape.Line(),
        Shape.Rectangle(),
        Shape.Oval()
    )

    val numRectangles = shapes.filterIsInstance<Shape.Rectangle>().count()
    val numOvals = shapes.filterIsInstance<Shape.Oval>().count()
    val numLines = shapes.filterIsInstance<Shape.Line>().count()
    println("Var 1")
    println("Number of rectangles: $numRectangles")
    println("Number of ovals: $numOvals")
    println("Number of lines: $numLines")

    var countRectangles = 0
    var countOvals = 0
    var countLines = 0

    for (shape in shapes) {
        when (shape) {
            is Shape.Rectangle -> countRectangles++
            is Shape.Oval -> countOvals++
            is Shape.Line -> countLines++
        }
    }
    println("Var 2")
    println("Number of rectangles: $countRectangles")
    println("Number of ovals: $countOvals")
    println("Number of lines: $countLines")
}