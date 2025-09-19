public class Account {
    // 帳號
    private String accountNumber;
    // 帳戶持有人
    private String accountHolder;
    // 帳戶餘額
    private double balance;

    /**
     * 建構子，初始化帳號、持有人與初始餘額
     * @param accountNumber 帳號
     * @param accountHolder 帳戶持有人
     * @param initialBalance 初始餘額
     */
    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    /**
     * 取得帳號
     * @return 帳號
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 取得帳戶持有人
     * @return 帳戶持有人
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * 取得帳戶餘額
     * @return 帳戶餘額
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 存款功能，金額需大於0
     * @param amount 存款金額
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    /**
     * 提款功能，金額需大於0且不得超過餘額
     * @param amount 提款金額
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    /**
     * 取得帳戶資訊字串
     * @return 帳戶資訊
     */
    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
