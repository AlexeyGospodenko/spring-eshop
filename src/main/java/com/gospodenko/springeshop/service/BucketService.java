package com.gospodenko.springeshop.service;

import com.gospodenko.springeshop.domain.Bucket;
import com.gospodenko.springeshop.domain.User;
import com.gospodenko.springeshop.dto.BucketDTO;

import java.util.List;

public interface BucketService {
    Bucket createBucket(User user, List<Long> productIds);

    void addProducts(Bucket bucket, List<Long> productIds);

    BucketDTO getBucketByUser(String name);
}
