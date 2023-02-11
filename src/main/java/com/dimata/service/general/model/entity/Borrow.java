package com.dimata.service.general.model.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "borrow")
public class Borrow {
    @Id
    @GeneratedValue(generator = "dimata_id_gen")
    @Column(name = "BORROW_ID")
    public Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BUKU_ID")
    public Buku buku;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    public Member member;

    @CreationTimestamp
    @Column(name = "BORROWED_AT")
    public LocalDateTime borrowedAt;

    @Column(name = "DUE_AT")
    public LocalDateTime dueAt;

    @Column(name = "LATE_FEE")
    public Double lateFee;
}
