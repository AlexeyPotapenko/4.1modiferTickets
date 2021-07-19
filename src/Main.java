public class Main {
    public static void main(String[] args) {
        int balance = 13450;
        int add = 2700;
        int bonus = 0;
        balance = balance + add;
        if (add > 1000) {
            bonus = add / 100;
            balance = balance + bonus;
        }
        System.out.println(balance);
        System.out.println(bonus);

    }
}