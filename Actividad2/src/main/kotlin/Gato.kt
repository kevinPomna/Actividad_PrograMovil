class Gato(
    nombre: String,
    edad: Int
) : Animal(nombre, edad) {
    override fun hacerSonido() { //Extiende esta clase base con clases específicas como Perro y Gato, sobreescribiendo el método hacerSonido() en cada una para reflejar su sonido característico.
        println("Miau!")
    }
}