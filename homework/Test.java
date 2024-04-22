package homework;

import functional.ProductFunctionality;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("продукты", 129, "молоко"),
                new Product("продукты", 105, "макароны"),
                new Product("игрушки", 399, "плюшевый заяц"),
                new Product("продукты", 77, "мороженое"),
                new Product("продукты", 99, "печенье"),
                new Product("игрушки", 677, "дракон коллекционный"),
                new Product("игрушки", 345, "плюшевый медведь"),
                new Product("продукты", 200, "плитка шоколада"),
                new Product("продукты", 182, "колбаска московская"),
                new Product("продукты", 55, "соленые палочки"),
                new Product("продукты", 128, "сыр"),
                new Product("игрушки", 233, "пабло бравл старс"),
                new Product("игрушки", 29, "брелок 11-22"),
                new Product("продукты", 93, "сливочное масло"),
                new Product("игрушки", 900, "коллекционный орел"),
                new Product("игрушки", 300, "оливковое масло"));

        List<Product> products1 = Arrays.asList(new Product("продукты", 200, "плитка шоколада"),
                new Product("продукты", 182, "колбаска московская"),
                new Product("продукты", 55, "соленые палочки"),
                new Product("продукты", 128, "сыр"),
                new Product("игрушки", 233, "пабло бравл старс"),
                new Product("игрушки", 29, "брелок 11-22"),
                new Product("продукты", 93, "сливочное масло"),
                new Product("игрушки", 900, "коллекционный орел"),
                new Product("игрушки", 300, "оливковое масло"));

        List<Product> products2 = Arrays.asList(new Product("продукты", 77, "мороженое"),
                new Product("продукты", 99, "печенье"),
                new Product("игрушки", 677, "дракон коллекционный"),
                new Product("игрушки", 345, "плюшевый медведь"),
                new Product("продукты", 200, "плитка шоколада"));

        List<Product> products3 = Arrays.asList(new Product("продукты", 182, "колбаска московская"),
                new Product("продукты", 55, "соленые палочки"),
                new Product("продукты", 128, "сыр"),
                new Product("игрушки", 233, "пабло бравл старс"),
                new Product("игрушки", 29, "брелок 11-22"),
                new Product("продукты", 93, "сливочное масло"));

        //Проверяем методы:
        System.out.println(ProductFunctionality.getProductsOver100(products));
        //проверку проходит\

        System.out.println(ProductFunctionality.getCountForToys(products));
        //проверку проходит

        System.out.println(ProductFunctionality.getProductsInAlphabetOrder(products, "игрушки"));
        //проверку проходит

        Order order = new Order("22.04.2024", "0", products);
        System.out.println(order.getTotalCost());
        order.getCount();
        order.payForOrder();

        Order order1 = new Order("21.04.2024", "1", products1);
        Order order2 = new Order("20.04.2024", "2", products2);
        Order order3 = new Order("11.04.2024", "3", products3);
        System.out.println(order3.getTotalCost());
        order3.getCount();
        order3.payForOrder();

        List<Order> orders = Arrays.asList(order1, order2, order3, order);
        System.out.println(ProductFunctionality.getNotPaidOrders(orders));
        //здесь все также проходит проверку.
    }
}
