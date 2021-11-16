package mari.moita.com.Exercise6;

public abstract class AbstractIngredient implements Ingredient{

    protected double carbs;
    protected double fat;
    protected  double protein;

    public AbstractIngredient(double carbs, double fat, double protein) {
        this.carbs = carbs;
        this.fat = fat;
        this.protein = protein;
    }
    @Override
    public double getCarbs() {
        return carbs;
    }

    @Override
    public double getFat() {
        return fat;
    }

    @Override
    public double getProtein() {
        return protein;
    }
}
