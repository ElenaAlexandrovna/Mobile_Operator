public class Main {
    public static void main(String[] args) {

        int balance = 200; //изначальный баланс счета//
        int payment = 1001; // сумма пополнения//
        int bonus;
        int totaBalance;

        if (payment > 1000) {
            bonus = payment / 100;
            totaBalance = balance + payment + bonus;
            System.out.println("Ваш бонус: " + bonus);
            System.out.println("Ваш баланс составляет: " + totaBalance);
        } else {
            totaBalance = balance + payment;
            System.out.println("Ваш баланс составляет: " + totaBalance);
        }
    }
}