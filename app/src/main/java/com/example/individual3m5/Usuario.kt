package com.example.individual3m5

class Usuario:datos {
     var nombre: String = ""
     var edad: Int = 0
     var trabajo: String? = ""
     var referencia: Usuario? = null

    constructor() {

    }

    constructor(nombre: String, edad: Int, trabajo: String, referencia: Usuario?) {
        this.nombre = nombre
        this.edad = edad
        this.trabajo = trabajo
        this.referencia = referencia
    }

    override fun toString(): String {
        return "$nombre de $edad años"
    }

    override fun mostrarDatos() {
        var referenceText ="Fue citado por: $referencia"
        if(referencia==null){
            referenceText="Sin referencia"
        }
        println("Nombre: $nombre. \nEdad: $edad. \nTrabajo: $trabajo \n$referenceText")
    }
}

