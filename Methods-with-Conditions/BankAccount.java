class BankAccount {
	
	//property/state/ref/var 
    static double balance;

    static double getBalance(){
        return balance;
    }

    static void credit(double amount){
        if(amount > 0.0){
            balance = balance + amount;
		}
        else{
            System.out.println("Invalid Credit Amount.");
		}
    }

    static void debit(double amount){
        if(amount > 0.0){
            balance = balance - amount;
		}
        else{
            System.out.println("Invalid debit amount or insufficient balance");
		}
    }
}
