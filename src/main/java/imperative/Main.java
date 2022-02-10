package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Maraim",FEMALE),
                new Person("Major",MALE),
                new Person("Dorcas",MALE),
                new Person("Dorcas",FEMALE),
                new Person("Morayo",FEMALE),
                new Person("James",FEMALE),
                new Person("Joshua",MALE),
                new Person("Manna",FEMALE)
        );
        System.out.println("============================================");
        System.out.println("==============Imperative====================");
        List<Person> females = new ArrayList<Person>();

        for(Person person : people){
            if(person.gender.equals(FEMALE)){
                females.add(person);
            }

        }
        for(Person female : females){
            System.out.println(female);
        }

        //Declarative
        System.out.println("============================================");
        System.out.println("==============Declarative====================");
        List<Person> female2 =people.stream()
                .filter(person->person.gender.equals(FEMALE))
                .collect(Collectors.toList());

        female2.forEach(System.out::println);


//              people.stream()
//                        .map(person -> person.gender)
//                      .collect(Collectors.toSet()).forEach(System.out::println);
      people.stream()
              .map(person->person.gender)
              .collect(Collectors.toSet()).forEach(System.out::println);

    }

    static class Person{
      private final String name;
      private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE,FEMALE
    }
}
