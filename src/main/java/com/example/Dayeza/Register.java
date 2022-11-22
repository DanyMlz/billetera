
package com.example.Dayeza;
public class Register {
    public String registro(String name,String lastname, String email, String password){
        String res = "Registrado con Exito";
        if(name==""){
            res = "Nombre No Valido" ;
        }
        if(lastname==""){
            res = "Apellido No Valido";
        }
        if(email==""){
            res = "Email No Valido";
        }
        if(!esSeguro(password)){
            res = "Contraseña No Valida";
        }
        return res;
    }

    public boolean esSeguro(String password){
        boolean res;
        if(password.length() > 6 ){
            boolean mayuscula= false;
            boolean numero= false;
            char caracter ;
            for(int i=0; i < password.length(); i++){
                caracter = password.charAt(i);
                if(Character.isDigit(caracter)){
                    numero = true;
                }
                if(Character.isUpperCase(caracter)){
                    mayuscula = true;
                }
            }
            if(mayuscula && numero){
                res = true;
            }else{
                res = false;
            }
        }else{
            res = false;
        }
        return res;
    }
}