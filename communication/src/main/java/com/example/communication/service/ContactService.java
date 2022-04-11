package com.example.communication.service;

import com.example.communication.entity.Contact;
import com.example.communication.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

@Service
public class ContactService {

    private Map<String, Contact> contactMap;
    private ContactRepository contactRepository;
    List<Contact> people = new ArrayList<>();
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Map<String, List<Contact>> phoneNumbers(String name){
        Map<String, List<Contact>> person = contactRepository.findAll().stream().filter(t->t.getName().equalsIgnoreCase(name)).collect(groupingBy(Contact::getName));
        return  person;
        //  return (Contact) contactRepository.findAll().stream().collect(groupingBy(Contact::getName));
        //return peoples.forEach((String name : );
        //List<Contact> persons = contactRepository.findAll().stream().filter(t -> t.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
       // persons.forEach(people -> people.getName());

      //  HashMap<String,String> result = contactRepository.findAll().stream().collect(groupingBy(Contact::getName,Contact::getPhoneNumber)).toString();
    }




    public List<Contact> getPeopleByName(String name){

        List<String> phones = new ArrayList<>();

        return contactRepository.findAll().stream().filter(t -> t.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
      //  return null;
    }
    public Contact saveOneContact(Contact newContact) {
        return contactRepository.save(newContact);
    }

    public List<Contact> getAllPeople() {
        return  contactRepository.findAll();
    }
}
