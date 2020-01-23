package com.escrow.escrowservice.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@Table
@Entity(name = "escrow")
@NoArgsConstructor
@AllArgsConstructor
public class EscrowEntity {
    @Id
    @Column(name = "payment_id", nullable = false)
    private Long payment_id;

    @Column(name = "gst_sender")
    private String gstSender;

    @Column(name = "gst_reciever")
    private String gstReciever;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "transferred_amount")
    private Long transferredAmount;

    @Column(name = "fulfillment_stage")
    private Long fullFillmentStage;

}

