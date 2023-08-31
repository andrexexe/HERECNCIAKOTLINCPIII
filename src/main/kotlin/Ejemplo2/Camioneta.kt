package Ejemplo2

class Camioneta(
    marca:String,
    modelo:String,

    var capacidadCarga:Double

) : Vehiculo(marca, modelo){


    //Metodo Mostrar

     override fun mostrardetalles(){
         super.mostrardetalles()

        println("El Camion Cuenta con $capacidadCarga ")

    }

}