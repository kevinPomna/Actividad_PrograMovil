//Extiende la clase Forma con clases específicas como Círculo y Cuadrado, implementando las propiedades y métodos abstractos.
class Circulo(val radio: Double) : Forma() {
    override val area: Double
        get() = Math.PI * radio * radio

    override fun dibujar() {
        println("Dibujando un círculo.")
    }
}