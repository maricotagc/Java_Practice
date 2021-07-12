package mari.moita.com.Exercise6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;


public class DietTest {

    Diet diet;
    Rice rice;
    Egg egg;

    @Before
    public void initialize() {
        rice = new Rice();
        egg = new Egg();
        Map<Ingredient, Double> ingredients = new HashMap<>();
        ingredients.put(rice,100.0);
        ingredients.put(egg,20.0);
        diet = new Diet(ingredients);
    }

    @Test
    public void shouldReturnTotalCalories() {
        Assert.assertEquals(32.0, diet.getTotalCalories(), 1);
    }

    @Test
    public void shouldReturnNewTotalOfCalories() {
        Assert.assertEquals(48.0, diet.addExtraIngredient(egg), 1);
    }
}