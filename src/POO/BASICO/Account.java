package POO.BASICO;

public class Account {
    private String name;
    private int number;
    private double balance;

    public Account() {
    }

    public Account(String name, int number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(Double value) {
        balance = balance + value - 5;
    }

    public void withdraw(Double value) {
        balance = balance - value - 5;
    }



    @Override
    public String toString() {
        return "Account " + number +
                ", Holder: " + name +
                ", Balance: $ " + balance;
    }
}
