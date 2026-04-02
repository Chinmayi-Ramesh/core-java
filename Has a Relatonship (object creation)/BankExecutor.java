class BankExecutor {
    public static void main(String[] args) {

        
        Bank b1 = new Bank();
        b1.bankId = 1;
        b1.bankName = "SBI";
        b1.location = "Bangalore";
        b1.isNationalized = true;

        AccountHolder a1 = new AccountHolder();
        a1.holderId = 101;
        a1.name = "Ravi";
        a1.accountType = "Savings";
        a1.hasDebitCard = true;

        b1.accountHolder = a1;


        
        Bank b2 = new Bank();
        b2.bankId = 2;
        b2.bankName = "HDFC";
        b2.location = "Mysore";
        b2.isNationalized = false;

        AccountHolder a2 = new AccountHolder();
        a2.holderId = 102;
        a2.name = "Sita";
        a2.accountType = "Current";
        a2.hasDebitCard = true;

        b2.accountHolder = a2;


        
        Bank b3 = new Bank();
        b3.bankId = 3;
        b3.bankName = "ICICI";
        b3.location = "Chennai";
        b3.isNationalized = false;

        AccountHolder a3 = new AccountHolder();
        a3.holderId = 103;
        a3.name = "Arjun";
        a3.accountType = "Savings";
        a3.hasDebitCard = false;

        b3.accountHolder = a3;


        
        Bank b4 = new Bank();
        b4.bankId = 4;
        b4.bankName = "Axis";
        b4.location = "Hyderabad";
        b4.isNationalized = false;

        AccountHolder a4 = new AccountHolder();
        a4.holderId = 104;
        a4.name = "Meena";
        a4.accountType = "Current";
        a4.hasDebitCard = true;

        b4.accountHolder = a4;


        
        Bank b5 = new Bank();
        b5.bankId = 5;
        b5.bankName = "Canara";
        b5.location = "Delhi";
        b5.isNationalized = true;

        AccountHolder a5 = new AccountHolder();
        a5.holderId = 105;
        a5.name = "Kiran";
        a5.accountType = "Savings";
        a5.hasDebitCard = true;

        b5.accountHolder = a5;


       
        Bank b6 = new Bank();
        b6.bankId = 6;
        b6.bankName = "Union Bank";
        b6.location = "Mumbai";
        b6.isNationalized = true;

        AccountHolder a6 = new AccountHolder();
        a6.holderId = 106;
        a6.name = "Divya";
        a6.accountType = "Current";
        a6.hasDebitCard = false;

        b6.accountHolder = a6;


        
        Bank b7 = new Bank();
        b7.bankId = 7;
        b7.bankName = "Kotak";
        b7.location = "Pune";
        b7.isNationalized = false;

        AccountHolder a7 = new AccountHolder();
        a7.holderId = 107;
        a7.name = "Rahul";
        a7.accountType = "Savings";
        a7.hasDebitCard = true;

        b7.accountHolder = a7;


        
        Bank b8 = new Bank();
        b8.bankId = 8;
        b8.bankName = "Indian Bank";
        b8.location = "Coimbatore";
        b8.isNationalized = true;

        AccountHolder a8 = new AccountHolder();
        a8.holderId = 108;
        a8.name = "Lakshmi";
        a8.accountType = "Savings";
        a8.hasDebitCard = false;

        b8.accountHolder = a8;


        
        Bank b9 = new Bank();
        b9.bankId = 9;
        b9.bankName = "Yes Bank";
        b9.location = "Noida";
        b9.isNationalized = false;

        AccountHolder a9 = new AccountHolder();
        a9.holderId = 109;
        a9.name = "Vikas";
        a9.accountType = "Current";
        a9.hasDebitCard = true;

        b9.accountHolder = a9;


        
        Bank b10 = new Bank();
        b10.bankId = 10;
        b10.bankName = "PNB";
        b10.location = "Jaipur";
        b10.isNationalized = true;

        AccountHolder a10 = new AccountHolder();
        a10.holderId = 110;
        a10.name = "Anita";
        a10.accountType = "Savings";
        a10.hasDebitCard = true;

        b10.accountHolder = a10;


        
        b1.getBankDetails();
        b2.getBankDetails();
        b3.getBankDetails();
        b4.getBankDetails();
        b5.getBankDetails();
        b6.getBankDetails();
        b7.getBankDetails();
        b8.getBankDetails();
        b9.getBankDetails();
        b10.getBankDetails();
    }
}