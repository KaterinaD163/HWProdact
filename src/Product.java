import java.util.Objects;
import java.util.Set;

public class Product {
    private static String name;
    private final int cost;
    private final double weight;

    public Product(String name, int cost, double weight) {
        Product.name = name;
        this.cost = cost;
        this.weight = weight;
    }

    public static String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return cost == product.cost && Double.compare(product.weight, weight) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, weight);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                '}';
    }

    public boolean checkSameProduct() throws Exception {
        if (getName().contains(getName())) {
            throw new Exception("Введите новый продукт!");
        } else {
            return true;
        }
    }
}