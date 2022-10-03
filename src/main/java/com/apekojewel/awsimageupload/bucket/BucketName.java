package com.apekojewel.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("apekojewel-image-upload-2022");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
