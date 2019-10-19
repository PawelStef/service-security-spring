package com.javagda25.serviceSecurity.repository;

import com.javagda25.serviceSecurity.model.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRoleRepository extends JpaRepository<AccountRole, Long> {

    Optional<AccountRole> findByName(String name);
    boolean existsByName(String name);
}
