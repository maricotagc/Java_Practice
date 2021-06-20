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
    public void shouldReturnOldestManAndYoungestWoman() {

        List<Person> inputList = new ArrayList<>();
        inputList.add(new Person("Mari", "female", 38));
        inputList.add(new Person("Rapha", "male", 44));
        inputList.add(new Person("Juliana", "female", 33));
        inputList.add(new Person("Lucas", "male", 2));

        Person[] expectedList = new Person[2];
        expectedList[0] = new Person("Rapha", "male", 44);
        expectedList[1] = new Person("Juliana", "female", 33);

        Person[] actualList = Exercise4.listContainsWomanAndMan(inputList);
        Assert.assertEquals(expectedList[0].getName(), actualList[0].getName());
        Assert.assertEquals(expectedList[1].getName(), actualList[1].getName());
    }

    @Test
    public void shouldReturnExceptionForInvalidGender() {

        List<Person> inputList = new ArrayList<>();
        inputList.add(new Person("Mari", "gay", 38));
        inputList.add(new Person("Rapha", "males", 44));

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("Gender must be female or male"));
        Exercise4.listContainsWomanAndMan(inputList);
    }

}