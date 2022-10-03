package com.apekojewel.awsimageupload.datastore;

import com.apekojewel.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class PseudoUserProfileData {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        //USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "anthonydoe", null));
        //USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "timothyagboada", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("8bee1506-2ea6-4699-8c23-dca86e878803"), "anthonydoe", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("5b1e14ec-8fa1-4055-b2d2-a5d8d4a982ae"), "timothyagboada", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
