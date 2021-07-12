package mari.moita.com.Exercise6;

import java.util.HashMap;
import java.util.Map;

public class Diet {

    Map<Ingredient, Double> ingredientHashMap = new HashMap<Ingredient, Double>();

    public Diet(Map<Ingredient, Double> ingredientHashMap) {
        this.ingredientHashMap = ingredientHashMap;
    }

    private double getTotalProtein(){
        double total = 0;
        for (Map.Entry<Ingredient, Double> entry : ingredientHashMap.entrySet()) {
            total = total + entry.getKey().getProtein();
        }
        return total;
    }

    private double getTotalCarb(){
        double total = 0;
        for (Map.Entry<Ingredient, Double> entry : ingredientHashMap.entrySet()) {
            total = total + entry.getKey().getCarbs();
        }
        return total;
    }

    private double getTotalFat(){
        double total = 0;
        for (Map.Entry<Ingredient, Double> entry : ingredientHashMap.entrySet()) {
            total = total + entry.getKey().getFat();
        }
        return total;
    }

    public double getTotalCalories(){
        return getTotalCarb() + getTotalFat() + getTotalProtein();
    }

    public double addExtraIngredient(Ingredient ingredient) {
        double total = getTotalCalories();
        if (ingredient instanceof Rice) {
            total = total + ingredient.getCarbs() + ingredient.getProtein() + ingredient.getFat();
        }
        if (ingredient instanceof Egg) {
            total = total + ingredient.getCarbs() + ingredient.getProtein() + ingredient.getFat();
        }
        return total;
    }
}
