package com.example.communication.application;

import com.example.communication.entity.Contact;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.*;

public class SavePeopleToFile {
    public static void main(String[] args) throws JsonGenerationException, JsonMappingException,IOException {
        try{
            Contact people1 = new Contact("05375846570" ,"Işıl","Talay");
            Contact people2=new Contact("05375749581","Batuhan","Aslan");

            final FileOutputStream file = new FileOutputStream("C:\\Users\\90537\\OneDrive\\Masaüstü\\SpringBootProjelerim\\communication\\communication\\src\\persons.json");
            final ObjectOutputStream write = new ObjectOutputStream(file);
            write.writeObject(people2);
            //write.writeObject(people2);
            write.close();
        }
        catch(final Exception e){
            System.out.println(e.getMessage());
        }
    }
}
