package seminars.seminar4.Bank;

public class BankCounter <T extends Exchange>{
    private T currency;

    private int balance;
    public BankCounter(T currency, int balance) {
        this.currency = currency;
        this.balance = balance;
    }

    public T getCurrency() {
        return currency;
    }

    public void setCurrency(T currency) {
        this.currency = currency;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankCounter{" +
                "currency=" + currency +
                ", balance=" + balance +
                '}';
    }

    public int GetMoney(int sum){
        balance = balance - sum;
        return balance;
    }

    public int PutMoney(int sum){
        balance = balance + sum;
        return balance;
    }
}
