package OOP_Pillar.CHATGPT_STUDY.encapsulation;

public class bankAccount {

    private double balance; // hidden data

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

}
