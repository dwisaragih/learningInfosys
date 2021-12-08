package com.infosys.learning.service;

import com.infosys.learning.dto.Person;
import org.springframework.stereotype.Service;

import java.util.Calendar;

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
        String fullName;

        if("John".equals(name)){
            fullName = "John Doe";
        }
        else{
            fullName = "Jane Done";
        }
        return fullName;
    }

    public String[] getAge(String name, String yearOfBirth){
        String personName;
        int yearNow;

        if("John".equals(name)){
            personName = "John";
        }
        else{
            personName = "Jane";
        }

        Calendar kalender = Calendar.getInstance();
        yearNow = kalender.get(Calendar.YEAR);

        int birth = Integer.parseInt(yearOfBirth);

        int age = yearNow - birth;
        String a=String.valueOf(age);

        return new String[]{
                personName,
                a
        };
    }
}
