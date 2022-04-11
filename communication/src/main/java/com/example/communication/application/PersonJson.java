package com.example.communication.application;

import com.example.communication.entity.Contact;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonJson {
    private static Object Contact;

    public static void main(String[] args) throws IOException {

        List<Contact> persons = new ArrayList<>(8);

        Contact person1 = new Contact("05375846570","Işıl","Talay");
        Contact person2= new Contact("05328657169","Batuhan","Aslan");
        Contact person3= new Contact("05489657316","Selin","Yılmaz");
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        String filePath = "C:\\Users\\90537\\OneDrive\\Masaüstü\\SpringBootProjelerim\\communication\\communication\\src\\persons.json";
        File file = new File(filePath);
        ObjectMapper mapper= new ObjectMapper();
        mapper.writeValue(file,person2);
        Contact deserilalized = mapper.readValue(new File(filePath),Contact.class);

        Contact deser = mapper.readValue(new File(filePath),Contact.class);
        System.out.println(deserilalized.toString());
    }
}
