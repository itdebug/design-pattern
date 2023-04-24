package org.example.compenent.concrete;

import org.example.compenent.Criteria;
import org.example.compenent.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
