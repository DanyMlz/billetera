package com.example;

import java.util.ArrayList;
import java.util.Scanner;
import com.example.Dany.Goal;
import com.example.Dayeza.User;
import com.example.Interfeces.Login;
import com.example.Interfeces.Register;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opcion: \n1. Iniciar Sesion\n2. Registrarse");
        int loginOrRegister = scanner.nextInt();
        scanner.nextLine();
        if(loginOrRegister == 1){
            /*
            System.out.println( "Ingresa tu nombre" );
            String name = scanner.nextLine();
            System.out.println("Ingresa tu contraseña");
            String password = scanner.nextLine();
            
            if(password.equals("123456")){
                System.out.println("Bienvenido " + name + ":)");
                System.out.println("1. Crear meta\n2. Gastos\n3. Ingresos");
                int opciones = scanner.nextInt();
                if(opciones == 1){
                    System.out.println("Escribe tu meta");
                    String meta = scanner.nextLine();
                    Goal goal = new Goal();
                    String metaCreada = goal.createGoal(meta);
                    System.out.println("Meta: " + "" + metaCreada + " "+ "creada exitosamente");
                }
            }*/
            Login login = new Login();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
        }else{
            /*ArrayList<String> datos = new ArrayList<String>();
            System.out.println( "Ingresa tu nombre" );
            String name = scanner.nextLine();
            datos.add(name);
            System.out.println( "Ingresa tu apellido" );
            String apellido = scanner.nextLine();
            datos.add(apellido);
            System.out.println("Ingresa tu contraseña");
            String password = scanner.nextLine();
            datos.add(password);


            User user = new User(name, apellido, password);
            Request.postUser(user);
            Request.getUser(user.getName());
            */
            
            
            Register register = new Register();
            register.setVisible(true);
            register.setLocationRelativeTo(null);
            String name = register.getInputName();
            if(name != null){
                register.dispose();
                System.out.println(name);
            }
        }

    }
}
