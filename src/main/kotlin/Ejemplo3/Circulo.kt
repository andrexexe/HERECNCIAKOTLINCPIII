package Ejemplo3

class Circulo (nombre:String,color:String?,var radio:Double):FiguraGeometrica(nombre,color){

    override fun calcularArea() {
        val area= Math.PI*radio*radio
        println("El area del circulo $nombre es =  $area  unidades cuadradas")
    }

}