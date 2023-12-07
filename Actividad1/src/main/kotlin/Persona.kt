//Crea una clase Persona que tenga al menos tres propiedades: nombre, edad y ocupación.
class Persona(
    val nombre: String,
    val edad: Int,
    val ocupacion: String
) {
    fun mostrarDescripcion() { //Define un método en la clase que muestre una descripción de la persona (por ejemplo, "Juan, 30 años, Ingeniero").
        println("$nombre, $edad años, $ocupacion")//En la función main, crea diferentes objetos de la clase Persona y muestra sus descripciones.
    }
}