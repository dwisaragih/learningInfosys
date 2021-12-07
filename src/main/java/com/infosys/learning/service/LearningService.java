package com.infosys.learning.service;

import com.infosys.learning.dto.Person;
import org.springframework.stereotype.Service;

@Service
public class LearningService {

    public String getName(String gender){
        Person person = new Person();

        if ("man".equals(gender)){
            person.setName("John");
        }
        else{
            person.setName("Jane");
        }
        return person.getName();
    }

    public Person getNameV2(String gender){
        Person person = new Person();
        if("man".equals(gender)){
            person.setName("John");
        }
        else{
            person.setName("Jane");
        }
        return person;
    }

    public String getNameV3(String name){
        String fullName = "Not Identified";

        if("John".equals(name)){
            fullName = "John Doe";
        }
        else{
            fullName = "Jane Done";
        }
        return fullName;
    }
}
