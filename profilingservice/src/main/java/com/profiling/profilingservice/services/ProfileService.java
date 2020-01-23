package com.profiling.profilingservice.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.profiling.profilingservice.Repositories.ProfileRepository;
import com.profiling.profilingservice.entities.ProfileEntity;
import com.profiling.profilingservice.models.Profile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProfileService {
    private ProfileRepository profileRepository;
    private ObjectMapper jsonMapper;


    @Autowired
    public ProfileService(ProfileRepository profileRepository, ObjectMapper mapper){
        this.profileRepository = profileRepository;
        this.jsonMapper = mapper;

    }

    public Profile getUserProfile(String gstno){
        ProfileEntity profileEntity = profileRepository.findBygstno(gstno);
        Profile profile = jsonMapper.convertValue(profileEntity, Profile.class);

        return profile;
    }
}
