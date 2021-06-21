package mari.moita.com;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void shouldEqualsWork() {

        Person mariana = new Person("Mariana", "female", 38);
        Person raphael = new Person("Mariana", "female", 38);

        Assert.assertTrue(mariana.equals(raphael));

    }

}