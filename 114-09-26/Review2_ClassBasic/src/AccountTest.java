public class AccountTest {
    public static void main(String[] args) {
        // 建立兩個帳戶
        Account account1 = new Account("A123", 1000.0);
        Account account2 = new Account("B456", -2000.0); // 負數餘額會變成 0


        // 輸出初始狀態
        System.out.printf("帳戶號碼: %s%n初始餘額: %.2f%n",
                account1.getAccountNumber(), account1.getBalance());
        System.out.printf("帳戶號碼: %s%n初始餘額: %.2f%n",
                account2.getAccountNumber(), account2.getBalance());

        // 測試存款
        account1.deposit(500.0);
        System.out.printf("帳戶 %s 存款後餘額: %.2f%n",
                account1.getAccountNumber(), account1.getBalance());

        // 測試提款（合法）
        account1.withdraw(300.0);
        System.out.printf("帳戶 %s 提款後餘額: %.2f%n",
                account1.getAccountNumber(), account1.getBalance());

        // 測試提款（超過餘額）
        account1.withdraw(2000.0);

        // 測試非法操作
        account1.deposit(-100.0);
        account1.withdraw(-50.0);
    }
}
