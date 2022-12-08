import java.util.*;

public class Recipe {
    private HashMap<Product, Integer> productForRecipe;
    private final String name;

    public Recipe(String name, HashMap<Product, Integer> productForRecipe) {
        this.productForRecipe = productForRecipe;
        this.name = name;
    }

    public static void putProduct(HashMap<Product, Integer> productForRecipes) {
        if (productForRecipes.containsValue(0) || productForRecipes.containsValue(null)) {
            System.out.println(productForRecipes.containsValue(1));
        }
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);


    }

    @Override
    public String toString() {
        return "Recipe{" +
                "productForRecipe=" + productForRecipe +
                ", name='" + name + '\'' +
                '}';
    }
}

