package OOP_Pillar.CHATGPT_STUDY.encapsulation;

public class Main {

    public static void main(String[] args) {
        bankAccount acc = new bankAccount();
        acc.deposit(500);
        System.out.println(acc.getBalance());
    }

}
