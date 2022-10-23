import java.util.Objects;
import java.util.Set;

public class ListOfProducts extends Product {

    private Set<Product> products;

    public ListOfProducts(String name, int cost, double weight) {
        super(name, cost, weight);
    }

    public boolean checkSameProduct() throws Exception {
        if (getName().contains(getName())) {
            throw new Exception("Введите новый продукт!");
        } else {
            return true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ListOfProducts that = (ListOfProducts) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), products);
    }

    public boolean checkCorrectnessOfFilling() throws Exception {
        if (getName().isEmpty() || getCost() <= 0 || getWeight() <= 0.0) {
            throw new Exception("Введите данные!");
        } else {
            return true;
        }
    }
}



