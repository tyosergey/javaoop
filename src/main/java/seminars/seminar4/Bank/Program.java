package seminars.seminar4.Bank;

public class Program {
    public static void main(String[] args) {
        BankCounter<Dollar> dollarBankCounter = new BankCounter<>(new Dollar(), 20);
        System.out.println(dollarBankCounter);
    }
}
