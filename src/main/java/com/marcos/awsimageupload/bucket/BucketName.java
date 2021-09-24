package com.marcos.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("java-react-image-bucket");

    private final String bucketName;

    BucketName(String bucketName)
    {
        this.bucketName = bucketName;
    }

    public String getBucketName()
    {
        return bucketName;
    }
}