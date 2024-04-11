package seminars.seminar4.Bank;

public class BankAccount<T> {
    private T currency;

    public BankAccount(T currency) {
        this.currency = currency;
    }

    public T getCurrency() {
        return currency;
    }

    public void setCurrency(T currency) {
        this.currency = currency;
    }
}
