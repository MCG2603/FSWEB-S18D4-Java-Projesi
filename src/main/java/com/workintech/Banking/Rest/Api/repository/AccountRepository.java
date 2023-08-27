package com.workintech.Banking.Rest.Api.repository;

import com.workintech.Banking.Rest.Api.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
