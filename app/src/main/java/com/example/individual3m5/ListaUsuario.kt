package com.example.individual3m5


class ListaUsuario:datos {
    private var lista: ArrayList<Usuario> = arrayListOf()

    constructor(lista: ArrayList<Usuario>) {
        this.lista
    }
    constructor(){

    }

    fun agregarUsuario(usuario:Usuario){
        this.lista.add(usuario)
    }
    fun eliminarUsuario(nombreUser:String){
        this.lista.removeIf { it.nombre == nombreUser }
    }
    fun eliminarUsuario(usuario:Usuario){
        this.lista.remove(usuario)
    }
    fun eliminarUsuario(num:Int){
        this.lista.removeAt(num)
    }
    //funcion mostrarLista() la reemplaze por la función mostrarDatos() de la interface 'datos'
    override fun mostrarDatos() {
        this.lista.forEach{ println(it.mostrarDatos())}
    }



}