public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int deposit =1105;
        int newBalance;
        if (deposit > 1000) {
            newBalance = balance + deposit + deposit / 100;
        } else {
            newBalance = balance + deposit;
        }
        System.out.println(newBalance);
    }
}
