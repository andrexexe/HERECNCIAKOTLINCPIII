package Ejemplo2

fun main(){




    // Ejemplo 1 Herencia Objeto Ejemplo1.Persona hereda Ejemplo1.estudiante
    /*
    Crea una clase base llamada Ejemplo2.Vehiculo con propiedades como marca, modelo y un método mostrarDetalles()
    que imprima la información del vehículo. Luego, crea dos subclases llamadas Ejemplo2.Auto y Ejemplo2.Camioneta que hereden
    de Ejemplo2.Vehiculo y añade propiedades específicas para cada una, como numPuertas para el auto y capacidadCarga para la camioneta.
    * */
    //Solucion 01
    //  Herencia Ejemplo2.Vehiculo Clase Padre hereda a Ejemplo2.Auto y Ejemplo2.Camioneta hacemos uso de el Super

    val sail = Auto("Sail","2015",4)
    val camioneta1= Camioneta("Renault ","2020",5.5)
    println("Ejemplo2.Auto")
    sail.mostrardetalles()
    println("Ejemplo2.Camioneta")
    camioneta1.mostrardetalles()




}