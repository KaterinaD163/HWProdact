import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ListOfRecipe {
    private Set<String> listOfRecipes;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListOfRecipe that = (ListOfRecipe) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public ListOfRecipe(String name) {
        this.name = name;
    }
    public void addPassports(Recipe name) {
        Set<String> listOfRecipes = new HashSet<>();
        if (!name.getName().isEmpty()){
            System.out.println(listOfRecipes.add(String.valueOf(name)));
        }
    }
}
