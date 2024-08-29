package com.example.individual3m5

class Usuario:datos {
    private var nombre: String = ""
    private var edad: Int = 0
    private var trabajo: String? = ""
    private var referencia: Usuario? = null

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
fun main()
{
    val user1= Usuario("jorge",45,"Gerente Adalid",null)
    val user2= Usuario("Pedro",32,"Awaker",user1);
    user1.mostrarDatos()
    user2.mostrarDatos()
}
