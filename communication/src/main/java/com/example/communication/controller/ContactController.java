package com.example.communication.controller;

import com.example.communication.entity.Contact;
import com.example.communication.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/contact")
public class ContactController {



    List <Contact>phones= new ArrayList<>();

    private ContactService contactService;



    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<Contact> getAllPeople() {
        return contactService.getAllPeople();
    }

    @GetMapping("/get")
    public List<String> getPhones(@RequestParam String name) {

      return contactService.getAllPeople().stream().filter(t->t.getName().equalsIgnoreCase(name)).map(Contact::getPhoneNumber).collect(Collectors.toList()); // Name' e ait numaraları liste olarak dönüyor

    }
    @GetMapping("/person")
    public Map<String, List<Contact>> getAllPhoneNumbersWithParam(@RequestParam  String name){
        return contactService.phoneNumbers(name);
    }



    @PostMapping
    public Contact createPeople(@RequestBody Contact newContact){
        return contactService.saveOneContact(newContact);
    }
}