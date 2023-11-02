package com.example.demo;

import java.util.List;

public interface Contactservice {
    void add(Contact contact);

    void update(Contact contact);

    void delete(Integer id);

    List<Contact> selectAll();
}
