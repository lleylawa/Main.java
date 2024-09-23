public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(12345, "Leyla Rahmatova");

        account.deposit(500.00);
        account.deposit(200.00);
        account.withdraw(150.00);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: $" + account.getBalance());

        account.printTransactionHistory();
    }
}
