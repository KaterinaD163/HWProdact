import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {
    private String name;
    private int cost;
    private double weight;

    public Product(String name, int cost, double weight) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                '}';
    }
}