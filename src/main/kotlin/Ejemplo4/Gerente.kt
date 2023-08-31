package Ejemplo4

class Gerente (nombre:String,salario:Double, var bono:Double)
    :Empleado(nombre, salario)

{
    override fun calcularSalario(): Double {
        return  salario+bono
    }

}