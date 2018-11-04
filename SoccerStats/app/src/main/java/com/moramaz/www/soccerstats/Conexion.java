package com.moramaz.www.soccerstats;

public class Conexion {

    public Conexion(){

    }

    public boolean iniciarSesion(String nombre, String contrasena){
        if(nombre.length() > 0 && contrasena.length() > 0){
            return true;
        }else{
            System.out.println("Debe ingresar su usuario y su contraseña.");
            return false;
        }
    }
}
