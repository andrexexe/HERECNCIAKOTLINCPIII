package Ejemplo4

class Trabajador(nombre:String,salario:Double,val horasTrabajadas:Int)
      :Empleado(nombre, salario)
{
    override fun calcularSalario(): Double {
        if (horasTrabajadas < 0) {
            throw IllegalArgumentException("Las horas trabajadas no pueden ser negativas")
        }
        val salarioPorHora= salario / 192
        val salarioTotal=  salarioPorHora*horasTrabajadas
        return salarioTotal
    }



}