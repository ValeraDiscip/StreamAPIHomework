package functional;

import homework.Order;
import homework.Product;

import java.util.Comparator;
import java.util.List;

public abstract class ProductFunctionality {
    public static List<Product> getProductsOver100(List<Product> products) {
        return products.stream()
                .filter(x -> x.getCost() > 100 && x.getType().equals("продукты"))
                .toList();
    }

    public static double getCountForToys(List<Product> products) {
        double toysCost = products.stream()
                .filter(x -> x.getType().equals("игрушки"))
                .mapToDouble(Product::getCost)
                .sum();
        if (toysCost != 0.0) {
            return toysCost * 0.1;
        } else return 0.0;
    }

    public static List<Product> getProductsInAlphabetOrder(List<Product> products, String type) {
        return products.stream()
                .filter(x -> x.getType().equals(type))
                .sorted(Comparator.comparing(Product::getName))
                .toList();
    }

    public static List<Order> getNotPaidOrders(List<Order> orders) {
        return orders.stream()
                .filter(x -> !x.isPaid())
                .toList();
    }

    public static double getTotalCost(List<Product> products) {
        return products.stream()
                .mapToDouble(Product::getCost)
                .sum();
    }
}
