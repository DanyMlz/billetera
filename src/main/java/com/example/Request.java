package com.example;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.example.Dayeza.UserSchema;
import com.google.gson.Gson;


public class Request {

    public static UserSchema getUser(String name){
        try{
            Reader user = Files.newBufferedReader(Paths.get(name + ".json"));
            Gson gson = new Gson();
            UserSchema userReader = gson.fromJson(user, UserSchema.class);
            user.close();
            return userReader;

        }catch(Exception e){
        }
        return null;
    }


    public static void postUser(UserSchema user){
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


