package object.oriented.kfm.day2;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/16 18:48
 * @desciption:
 */
public class BankAccount {
   /* 属性：账户号码（accountNumber）、账户持有人姓名（accountHolder）、余额
（balance）
    方法：构造方法、获取账户号码的方法、获取账户持有人姓名的方法、获取余
    额的方法、存款方法、取款方法*/

    private String accountNumber;
    private String accountHolder;
    private Double balance;

    public BankAccount() {
    }

    public BankAccount(String accountHolder, String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}
