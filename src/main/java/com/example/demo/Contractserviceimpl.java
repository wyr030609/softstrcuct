package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Contractserviceimpl implements Contactservice {

//    @Autowired
//    private ContactDao contactDao;
    @Autowired
    private ContactDao contactDao;


    @Override
    public void add(Contact contact) {
        contactDao.insert(contact);
    }


    @Override
    public void update(Contact contact) {
        contactDao.update(contact);
    }

    @Override
    public void delete(Integer id) {
        contactDao.delete(id);
    }
    public List<Contact> selectAll() {
        return contactDao.selectAll();
    }


}
