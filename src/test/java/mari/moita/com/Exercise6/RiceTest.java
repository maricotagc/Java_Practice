package mari.moita.com.Exercise6;

import org.junit.Assert;
import org.junit.Test;


public class RiceTest {

    @Test
    public void shouldReturnWeightOfCarbs() {
        Rice rice = new Rice(300.0);
        Assert.assertEquals(Double.valueOf("27"), Double.valueOf(rice.getCarbs()));
    }

    @Test
    public void shouldReturnWeightOfFat() {
        Rice rice = new Rice(300.0);
        Assert.assertEquals(Double.valueOf("3"), Double.valueOf(rice.getFat()));
    }

    @Test
    public void shouldReturnWeightOfProtein() {
        Rice rice = new Rice(300.0);
        Assert.assertEquals(Double.valueOf("9"), Double.valueOf(rice.getProtein()));
    }
}