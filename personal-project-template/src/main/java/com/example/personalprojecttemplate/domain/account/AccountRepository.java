package com.example.personalprojecttemplate.domain.account;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query(value = "select a from Account a left join fetch a.stories")
    Account findByAccountIdWithStory(Long accountId);

    List<AccountInfo> findByUsername(String username);
}