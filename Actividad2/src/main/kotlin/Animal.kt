//Crea una clase base Animal con propiedades comunes y un método hacerSonido().
open class Animal(
    val nombre: String,
    val edad: Int
) {
    open fun hacerSonido() {
        println("Sonido de animal aleatorio:")
    }
}