package com.debtor.dzialek.repository;

import com.debtor.dzialek.model.db.Debtor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebtorRepository extends JpaRepository<Debtor, String> {

}
