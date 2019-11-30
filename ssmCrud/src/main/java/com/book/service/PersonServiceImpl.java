package com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.mapper.PersonMapper;
import com.book.pojo.Person;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> loadPersons() {
        return personMapper.queryAll();
    }

    /**
     * @param person
     * @see com.book.service.PersonService#insert(com.book.pojo.Person)
     */
    @Override
    public void insert(Person person) {
        personMapper.insert(person);

    }

    /**
     * @param person
     * @see com.book.service.PersonService#update(com.book.pojo.Person)
     */
    @Override
    public void update(Person person) {
        Person p = personMapper.findById(person.getId());
        if (person.getName() != null) {
            p.setName(person.getName());
        }

        if (person.getAge() != 0) {
            p.setAge(person.getAge());
        }
        personMapper.update(p);

    }

    /**
     * @param id
     * @see com.book.service.PersonService#delete(int)
     */
    @Override
    public void delete(int id) {
        personMapper.delete(id);

    }

}
