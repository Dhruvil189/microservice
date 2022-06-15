package com.contact.contactservice.controller;

import com.contact.contactservice.entity.Contact;
import com.contact.contactservice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactServiceController {

    @Autowired
    private ContactService contactService;
    @RequestMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId){
    return this.contactService.getContactList(userId);
    }
}
