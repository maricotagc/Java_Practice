package mari.moita.com.Exercise6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;


public class DietTest {

    Diet diet;
    Rice rice = new Rice(300.0);
    Egg egg = new Egg(20.0);

    @Before
    public void initialize() {
        rice = new Rice(300.0);
        egg = new Egg(20.0);
        Map<Ingredient, Double> ingredients = new HashMap<>();
        ingredients.put(rice,rice.weight);
        ingredients.put(egg,egg.weight);
        diet = new Diet(ingredients);
    }

    @Test
    public void shouldReturnTotalCalories() {
        Assert.assertEquals(Double.valueOf("45.0"), Double.valueOf(diet.getTotalCalories()));
    }

    @Test
    public void shouldReturnNewTotalOfCalories() {
        Assert.assertEquals(Double.valueOf("51"), Double.valueOf(diet.addExtraIngredient(egg)));
    }
}