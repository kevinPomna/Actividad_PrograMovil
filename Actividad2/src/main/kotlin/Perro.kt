class Perro(
    nombre: String,
    edad: Int,
    val raza: String
) : Animal(nombre, edad) {
    override fun hacerSonido() { //Extiende esta clase base con clases específicas como Perro y Gato, sobreescribiendo el método hacerSonido() en cada una para reflejar su sonido característico.
        println("Guau!")
    }
}