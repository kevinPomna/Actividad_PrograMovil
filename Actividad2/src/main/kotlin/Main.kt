//En la función main, crea una lista de animales de diferentes tipos y recórrela, llamando al método hacerSonido() para cada animal.
fun main() {
    // Crear una lista de animales de diferentes tipos
    val listaAnimales: List<Animal> = listOf(
        Animal("Animal1", 3),
        Perro("Pancho", 2, "Labrador"),
        Gato("Manuel", 5)
    )

    // Recorremos la lista y llamar al método hacerSonido() para cada animal
    for (animal in listaAnimales) {
        println("${animal.nombre} (${animal.javaClass.simpleName}) hace el sonido:")
        animal.hacerSonido()
        println()
    }
} //Ejecutamos la funcion main poara obtener los parametros que se piden en esta parte