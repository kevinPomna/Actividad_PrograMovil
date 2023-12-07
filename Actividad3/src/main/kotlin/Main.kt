//En la función main, crea objetos de tus clases Coche, Bicicleta, Círculo y Cuadrado, y demuestra su uso.
fun main() {
    // Creando objetos de las clases Coche, Bicicleta, Círculo y Cuadrado
    val coche = Coche()
    val bicicleta = Bicicleta()
    val circulo = Circulo(5.0)
    val cuadrado = Cuadrado(4.0)

    // Demostrar el uso de los objetos
    coche.acelerar()
    bicicleta.acelerar()

    println("Área del círculo: ${circulo.area}")
    circulo.dibujar()

    println("Área del cuadrado: ${cuadrado.area}")
    cuadrado.dibujar()
}