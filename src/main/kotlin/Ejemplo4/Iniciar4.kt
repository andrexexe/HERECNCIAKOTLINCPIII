package Ejemplo4


/*
Crea una clase base llamada Empleado con propiedades como
nombre, salario y un método calcularSalarioTotal() que devuelva
 el salario total incluyendo bonificaciones. Luego, crea dos
 subclases llamadas Gerente y Trabajador que hereden de Empleado.
 Agrega propiedades específicas para cada una, como bono para el
 gerente y horasTrabajadas para el trabajador. Sobrescribe el método
 calcularSalarioTotal()
en ambas subclases para incluir las bonificaciones correspondientes.


 */
fun main(){
    val gerente = Gerente("Andres", 1200000.0, 100000.0)
    val trabajador = Trabajador("David", 1500000.0, -5)

    println("Detalles del Gerente:")
    println("Salario total de ${gerente.nombre}: ${gerente.calcularSalario()}")

    try {
        println("\nDetalles del Trabajador:")
        val salarioTotalTrabajador = trabajador.calcularSalario()
        println("Salario total de ${trabajador.nombre}: $salarioTotalTrabajador")
    } catch (e: IllegalArgumentException) {
        println("Ocurrió un error al calcular el salario del Trabajador: ${e.message}")
    }

}