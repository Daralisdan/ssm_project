package com.book.contorller;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.book.pojo.Person;
import com.book.service.PersonService;

@Controller
@RequestMapping
public class PersonController {

    @Autowired
    private PersonService personService;

    public PersonController() {
        super();
        System.out.println("实例化controller");
    }

    @RequestMapping("/showPerson")
//    @ResponseBody
    public String showPersons(Model model) {
        List<Person> persons = personService.loadPersons();
        model.addAttribute("persons", persons);
        return "showPerson";
    }
    
    @RequestMapping(value="/insertPerson",produces = {"text/html;charset=utf-8"})
    @ResponseBody
    public String insert(String name,int age) {
        try {
            System.out.println(name+":"+age);
            
            personService.insert(new Person(name, age));
            return "插入成功";
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "插入失败";
        }
        
    }
    @RequestMapping(value="/updatePerson",produces = {"text/html;charset=utf-8"})
    @ResponseBody
    public String update(Integer id,String name,int age) {
        try {
            System.out.println(name+":"+age);
            if(id == null ) {
                return "id不能为空";
            }
            Person p = new Person(name, age);
            p.setId(id.intValue());
            personService.update(p);
            return "修改成功";
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "修改失败";
        }
        
    }
    
    @RequestMapping(value="/deletePerson",produces = {"text/html;charset=utf-8"})
    @ResponseBody
    public String delete(Integer id) {
        try {
            if(id == null ) {
                return "id不能为空";
            }
            personService.delete(id.intValue());
            return "删除成功";
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "删除失败";
        }
        
    }
}
