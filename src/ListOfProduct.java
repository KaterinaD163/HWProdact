import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class ListOfProduct {
    public static Set<Product> products = new HashSet<>();


    public ListOfProduct(Set<Product> products) {

        this.products = products;
    }

    public static Set<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ListOfProduct that = (ListOfProduct) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), products);
    }

    public static void addProduct(Product product) {
        Set<Product> products = new HashSet<>();
        if (!products.add(new Product())) {
            throw new RuntimeException("Такой продукт уже есть!");
        } else if (product.getName().isEmpty()) {
            throw new RuntimeException("Заполните карточку товара полностью!");
        }
    }

    public static void removeProduct() {
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




