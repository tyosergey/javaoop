package seminars.seminar1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1 = new BottleWater("Bon Aqua", 500);
        Product product2 = new HotDrinks("Capuccino", 700, 40);
        Product product3 = new HotDrinks("Green Tea", 200, 70);

        VendingMachine vendingMachine1 = new VendingMachineWater();
        VendingMachine vendingMachine2 = new VendingMachineHotDrinks();

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        vendingMachine1.initProduct(productList);
        System.out.println(vendingMachine1.getProduct("Bon Aqua"));

        vendingMachine2.initProduct(productList);
        vendingMachine2.initProduct(productList);
        System.out.println(vendingMachine2.getProduct("Capuccino"));
        System.out.println(vendingMachine2.getProduct("Green Tea"));
        System.out.println(vendingMachine2.getProduct("Latte"));
    }
}
