package Ejemplo

open class Persona(var nombre:String, var apellido:String, var edad:Int){

    override fun toString(): String {
        return "Ejemplo1.Persona(nombre='$nombre', apellido='$apellido', edad=$edad)"
    }
}
