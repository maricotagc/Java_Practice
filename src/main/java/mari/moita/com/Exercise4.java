package mari.moita.com;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {

    public static Person[] listContainsWomanAndMan(List<Person> people) {

        Person[] agePeople = new Person[2];

        for (Person person : people) {
            if ("male".equals(person.getGender())) {
                if (agePeople[0] == null || person.getAge() > agePeople[0].getAge()) {
                    agePeople[0] = person;
                }
            }
            else if ("female".equals(person.getGender())) {
                if (agePeople[1] == null || person.getAge() < agePeople[1].getAge()) {
                    agePeople[1] = person;
                }
            }
            else {
                new IllegalArgumentException("Gender must be female or male");
            }
        }

        return agePeople;
    }
}
