package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.example.Dayeza.User;
import com.google.gson.Gson;


public class Request {

    public static void getUser(String name){
        try{
            Reader user = Files.newBufferedReader(Paths.get(name + ".json"));
            Gson gson = new Gson();
            User userReader = gson.fromJson(user, User.class);
            System.out.println(userReader.getName());
            user.close();

        }catch(Exception e){

        }

    }



    public static void postUser(User user){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(user.getName() + ".json"));
            Gson gson = new Gson();
            String json = gson.toJson(user);
            bw.write(json);
            bw.close();

        }catch(Exception e){

        }

    }
}
