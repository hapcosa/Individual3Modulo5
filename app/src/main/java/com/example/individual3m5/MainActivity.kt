package com.example.individual3m5

fun main(){
        //Tarea 3
        val user1= Usuario("jorge",45,"Gerente Adalid",null)
        val user2= Usuario("Pedro",32,"Awaker",user1);
        user1.mostrarDatos()
        user2.mostrarDatos()
        //Tarea 4
        var usuarioUno :Usuario = Usuario("Gon",14,"cazador",null)
        var usuarioDos :Usuario = Usuario("Killua",15,"cazador",usuarioUno)
        var usuarioTres :Usuario = Usuario("Leorio",17,"cazador",usuarioDos)
        var usuarioCuatro :Usuario = Usuario("Kurapika",17,"cazador",usuarioTres)
        var usuarioCinco :Usuario = Usuario("Hizoka",22,"cazador",usuarioCuatro)
        var usuarios: ListaUsuario = ListaUsuario(arrayListOf(usuarioUno,usuarioDos,usuarioTres,usuarioCuatro))
        usuarios.agregarUsuario(usuarioCinco)
        usuarios.mostrarDatos()
        usuarios.eliminarUsuario("Hizoka")
        usuarios.mostrarDatos()
        usuarios.eliminarUsuario(usuarioUno)
        usuarios.mostrarDatos()
    }

