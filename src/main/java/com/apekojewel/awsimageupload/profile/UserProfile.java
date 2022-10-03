package com.apekojewel.awsimageupload.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {
    private final UUID userProfileID;
    private final String username;
    private String profileImageLink;    //s3 key

    public UserProfile(UUID userProfileID, String username, String profileImageLink) {
        this.userProfileID = userProfileID;
        this.username = username;
        this.profileImageLink = profileImageLink;
    }

    public UUID getUserProfileID() {
        return userProfileID;
    }


    public String getUsername() {
        return username;
    }

    public Optional<String> getProfileImageLink() {
        return Optional.ofNullable(profileImageLink);
    }

    public void setProfileImageLink(String profileImageLink) {
        this.profileImageLink = profileImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(getUserProfileID(), that.getUserProfileID()) &&
                Objects.equals(getUsername(), that.getUsername()) &&
                Objects.equals(getProfileImageLink(), that.getProfileImageLink());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserProfileID(), getUsername(), getProfileImageLink());
    }
}
