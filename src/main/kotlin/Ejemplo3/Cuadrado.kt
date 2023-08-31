package Ejemplo3


class Cuadrado(nombre:String,color:String?, val lado:Double)
    :FiguraGeometrica(nombre, color){

    override fun calcularArea() {
        val area = (lado*lado)

        println("El area del tringulo $nombre es = $area unidades cuadradas")
    }


}