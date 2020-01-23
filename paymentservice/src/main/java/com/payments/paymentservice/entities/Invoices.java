package com.payments.paymentservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Table
@Entity(name = "invoice")
@NoArgsConstructor
@AllArgsConstructor
public class Invoices {
    @Id
    @Column(name = "payment_id", nullable = false)
    private Long payment_id;

    @Column(name = "amount")
    private Long amount;
}
