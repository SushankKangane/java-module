package com.example.common.repository;

import com.example.common.entity.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanEntityRepository extends JpaRepository<LoanEntity, Long> {
    List<LoanEntity> findAllById(Long id);
}
