import org.example.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    BankAccount account;
    @BeforeEach
    public void setUp() {
        account = new BankAccount("Sarah", "Abdulle", "05/08/1999", 1001);
    }

    //test the getters
    @Test
    public void canGetFirstName(){
        String actual = account.getFirstName();
        String expected = "Sarah";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetLastName(){
        String actual = account.getLastName();
        String expected = "Abdulle";
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void canGetDOB(){
        String actual = account.getDateOfBirth();
        String expected = "05/08/1999";
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void canGetAccountNumber(){
        int actual = account.getAccountNumber();
        int expected =  1001;
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void canGetBalance(){
        int actual = (int) account.getBalance();
        int expected = 500;
        assertThat(actual).isEqualTo(expected);
    }

    //    TEST THE SETTERS
    @Test
    public void canSetFirstName(){
        String actual = account.setFirstName("Vanessa");
        String expected = "Vanessa";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void cansetLastName() {
        String actual = account.setLastName("Cornwall");
        String expected = "Cornwall";
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void canSetDOB() {
        String actual = account.setDateOfBirth("03/05/1998");
        String expected = "03/05/1998";
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void canSetAccountNumber() {
        int actual = account.setAccountNumber(1234);
        int expected = 1234;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetBalance(){
        double actual = account.setBalance(1001);
        double expected = 1001;
        assertThat(actual).isEqualTo(expected);
    }
//    Test for withdrawal, deposit and payInterest
    @Test
    public void canWithdraw(){
        double actual = account.withdrawal(10);
        double expected = 490;
        assertThat(actual).isEqualTo(expected);

    }
    @Test
    public void canDeposit(){
        double actual = account.deposit(10);
        double expected = 510;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canPayInterest(){
        double actual =  account.payInterest(0.005);
        double expected = 500.25;
    }

}
