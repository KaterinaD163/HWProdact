import java.util.Objects;
import java.util.Set;

public class ListOfProducts {
    private Set<Product> products;


    public ListOfProducts(Set<Product> products) {
        this.products = products;
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
    }




