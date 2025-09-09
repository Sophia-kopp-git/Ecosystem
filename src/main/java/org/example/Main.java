package org.example;


public class Main {
    public static void main(String[] args) {

        PersonRepo personRepo = new PersonRepo();
        Person person1 = new Person(1, "Anna", DaysOfWeek.SATURDAY, Gender.FEMALE);
        Person person2 = new Person(2, "John", DaysOfWeek.SUNDAY, Gender.MALE);

        personRepo.save(person1);
        personRepo.save(person2);

        System.out.println(personRepo.getAllPersons().toString());
        System.out.println(personRepo.countPersonsPerGender(Gender.FEMALE));
        System.out.println(personRepo.findPersonsPerFeavouriteWeekday(DaysOfWeek.SATURDAY));
        System.out.println("person 1:" + personRepo.getPersonById(1).get().favouriteDay()); //orElseThrow() //orElse(new Student))
        System.out.println("person 3:" + personRepo.getPersonById(3));

        System.out.println("by name 1: " + personRepo.getPersonByName("Anna").get().name());
        System.out.println("by name 1 again: " + personRepo.getPersonByName("Anna").orElseThrow(() -> new NullPointerException("No data!")).name());
        System.out.println("by name 3: " + personRepo.getPersonByName("Ana").orElseThrow(() -> new NullPointerException("No data!")).name());

    }
}