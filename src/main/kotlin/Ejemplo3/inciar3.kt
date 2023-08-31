package Ejemplo3


/*
*Ejercicio 2:
Crea una clase base llamada FiguraGeometrica con propiedades
 como nombre y color, y un método calcularArea() que imprima
  un mensaje genérico. Luego, crea subclases como Circulo, Cuadrado
  y Triangulo que hereden de FiguraGeometrica y
 sobrescriban el método calcularArea() para calcular
 el área real de cada figura.

 */
fun main(){


    //crear Objetos
    // USo de NULL ?

    val cir1=Circulo(" Rex ","Verde",9.9)
    val cua1=Cuadrado(" Rex", "Naranja", 5.5)
    val tri1=Triangulo(" Rex ", null,5.0,3.0)

    println("Informacion  del Circulo ${cir1.color?:"Sin color definido"}")
    cir1.calcularArea()
    try {
        println("Informacion del triangulo ${tri1.color?:"Sin color definido"} ")
        tri1.calcularArea()

    }
    catch (e: Exception){
        println("Ocurrió un error al calcular el área del Triángulo: ${e.message}")
    }

    println("Infromacion del cuadrado ${cua1.color?:"Sin color definido"}")
    cua1.calcularArea()




}