import java.util.*;

public class Main {


    public static void main(String[] args) {
        printNumbers();
        Product product1 = new Product("Томат", 245, 3.5);
        Product product2 = new Product("Лук", 60, 1.5);
        Product product3 = new Product("Огурец", 135, 2.8);
        Product product4 = new Product("Кабачок", 120, 4.0);
        Product product5 = new Product("Баклажан", 200, 3.4);
        Product product6 = new Product("Апельсин", 180, 2.9);
        Product product7 = new Product("Банан", 130, 2.7);
        Product product8 = new Product("Банан", 130, 2.7);
        Set<Product> products = new HashSet<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        System.out.println(products);

        String productForRecipes1 = new String("Томат");
        String productForRecipes2 = new String("Лук");
        String productForRecipes3 = new String("Огурец");
        String productForRecipes4 = new String("Кабачок");
        String productForRecipes5 = new String("Баклажан");
        String productForRecipes6 = new String("Апельсин");
        String productForRecipes7 = new String("Банан");
        Set<String> productForRecipes = new HashSet<>(Arrays.asList(productForRecipes1, productForRecipes2, productForRecipes3, productForRecipes4, productForRecipes5, productForRecipes6, productForRecipes7));
        System.out.println(productForRecipes);
        Recipe recipe1 = new Recipe(new HashSet<>(Arrays.asList(productForRecipes1, productForRecipes2, productForRecipes3)), "Летний", 150);
        Recipe recipe2 = new Recipe(new HashSet<>(Arrays.asList(productForRecipes1, productForRecipes4, productForRecipes5)), "Овощной", 250);
        Recipe recipe3 = new Recipe(new HashSet<>(Arrays.asList(productForRecipes6, productForRecipes7)), "Фруктовый", 200);
        System.out.println(recipe1);
        System.out.println(recipe2);
        System.out.println(recipe3);
        System.out.println();
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
//        Set<Integer> numbers = new HashSet<>();
//        for (int i = 0; i < 20; i++) {
//            double random = Math.random() * 1000;
//            numbers.add((int) random);
//        }
//        numbers.removeIf(nextNumber -> nextNumber % 2 != 0);
//        return numbers;
//        System.out.println(numbers);
//    }


        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();
        int i = 0;
        while (numbers.size() <= 20) {
            i++;
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
        while (i < 15) {
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






