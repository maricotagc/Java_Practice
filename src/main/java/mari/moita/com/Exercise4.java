package mari.moita.com;

import java.util.List;

public class Exercise4 {

    public void listContainsManAndWoman(List<Person> people) {

        boolean female = false;
        boolean male = false;

        for (Person p : people) {
            if ("male".equals(p.getGender())) {
                male = true;
            } else if ("female".equals(p.getGender())) {
                female = true;
            }
        }
        if (!female || !male) {
            throw new IllegalArgumentException("List must have, at least, one male and one female.");
        }
    }

    public Person[] OldestManAndYoungestWoman(List<Person> people) {

        listContainsManAndWoman(people);

        Person[] agePeople = new Person[2];

        for (Person person : people) {
            if ("male".equals(person.getGender())) {
                if (agePeople[0] == null || person.getAge() > agePeople[0].getAge()) {
                    agePeople[0] = person;
                }
            } else if ("female".equals(person.getGender())) {
                if (agePeople[1] == null || person.getAge() < agePeople[1].getAge()) {
                    agePeople[1] = person;
                }
            }
        }
        return agePeople;
    }
}
