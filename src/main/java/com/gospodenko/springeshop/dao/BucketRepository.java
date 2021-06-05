package com.gospodenko.springeshop.dao;

import com.gospodenko.springeshop.domain.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketRepository  extends JpaRepository<Bucket, Long> {
}
