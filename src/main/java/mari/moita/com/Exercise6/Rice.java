package mari.moita.com.Exercise6;

public class Rice extends AbstractIngredient implements Ingredient {

    public Rice(Double weight) {
        super(weight);
    }

    @Override
    public double getCarbs() {
        return (this.weight * 9)/100;
    }

    @Override
    public double getFat() {
        return (this.weight * 1)/100;
    }

    @Override
    public double getProtein() {
        return (this.weight * 3)/100;
    }
}
