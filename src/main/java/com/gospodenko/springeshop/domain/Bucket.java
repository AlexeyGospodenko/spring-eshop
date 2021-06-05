package com.gospodenko.springeshop.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "BUCKETS")
public class Bucket {

    private static final String SEQ_NAME = "BUCKET_SEQ";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    private Long id;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToMany
    @JoinTable(name = "BUCKETS_PRODUCTS",
            joinColumns = @JoinColumn(name = "BUCKET_ID"),
            inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID"))
    private List<Product> products;
}