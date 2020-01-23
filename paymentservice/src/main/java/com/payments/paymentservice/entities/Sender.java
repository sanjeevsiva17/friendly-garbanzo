package com.payments.paymentservice.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Table
@Entity(name = "sender")
@NoArgsConstructor
@AllArgsConstructor
public class Sender {
    @Id
    @Column(name = "gstno", nullable = false)
    private String gstno;

    @Column(name = "amount")
    private Long amount;
}
