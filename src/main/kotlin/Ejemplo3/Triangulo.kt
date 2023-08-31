package Ejemplo3

class Triangulo (nombre:String,color:String?, val base:Double,val altura:Double)
    :FiguraGeometrica(nombre, color){

    override fun calcularArea() {
        val area = (altura*base)/2

        println("El area del tringulo $nombre es = $area unidades cuadradas")
    }


}