package mari.moita.com.Exercise6;

import java.util.Map;

public class Diet {

    private final Map<Ingredient, Double> ingredientHashMap;

    public Diet(Map<Ingredient, Double> ingredientHashMap) {
        this.ingredientHashMap = ingredientHashMap;
    }

    //TODO fix calculation which should include weight
    public double getTotalCalories(){
        double total = 0;
        for (Map.Entry<Ingredient, Double> entry : ingredientHashMap.entrySet()) {
            Ingredient ingredient = entry.getKey();
            total = total + ingredient.getFat() + ingredient.getProtein() + ingredient.getCarbs();
        }
        return total;
    }

    public void addExtraIngredientAndQuantity(Ingredient ingredient, Double quantity) {
        ingredientHashMap.put(ingredient, quantity);
    }
}
