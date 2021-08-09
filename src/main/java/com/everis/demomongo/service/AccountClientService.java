package com.everis.demomongo.service;

import com.everis.demomongo.bean.AccountClientBean;
import com.everis.demomongo.bean.ResponseAccountClient;
import com.everis.demomongo.repository.SavingsAccountRepository;
import com.everis.demomongo.utils.Webclients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AccountClientService
{
    @Autowired
    Webclients webclients;

    @Autowired
    private SavingsAccountRepository repository;

    public Mono<ResponseAccountClient> sendClientAccount(String documentNumber, String numberAccount){
        return repository.findByAccountNumber(numberAccount)
                .flatMap(currentAccount -> {
                    AccountClientBean clientBean =
                            new AccountClientBean(currentAccount.getId(),
                                    currentAccount.getAccountNumber(),
                                    "Saving", currentAccount.getMaxMonthlyTransactions(),
                                    currentAccount.getAccountBalance());

                    return webclients.sendClientAccount(clientBean, documentNumber);
                });
    }
}