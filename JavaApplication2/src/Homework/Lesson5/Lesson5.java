package Homework.Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        BankAccount bA = new BankAccount(1, "Ivan", 100.0);
        BankAccount bA2 = new BankAccount(2, "Petr", 250.0);
        bA.popolnenieScheta(30);
        bA.info();
        bA2.snyatieSoScheta(40);
        bA2.info();
    }
}

class BankAccount {
    int ID;
    String name;
    double balance;

    BankAccount(int newID, String newName, double newBalance) {
        ID = newID;
        name = newName;
        balance = newBalance;
    }

    void popolnenieScheta(int summaPopolneniya) {
        balance+=summaPopolneniya;
    }
    void snyatieSoScheta(int summaSnyatiya){
        balance-=summaSnyatiya;
    }
    void info() {
        System.out.println("User ID: " + ID);
        System.out.println("User name: " + name);
        System.out.println("User balance: " + balance);
    }
}