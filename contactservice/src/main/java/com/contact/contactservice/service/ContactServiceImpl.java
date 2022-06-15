package com.contact.contactservice.service;

import com.contact.contactservice.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> list=List.of(
            new Contact(1L,"abc@gmail.com","Virat",1001L),
            new Contact(2L,"pbc@gmail.com","Rohit",1002L),
            new Contact(3L,"mbc@gmail.com","Dhruvil",1000L)
    );
    @Override
    public List<Contact> getContactList(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
