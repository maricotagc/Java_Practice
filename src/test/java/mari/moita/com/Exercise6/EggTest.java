package mari.moita.com.Exercise6;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EggTest {

    @Test
    public void shouldReturnWeightOfCarbs() {
        Egg egg = new Egg(10.0);
        Assert.assertEquals(Double.valueOf("0.1"), Double.valueOf(egg.getCarbs()));
    }

    @Test
    public void shouldReturnWeightOfFat() {
        Egg egg = new Egg(10.0);
        Assert.assertEquals(Double.valueOf("1.2"), Double.valueOf(egg.getFat()));
    }

    @Test
    public void shouldReturnWeightOfProtein() {
        Egg egg = new Egg(10.0);
        Assert.assertEquals(Double.valueOf("1.7"), Double.valueOf(egg.getProtein()));
    }
}