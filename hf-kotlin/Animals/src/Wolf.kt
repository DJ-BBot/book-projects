class Wolf: Canine () {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forest"

    override fun makeNoise() {
        println("Hooooooowl!")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}