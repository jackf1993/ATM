public class BankAccount {
    private int balance;
    private final String customerName;
    private final int accountNumber;
    private final String email;
    private final long phoneNumber;

    public BankAccount(){
        this.balance = 0;
        this.accountNumber = 0;
        this.customerName = "";
        this.email = "";
        this.phoneNumber = 0;
    }
    public BankAccount(int balance, int accountNumber, long phoneNumber, String customerName, String email){
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public String getCustomerName(){
        return customerName;
    }

    public int incrementBalance(int increment){
        this.balance += increment;
        return balance;
    }

    public int withdrawlBalance(int withdrawal){
        this.balance -= withdrawal;
        if(this.balance < 0){
            this.balance += withdrawal;
            return -1;
        }
        return balance;
    }
}
