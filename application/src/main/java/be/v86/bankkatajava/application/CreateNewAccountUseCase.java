package be.v86.bankkatajava.application;

import be.v86.bankkatajava.domain.Account;

class CreateNewAccountUseCase {

    Account execute() {
        return new Account();
    }
}
