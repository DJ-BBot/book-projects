class Hippo: Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Hippo is making a noise")
    }

    override fun eat() {
        println("Hippo is eating $food")
    }
}