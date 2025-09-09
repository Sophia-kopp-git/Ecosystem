package org.example;

import java.util.*;

public class PersonRepo {
    private final Map<Integer, Person> persons = new HashMap<>();


        public int countPersonsPerGender(Gender gender) {
            int num = 0;
            for (Person person : persons.values()) {
                if (person.gender().equals(gender)){
                    num++;
                }
            }
            return num;
        }
        public List<Person> findPersonsPerFeavouriteWeekday(DaysOfWeek dayOfWeek){
            List<Person> selectedPersons = new ArrayList<>();
            for (Person person : persons.values()) {
                if (person.favouriteDay().equals(dayOfWeek)){
                    selectedPersons.add(person);
                }
            }


            return selectedPersons;
        }

    public void save(Person person) {
            persons.put((persons.size()+1), person);
    }
    public Optional<Person> getPersonById(int id) {
        return Optional.ofNullable(persons.get(id));
    }
    public List<Person> getAllPersons(){
            List<Person> allPersons = new ArrayList<>();
        allPersons.addAll(persons.values());
            return allPersons;
    }
    public void removePersonById(int id){
            persons.remove(id);
    }

    public Optional<Person> getPersonByName(String name){
        Person selectedPerson = null;
            for (Person person : persons.values()){
                if (person.name().equals(name)){
                    selectedPerson = person;
                }
            }

            return Optional.ofNullable(selectedPerson);
    }


}
