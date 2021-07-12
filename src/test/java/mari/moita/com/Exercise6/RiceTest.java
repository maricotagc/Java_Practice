package mari.moita.com.Exercise6;

import org.junit.Assert;
import org.junit.Test;


public class RiceTest {

    @Test
    public void shouldReturnWeightOfCarbs() {
        Rice rice = new Rice();
        Assert.assertEquals(9.0, rice.getCarbs(), 1);
    }

    @Test
    public void shouldReturnWeightOfFat() {
        Rice rice = new Rice();
        Assert.assertEquals(9.0, rice.getCarbs(), 1);
    }

    @Test
    public void shouldReturnWeightOfProtein() {
        Rice rice = new Rice();
        Assert.assertEquals(9.0, rice.getCarbs(), 1);
    }
}