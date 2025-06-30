import java.util.*;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showProduct() {
        System.out.println(name + " - ₹" + price);
    }
}

class Order {
    int orderId;
    List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            p.showProduct();
        }
    }
}

class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        System.out.println(name + " placed order " + o.orderId);
        o.showOrderDetails();
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Phone", 25000);
        Product p3 = new Product("Headphones", 2000);

        Order order1 = new Order(1001);
        order1.addProduct(p1);
        order1.addProduct(p3);

        Order order2 = new Order(1002);
        order2.addProduct(p2);

        Customer cust1 = new Customer("Aarav");
        Customer cust2 = new Customer("Neha");

        cust1.placeOrder(order1);
        cust2.placeOrder(order2);
    }
}

