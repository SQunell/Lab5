import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {
    /** groovy. */
    public static final double COOL_INTEREST_RATE = .01;
    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /** a checking account. */
        CHECKINGS,
        /** a savings account. */
        SAVINGS,
        /** a student account. */
        STUDENT,
        /** a bad account. */
        WORKPLACE
    }
/** unique id for account. */
    private int accountNumber;
    /** type of account as listed in enum. */
    public BankAccountType accountType;
    /** measurement of total dosh. */
    private double accountBalance;
    /** name of owner of account. */
    private String ownerName;
    /** interest rate for account. */
    public double interestRate;
    /** total amount of interest earned in account. */
    private double interestEarned;
    /** build-a-bank workshop.
    @param name name of account
    @param accountCategory type of account
    */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        accountBalance = 0;
        accountNumber = Bank.totalAccounts;
        interestRate = COOL_INTEREST_RATE;
        Bank.totalAccounts++;
        /*
         * Implement this function
         */
    }

    /** adds interest.
     * @param time time
     */
    public void interesting(final double time) {
        double newammount = accountBalance * Math.exp(COOL_INTEREST_RATE * time);
        interestEarned += (newammount - accountBalance);
        accountBalance = newammount;
    }
    /** gets account number.
     * @return account number*/
    public int getAccountNumber() {
        return accountNumber;
    }
     /** sets account number.
     * @param setNum account number */
    public void setAccountNumber(final int setNum) {
        accountNumber = setNum;
    }

    /** gets account balance.
     * @return account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /** sets account balance.
     * @param setNum desired account balance.
     */
    public void setAccountBalance(final double setNum) {
        accountBalance = setNum;
    }

    /** gets owner name.
     * @return owner name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /** i am sure you can figure out what this one does.
     * @param setName desired hmmmmmmmmmmm
     */
    public void setOwnerName(final String setName) {
        ownerName = setName;
}

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}