import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ListOfRecipe {
    private Set<Recipe> recipes;
    private final String name;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListOfRecipe that = (ListOfRecipe) o;
        return Objects.equals(recipes, that.recipes) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipes, name);
    }

    public ListOfRecipe(String name) {
        this.name = name;
    }

    public static void addRecipe(Recipe recipe) throws Exception {
        Set<Recipe> recipes = new HashSet<>();
        for (var listOfRecipe : recipes) {
            if (listOfRecipe.getName().equals(recipe.getName())) {
                throw new Exception("Такой рецепт уже есть");
            }
        }
        recipes.add(recipe);
    }
}
