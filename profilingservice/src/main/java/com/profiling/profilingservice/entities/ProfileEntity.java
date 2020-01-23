package com.profiling.profilingservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Table
@Entity(name = "profile_entity")
@NoArgsConstructor
@AllArgsConstructor
public class ProfileEntity {

    @Id
    @Column(name = "gstno", nullable = false)
    private String gstno;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "business_name")
    private String business_name;

    @Column(name = "password")
    private String password;

}
