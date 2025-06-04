import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account(1000);
    }

    @Test
    void initAccountPrice() {
        assertEquals(1000, account.getBalance());
    }

    @Test
    void depositAndConfirm() {
        account.deposit(300);
        assertEquals(1300, account.getBalance());
    }

    @Test
    void withdrawAndConfirm() {
        account.withdraw(100);
        assertEquals(900, account.getBalance());
    }

    @Test
    void welfareAndConfirm() {
        account.setInterest(5);
        account.welfare();
        assertEquals(1050, account.getBalance());
    }

    @Test
    void interestAndConfirm() {
        account.setInterest(10);
        assertEquals(10, account.getInterest());
    }

    @Test
    void predictWelfareAcountAndConfirm() {
        account.setInterest(5);
        assertEquals(1623, account.predictWelfare(10));
    }
}