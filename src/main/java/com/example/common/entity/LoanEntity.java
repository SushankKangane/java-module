package com.example.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class  LoanEntity {
    @Id
    private Long id;
    private String loanId;
}
