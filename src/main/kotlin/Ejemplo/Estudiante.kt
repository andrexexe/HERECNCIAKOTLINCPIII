package Ejemplo

class  estudiante (nombre:String, apellido:String, edad:Int, var curso:String, var calificacion:Double)
    : Persona( nombre, apellido,  edad){

    fun verestud(){
        println("""
            Estudiante: ${nombre}
            Apellido  : ${apellido}
            Edad      : ${edad}
            Curso     : ${curso}
            Calificacion:${calificacion}  
            
        """.trimIndent())




    }

    override fun toString(): String {
        return "Ejemplo1.estudiante(curso='$curso', calificacion=$calificacion)"
    }
}

