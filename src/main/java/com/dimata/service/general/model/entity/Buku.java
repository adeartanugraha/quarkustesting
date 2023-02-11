package com.dimata.service.general.model.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "buku")
public class Buku extends PanacheEntityBase {
    @Id
    @GeneratedValue(generator = "dimata_id_gen")
    @Column(name = "BUKU_ID")
    public Long id;

    @CreationTimestamp
    @Column(name = "CREATED_AT")
    public LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "UPDATED_AT")
    public LocalDateTime updatedAt;

    @Column(name = "NAME")
    public String name;

    @Column(name = "AUTHOR")
    public String author;

    @Column(name = "PAGE")
    public Integer page;
}
