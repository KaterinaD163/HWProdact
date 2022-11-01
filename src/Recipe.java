import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final Set<String> productForRecipes;
    private final String name;
    private final int totalCost;

    public Recipe(Set<String> productForRecipes, String name, int totalCost) {
        this.productForRecipes = productForRecipes;
        this.name = name;
        this.totalCost = totalCost;
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
        return name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
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


