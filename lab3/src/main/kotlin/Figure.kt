data class Figure(val width: Int, val height: Int) {
    private var _area:Int = 0
    var area: Int
        get() = _area
        private set(value) {
            _area = value
        }

    init {
        area = width * height
    }
}

sealed class Shape {
    class Rectangle : Shape()
    class Oval : Shape()
    class Line : Shape()
}