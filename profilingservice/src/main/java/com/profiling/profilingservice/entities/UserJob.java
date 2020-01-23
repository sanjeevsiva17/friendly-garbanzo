package com.profiling.profilingservice.entities;

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
@Entity(name = "user_job")
@NoArgsConstructor
@AllArgsConstructor
public class UserJob {
    @Id
    @Column(name = "job_id", nullable = false)
    private Long jobid;

    @Column(name = "gst_sender")
    private String gstSender;

    @Column(name = "gst_reciever")
    private String gstReciever;

}
