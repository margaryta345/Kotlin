fun main(args: Array<String>) {
    val cat = Animal()
    cat.setAge(10)
    cat.name = "Toll"
    println("${cat.getInfoAnimal()}")

    val dog= Dog()
    dog.name="Handy"
    println("Name of dog ${dog.name} ${dog.sound()} ${dog.loudVoice()} ")

    val bird=Bird()
    bird.color="green"
    println("Color of bird ${bird.color} ${bird.sound()} ${bird.quietVoice()} ")

    val fish = Fish()
    fish.setType("salmon")
    println(" ${fish.typ()} ${fish.sound()} ")

    val animals = listOf(Dog(), Bird())
    for (animal in animals) {
        val isLoud = animal.loudVoice()
        if (animal is Dog) {
            println("Dog is loud: $isLoud")
        } else {
            println("Bird is loud: $isLoud")
        }
    }
}