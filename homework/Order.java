package homework;

import functional.ProductFunctionality;

import java.util.List;

public class Order {
    private String registrationDate;
    private String uniqueNumber;
    private String paymentDate;
    private boolean paid;
    private double totalCost;
    private List<Product> products;

    public Order() {
        super();
    }
    /*мы создаем заказ и сразу устанавливаем дату регистрации, уникальный номер и список продуктов - я считаю логично
    после получения скидки по возможности и оплаты уже можно будет установить дату оплаты и статус оплачено
    общая стоимость рассчитывается сама по себе при создании товара и также кладется в соответсвующее поле
     */

    public Order(String registrationDate, String uniqueNumber, List<Product> products) {
        this.registrationDate = registrationDate;
        this.uniqueNumber = uniqueNumber;
        this.products = products;
        this.paid = false;
        this.totalCost = ProductFunctionality.getTotalCost(this.products);
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(String uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void getCount() {
        if (this.totalCost > 1000) {
            totalCost = this.totalCost - this.totalCost * 0.05;
            System.out.println("Вы получаете общую скидку! Сумма оплаты со скидкой: " + this.totalCost);
        } else {
            double toysCount = ProductFunctionality.getCountForToys(this.products);
            if (toysCount == 0.0) {
                System.out.println("К сожалению, вы не получаете скидку. Сумма к оплате: " + this.totalCost);
            } else {
                this.totalCost -= toysCount;
                System.out.println("Вы получаете скидку на игрушки! Сумма к оплате: " + this.totalCost);
            }
        }
    }

    public void payForOrder() {
        this.paid = true;
        System.out.println("Заказ на сумму " + this.totalCost + " успешно оплачен!");
    }

    @Override
    public String toString() {
        return "Order{" +
                "registrationDate='" + registrationDate + '\'' +
                ", uniqueNumber='" + uniqueNumber + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                ", paid=" + paid +
                ", totalCost=" + totalCost +
                ", products=" + products +
                '}';
    }
}
