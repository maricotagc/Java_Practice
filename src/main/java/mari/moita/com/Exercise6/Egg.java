package mari.moita.com.Exercise6;

public class Egg extends AbstractIngredient implements Ingredient {

    public Egg(Double weight) {
        super(weight);
    }

    @Override
    public double getCarbs() {
        return (this.weight * 1)/100;
    }

    @Override
    public double getFat() {
        return (this.weight * 12)/100;
    }

    @Override
    public double getProtein() {
        return (this.weight * 17)/100;
    }
}
