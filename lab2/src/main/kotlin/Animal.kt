interface Voice {
    fun loudVoice():Boolean
    fun quietVoice():Boolean
}
open class Animal {
    var name: String = "Tom"
    private var age: Int = 0

    fun setAge(animalAge: Int) {
        this.age = animalAge
    }

    private fun getAge(): Int {
        return this.age
    }

    fun getInfoAnimal(): String {
        return "Age of animal ${getAge()} and name $name"
    }
    open fun sound(){
        println("Animal speeks")
    }

    open fun loudVoice(): Boolean {
        println("Animal speek loud")
        return true
    }
    open fun quietVoice(): Boolean {
        println("Animal speek quiet")
        return false
    }
}

class Dog: Animal() {
    override fun sound() {
        println("woof woof")
    }
    override fun loudVoice(): Boolean {
        return true
    }
    override fun quietVoice(): Boolean {
        return false
    }
}

class Bird: Animal() {
    var color:String="blue"
    fun col(){
        println("Color of bird  ${color} and name $name")
    }
    override fun sound() {
        println("tweet-tweet")
    }
    override fun loudVoice(): Boolean {
        println("loud tweet-tweet")
        return false
    }
    override fun quietVoice(): Boolean {
        println("quite tweet-tweet ")
        return true
    }
    }

class Fish:Animal(){
    private var type:String=""
    fun setType(fishType: String) {
        this.type = fishType
    }
    private fun getType(): String {
        return this.type
    }
    fun typ(){
        println("Type of fish ${type}")
    }
    override fun sound() {
        println("No sound")
    }
}
