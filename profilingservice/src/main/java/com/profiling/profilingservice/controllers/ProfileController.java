package com.profiling.profilingservice.controllers;

import com.profiling.profilingservice.models.Profile;
import com.profiling.profilingservice.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/profile")
public class ProfileController {
    private ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService){
        this.profileService = profileService;
    }

    @CrossOrigin
    @GetMapping(value = "/{gstno}")
    public ResponseEntity get(@PathVariable(name = "gstno") String gstno){
        Profile profile;
        profile = this.profileService.getUserProfile(gstno);
        return new ResponseEntity(profile, HttpStatus.OK);
    }
}
