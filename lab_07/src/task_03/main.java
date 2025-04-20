package task_03;

public class main {

    public static void main(String[] args) {
        Bank_account Account01 = new Bank_account();
        SavingsAccount Account02 = new SavingsAccount();

        System.out.println("BankAccount interest rate: " + (Account01.getInterestRate() * 100) + "%");
        System.out.println("SavingsAccount interest rate: " + (Account02.getInterestRate() * 100) + "%");
    }
}
