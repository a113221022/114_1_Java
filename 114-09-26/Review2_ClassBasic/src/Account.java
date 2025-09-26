public class Account {
    private String accountNumber;
    private double balance;

    // 建構子
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance > 0.0) {
            this.balance = initialBalance;
        }
    }

    // 存款
    public void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }
    }

    // 提款
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("提款失敗：餘額不足！");
        } else if (amount > 0.0) {
            balance -= amount;
        }
    }

    // 取得帳號
    public String getAccountNumber() {
        return accountNumber;
    }

    // 取得餘額
    public double getBalance() {
        return balance;
    }
}

