package mari.moita.com.Exercise6;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EggTest {

    @Test
    public void shouldReturnCarbs() {
        Egg egg = new Egg();
        Assert.assertEquals(9.0, egg.getCarbs(), 1);
    }

    @Test
    public void shouldReturnWeightOfFat() {
        Egg egg = new Egg();
        Assert.assertEquals(2.0, egg.getFat(), 1);
    }

    @Test
    public void shouldReturnWeightOfProtein() {
        Egg egg = new Egg();
        Assert.assertEquals(5.0, egg.getProtein(), 1);
    }
}