public class Bank {
    String name;

    public Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer c) {
        System.out.println("Account opened for " + c.name + " in " + name);
    }
}

class Customer {
    String name;
    double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Bank bank = new Bank("Axis Bank");

        Customer c1 = new Customer("Anjali", 5000);
        Customer c2 = new Customer("Rohit", 12000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();
    }
}
