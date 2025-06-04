public class Account {

    private int balance;
    private int interest;

    public Account(int money) {
        this.balance = money;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void withdraw(int money) {
        this.balance -= money;
    }

    public void welfare() {
        this.balance = (this.balance / 100) * (100 + interest);
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public int getInterest() {
        return interest;
    }

    public int predictWelfare(int year) {
        int ret = balance;
        for (int i = 0; i < year; i++) {
            ret += (int) (ret / 100.0 * (interest));
        }
        return ret;
    }
}
