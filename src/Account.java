public class Account {
    private String account_number, name, email, phone_number;
    private double balance;

    public Account(String account_number, String name, String email, String phone_number, double balance) {
        this.account_number = account_number;
        this.name = name;
        this.balance = balance;
        this.email = email;
        this.phone_number = phone_number;
    }

    public void depositMoney(double depositedMoney) {
        this.balance += depositedMoney;
        System.out.println("Deposit is successful, new balance is: " + this.balance);
    }

    public void withDrawMoney(double requiredMoney) {
        if(this.balance - requiredMoney < 0) {
            System.out.println("WithDraw unsuccessful due to low balance!, only " + this.balance + " is left");
        } else {
            this.balance -= requiredMoney;
            System.out.println("WithDraw successful!");
            System.out.println("Remaining balance: " + this.balance);
        }
    }


    public String getAccount_number() {
        return account_number;
    }
    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
