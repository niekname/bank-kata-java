package be.v86.bankkatajava.application;

import be.v86.bankkatajava.domain.Account;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CreateNewAccountUseCaseTest {

    @Test
    void createAccount() {
        CreateNewAccountUseCase cna = new CreateNewAccountUseCase();
        Account a = cna.execute();
        assertThat(a.balance()).isEqualTo(0);
    }

}
