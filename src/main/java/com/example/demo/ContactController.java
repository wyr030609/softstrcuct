package com.example.demo;

import io.swagger.annotations.ApiOperation;

import com.example.demo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/contacts")
public class ContactController {
    private List<Contact> contacts = new ArrayList<>();
    private int nextId = 1;

    @Autowired
    private Contactservice contactservice;

    // 更新
    @PutMapping("/updateContactByName")
    public void updateContactByName( @PathVariable String name) {

        Contact contact1=new Contact();
        contact1.setName(name);
        contactservice.update(contact1);
        System.out.println("更新成功");
    }

// 添加联系人
    @PostMapping()
    public void addContact(@PathVariable Contact contact) {
        Contact contact1=new Contact();
        contact1.setId(contact.getId());
        contact1.setAdress(contact.getAdress());
        contact1.setName(contact.getName());
        contact1.setPhone(contact.getPhone());
        contactservice.add(contact1);
        System.out.println("添加成功");
    }
    //展示
    @GetMapping("/selectAll")
    public Result<List<Contact>> show() {

        List<Contact> contacts1 = contactservice.selectAll();

        return new Result<List<Contact>>(true, StatusCode.OK, "查询成功", contacts1);
    }

    // 删除联系人
    @DeleteMapping("/deleteContactByName")
    public void deleteContactByName(@PathVariable int id) {
        contactservice.delete(id);
    }
}
