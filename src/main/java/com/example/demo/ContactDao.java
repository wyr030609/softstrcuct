package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface ContactDao {
    int insert(Contact contact);
    int delete(Integer id);
    int update(Contact contact);
    List<Contact> selectAll();
}
