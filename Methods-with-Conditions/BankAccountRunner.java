class BankAccountRunner {

    public static void main(String[] args) {

        BankAccount.credit(5000);
        double availableBalance = BankAccount.getBalance();
        System.out.println("Balance: " + availableBalance);

        BankAccount.debit(2000);
        double availableBalanceOne = BankAccount.getBalance();
        System.out.println("Balance: " + availableBalanceOne);
    }
}


