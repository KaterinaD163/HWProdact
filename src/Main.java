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
        System.out.println(Arrays.toString(products.toArray()));

        String productForRecipes1 = new String("Томат");
        String productForRecipes2 = new String("Лук");
        String productForRecipes3 = new String("Огурец");
        String productForRecipes4 = new String("Кабачок");
        String productForRecipes5 = new String("Баклажан");
        String productForRecipes6 = new String("Апельсин");
        String productForRecipes7 = new String("Банан");
        ArrayList<String> productForRecipes = new ArrayList<>(Arrays.asList(productForRecipes1, productForRecipes2, productForRecipes3, productForRecipes4, productForRecipes5, productForRecipes6, productForRecipes7));
        System.out.println(productForRecipes);
        Recipe recipe1 = new Recipe(new ArrayList<>(Arrays.asList(productForRecipes1, productForRecipes2, productForRecipes3)), "Летний", 150);
        Recipe recipe2 = new Recipe(new ArrayList<>(Arrays.asList(productForRecipes1, productForRecipes4, productForRecipes5)), "Овощной", 250);
        Recipe recipe3 = new Recipe(new ArrayList<>(Arrays.asList(productForRecipes6, productForRecipes7)), "Фруктовый", 200);
        System.out.println(recipe1);
        System.out.println(recipe2);
        System.out.println(recipe3);
        System.out.println();
        printTasks();


        Map<String, String> map = new HashMap<>();
        map.put("6782 483726", "Щеглова Анна Ивановна, 12.12.2002");
        map.put("6782 483726", "Задумкина Анна Ивановна, 12.12.2002");
        map.put("3647 483728", "Самойлов Владимир Викторович, 05.11.1982");
        System.out.println(map.get("6782 483726"));
    }

    public static void printNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>(20);
        for (int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()) {
            Integer nextNumber = numbersIterator.next();
            if (nextNumber % 2 != 0) {
                numbersIterator.remove();
            }
        }
        System.out.println(numbers.subList(0, 20));
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
        ArrayList<String> tasks = new ArrayList<>(15);
        for (int i = 0; i < 15; i++) {
            tasks.add(number1.nextInt(9) + "*" + number2.nextInt(9));
            System.out.println(number1.nextInt(9) + "*" + number2.nextInt(9));
        }
    }
}

//    В задании № 4стоит использовать коллекцию HashSet.
//
//        Так как в коллекции ArrayList проверка на наличие объекта в списке осуществляется с помощью метода equals.
//        Т.е.сравниваются ссылки,затем возвращается true/false в зависимости от результата.
//        В LinkedList массива нет. В этой коллекции поиск элемента осуществляется по цепочке ссылок,
//        до нужной ссылки еще нужно дойти.
//        В HashSet использует метод hashCode()для поиска объекта.Эта коллекция выигравает по сравнению с ArrayList,
//        так как время,которое мы тратим на поиск конкретного объекта в ArrayList,
//        зависит от количества элементов в массиве(необходимо итерироваться по всему массиву,чтобы сравнить элементы,
//        что при большом наборе данных менее эффективно).
//






