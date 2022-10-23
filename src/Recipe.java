import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final ArrayList<String> productForRecipes;
    private final String name;
    private final int totalCost;

    public Recipe(ArrayList<String> productForRecipes, String name, int totalCost) {
        this.productForRecipes = productForRecipes;
        this.name = name;
        this.totalCost = totalCost;
    }

    public ArrayList<String> getProductForRecipes() {
        return productForRecipes;

    }

    public String getName() {
        return name;
    }

    public int getTotalCost() {
        return totalCost;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return totalCost == recipe.totalCost && productForRecipes.equals(recipe.productForRecipes) && name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productForRecipes, name, totalCost);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "productForRecipes=" + productForRecipes +
                ", name='" + name + '\'' +
                ", totalCost=" + totalCost +
                '}';
    }

}


