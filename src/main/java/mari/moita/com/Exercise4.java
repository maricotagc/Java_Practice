package mari.moita.com;

import java.util.List;

public class Exercise4 {

    private static final String MALE = "male";
    private static final String FEMALE = "female";

    private static final int MALE_INDEX = 0;
    private static final int FEMALE_INDEX = 1;

    public void listContainsManAndWoman(List<Person> people) {

        boolean male = false;
        boolean female = false;

        for (Person p : people) {
            if (MALE.equalsIgnoreCase(p.getGender())) {
                male = true;
            } else if (FEMALE.equalsIgnoreCase(p.getGender())) {
                female = true;
            }
        }
        if (!male || !female) {
            throw new IllegalArgumentException("List must have, at least, one male and one female.");
        }
    }

    public Person[] getOldestManAndYoungestWoman(List<Person> people) {

        listContainsManAndWoman(people);

        Person[] agePeople = new Person[2];

        for (Person person : people) {
            if (MALE.equals(person.getGender())) {
                if (agePeople[MALE_INDEX] == null || person.getAge() > agePeople[0].getAge()) {
                    agePeople[MALE_INDEX] = person;
                }
            } else if (FEMALE.equals(person.getGender())) {
                if (agePeople[FEMALE_INDEX] == null || person.getAge() < agePeople[1].getAge()) {
                    agePeople[FEMALE_INDEX] = person;
                }
            }
        }
        return agePeople;
    }
}
