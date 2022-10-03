package com.apekojewel.awsimageupload.profile;

import com.apekojewel.awsimageupload.datastore.PseudoUserProfileData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {
    private final PseudoUserProfileData pseudoUserProfileData;

    @Autowired

    public UserProfileDataAccessService(PseudoUserProfileData pseudoUserProfileData) {
        this.pseudoUserProfileData = pseudoUserProfileData;
    }

    List<UserProfile> getUserProfiles() {
        return pseudoUserProfileData.getUserProfiles();
    }
}
