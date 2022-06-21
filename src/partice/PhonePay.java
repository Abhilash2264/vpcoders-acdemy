package partice;

public class PhonePay {
    private int number;
    private String accountName;
    private int balance;
    private int selfAccount;

    public PhonePay(int number, int balance, int selfAccount) {
        this.number = number;
        this.balance = balance;
        this.selfAccount = selfAccount;
    }

    public int getNumber() {
        return number;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getSelfAccount() {
        return selfAccount;
    }

    public void setSelfAccount(int selfAccount) {
        this.selfAccount = selfAccount;
    }
}
