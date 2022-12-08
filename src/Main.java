import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        printNumbers();
        Product product1 = new Product("Томат", 45);
        Product product2 = new Product("Лук", 10);
        Product product3 = new Product("Огурец", 35);
        Product product4 = new Product("Кабачок", 20);
        Product product5 = new Product("Баклажан", 70);
        Product product6 = new Product("Апельсин", 40);
        Product product7 = new Product("Банан", 30);
        Product product8 = new Product("Банан", 30);
        Set<Product> products = new HashSet<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        System.out.println(products);
        System.out.println();
        int cost = 0;


        //Задание 1.2
        HashMap<Product, Integer> productForRecipe1 = new HashMap<>();
        productForRecipe1.put(product1, 3);
        productForRecipe1.put(product2, 1);
        productForRecipe1.put(product3, 2);
        Recipe recipe1 = new Recipe("Летний",productForRecipe1);
            int totalCost1 = 0;
            totalCost1 = productForRecipe1.get(product1) * product1.getCost() + productForRecipe1.get(product2) * product2.getCost() + productForRecipe1.get(product3) * product3.getCost();
        System.out.println(recipe1.getName() + productForRecipe1);
        System.out.println("Стоимость салата " + recipe1.getName() + " " + totalCost1 + " рублей");
        System.out.println();

        HashMap<Product, Integer> productForRecipe2 = new HashMap<>();
        productForRecipe2.put(product4, 2);
        productForRecipe2.put(product5, 1);
        Recipe recipe2 = new Recipe("Овощной", productForRecipe2);
            int totalCost2 = 0;
            totalCost2 = productForRecipe2.get(product4) * product4.getCost() + productForRecipe2.get(product5) * product5.getCost();
            System.out.println(recipe2.getName() + productForRecipe2);
            System.out.println("Стоимость салата " + recipe2.getName() + " " + totalCost2 + " рублей");
        System.out.println();

        HashMap<Product, Integer> productForRecipe3 = new HashMap<>();
        productForRecipe3.put(product6, 2);
        productForRecipe3.put(product7, 1);
        Recipe recipe3 = new Recipe("Фруктовый",productForRecipe3);
            int totalCost3 = 0;
            totalCost3 = productForRecipe3.get(product6) * product6.getCost() + productForRecipe3.get(product7) * product7.getCost();
            System.out.println(recipe3.getName() + productForRecipe3);
            System.out.println("Стоимость салата " + recipe3.getName() + " " + totalCost3 + " рублей");
        System.out.println();


        String productForRecipes1 = new String("Томат");
        String productForRecipes2 = new String("Лук");
        String productForRecipes3 = new String("Огурец");
        String productForRecipes4 = new String("Кабачок");
        String productForRecipes5 = new String("Баклажан");
        String productForRecipes6 = new String("Апельсин");
        String productForRecipes7 = new String("Банан");
        Set<String> productForRecipes = new HashSet<>(Arrays.asList(productForRecipes1, productForRecipes2, productForRecipes3, productForRecipes4, productForRecipes5, productForRecipes6, productForRecipes7));
        System.out.println(productForRecipes);

        printTasks();
        Passport passport1 = new Passport("6782 483726", "Щеглова", "Анна", "Ивановна", "12.12.2002");
        Passport passport2 = new Passport("6782 483726", "Задумкина", "Анна", "Ивановна", "12.12.2002");
        Passport passport3 = new Passport("3647 483728", "Самойлов", "Владимир", "Викторович", "05.11.1982");
        List<Passport> passports = new ArrayList<>();
        passports.add(passport1);
        passports.add(passport2);
        passports.add(passport3);
        System.out.println(passports);
    }

    public static Set<Integer> printNumbers() {
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() <= 20) {
            numbers.add(random.nextInt(1001));
        }
        numbers.removeIf(nextNumber -> nextNumber % 2 != 0);
        System.out.println(numbers);
        return numbers;
    }

    public static void printTasks() {
        Random number1 = new Random();
        int x = 1;
        if (number1.nextInt(9) != 0) {
            x = number1.nextInt(9);
        }
        Random number2 = new Random();
        int y = 1;
        if (number2.nextInt(9) > 0) {
            y = number2.nextInt(9);
        }
        Set<String> tasks = new HashSet<>(15);
        int i = 0;
        while (i <= 15) {
            i++;
            System.out.println(number1.nextInt(9) + "*" + number2.nextInt(9));
        }
    }
}
//    Домашнее задание № 3.4
//    В задании № 4 стоит использовать коллекцию HashSet.
//
//        Так как в коллекции ArrayList проверка на наличие объекта в списке осуществляется с помощью метода equals.
//        Т.е.сравниваются ссылки,затем возвращается true/false в зависимости от результата.
//        В LinkedList массива нет. В этой коллекции поиск элемента осуществляется по цепочке ссылок,
//        до нужной ссылки еще нужно дойти.
//        В HashSet использует метод hashCode()для поиска объекта.Эта коллекция выигрывает по сравнению с ArrayList,
//        так как время,которое мы тратим на поиск конкретного объекта в ArrayList,
//        зависит от количества элементов в массиве(необходимо итерироваться по всему массиву,чтобы сравнить элементы,
//        что при большом наборе данных менее эффективно).
//






