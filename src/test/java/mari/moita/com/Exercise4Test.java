package mari.moita.com;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;

public class Exercise4Test {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnNothing() {

        Exercise4 test = new Exercise4();

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Mari", "female", 38));
        personList.add(new Person("Rapha", "male", 44));

        test.listContainsManAndWoman(personList);
    }

    @Test
    public void shouldReturnIllegalArgExceptionForOnlyMen() {

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("List must have, at least, one male and one female."));

        Exercise4 test = new Exercise4();

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Mari", "male", 38));
        personList.add(new Person("Rapha", "male", 44));

        test.listContainsManAndWoman(personList);
    }

    @Test
    public void shouldReturnOldestManAndYoungestWoman() {
        Exercise4 test = new Exercise4();

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Mari", "female", 38));
        personList.add(new Person("Rapha", "male", 44));
        personList.add(new Person("Juliana", "female", 33));
        personList.add(new Person("Lucas", "male", 2));

        Person[] expectedPersonArray = new Person[2];
        expectedPersonArray[0] = new Person("Rapha", "male", 44);
        expectedPersonArray[1] = new Person("Juliana", "female", 33);

        Person[] actualPersonArray = test.getOldestManAndYoungestWoman(personList);
        Assert.assertEquals(expectedPersonArray[0].getName(), actualPersonArray[0].getName());
        Assert.assertEquals(expectedPersonArray[1].getName(), actualPersonArray[1].getName());
    }

    @Test
    public void shouldReturnExceptionForListContainingOnlyWoman() {
        Exercise4 test = new Exercise4();

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("List must have, at least, one male and one female."));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Mari", "female", 38));
        personList.add(new Person("Raphaela", "female", 44));

        test.getOldestManAndYoungestWoman(personList);
    }

    @Test
    public void shouldReturnExceptionForListContainingOnlyMan() {

        Exercise4 test = new Exercise4();

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("List must have, at least, one male and one female."));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Mari", "male", 38));
        personList.add(new Person("Raphaela", "male", 44));

        test.getOldestManAndYoungestWoman(personList);
    }
}