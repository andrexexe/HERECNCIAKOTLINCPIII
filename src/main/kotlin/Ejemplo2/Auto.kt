package Ejemplo2

class Auto(
    marca:String,modelo:String, val numPuertas:Int
): Vehiculo( marca, modelo)
{
    override fun mostrardetalles(){
        super.mostrardetalles()
        println("Numero de puertas: $numPuertas")

    }

}

