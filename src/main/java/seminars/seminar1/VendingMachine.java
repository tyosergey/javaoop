package seminars.seminar1;

import java.util.List;

public interface VendingMachine {
    /**
     * @apiNote Метод инициализирует товар
     * @param a коллекция товаров
     */
    void initProduct(List<Product> a);

    /**
     *
     * @param name название товара
     * @return название товара и его стоимость
     */
    Product getProduct(String name);
}
