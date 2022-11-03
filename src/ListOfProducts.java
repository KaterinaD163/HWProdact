import java.util.HashSet;
import java.util.Iterator;
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

    public static void addProduct() {
        Set<Product> products = new HashSet<>();
        for (Product product : products) {
            if (products.contains(products)) {
                System.out.println("Такой продукт уже есть в списке!");
            } else {
                System.out.println(products.add((Product) products));
            }
        }
    }
    public static void removeProduct() {
        Set<Product> products = new HashSet<>();
        Iterator<Product> productsIterator = products.iterator();
        while (productsIterator.hasNext()) {
            Product nextProduct = productsIterator.next();
            if (nextProduct.equals(products)) {
                productsIterator.remove();
            }
        }
        System.out.println("Товар уже куплен");
    }
}




