package com.profiling.profilingservice.Repositories;

import com.profiling.profilingservice.entities.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<ProfileEntity, String> {
    @Query("select s from profile_entity s where s.gstno = ?1")
    ProfileEntity findBygstno(String gstno);
}
