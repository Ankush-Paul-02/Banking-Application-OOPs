public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Customer name, Account number
         * Customer email, Phone number
         * Deposit money, WithDraw money
         */

        Account ankushAccount = new Account("12345", "Ankush Paul", "ankush@gmail.com", "8413058005", 0.0);

        System.out.println(ankushAccount.getBalance());
        ankushAccount.depositMoney(200);
        ankushAccount.withDrawMoney(100);
        ankushAccount.withDrawMoney(200);
    }
}
