package seminars.seminar1;

import java.util.List;

public class VendingMachineWater implements VendingMachine{
    private List<Product> productList;

    public void initProduct(List<Product> a){
        productList = a;
    }

    public Product getProduct(String name){
        for (int i = 0; i < productList.size(); i++){
            if(name.equals(productList.get(i).getName())){
                return productList.get(i);
            }
        }
        return null;
    }
}
