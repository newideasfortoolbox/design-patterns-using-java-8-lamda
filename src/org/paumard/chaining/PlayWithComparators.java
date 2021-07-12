package org.paumard.chaining;

import org.paumard.chaining.function.Comparator;
import org.paumard.chaining.model.Person;

public class PlayWithComparators {

    public static void main(String[] args) {

        Person mary = new Person("Mary", 28);
        Person john = new Person("John", 22);
        Person linda = new Person("Linda", 26);
        Person james = new Person("James", 32);
        Person jamesBis = new Person("James", 26);

        Comparator<Person> cmp =
                Comparator.comparing(Person::getName)
                          .thenComparing(Person::getAge);

        System.out.println("Mary > John : " + (cmp.compare(mary, john) > 0));
        System.out.println("Jhon > James : " + (cmp.compare(john, james) > 0));
        System.out.println("Linda > John : " + (cmp.compare(linda, john) > 0));
        System.out.println("James > James Bis : " + (cmp.compare(james, jamesBis) > 0));
    }

}
