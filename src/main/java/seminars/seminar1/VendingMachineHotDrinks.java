package seminars.seminar1;

import java.util.List;

public class VendingMachineHotDrinks implements VendingMachine{
    private List<Product> productList;

    @Override
    public void initProduct(List<Product> a) {
        this.productList = a;
    }

    public Product getProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getName())) {
                return productList.get(i);
            }
        }
        return null;
    }
}
