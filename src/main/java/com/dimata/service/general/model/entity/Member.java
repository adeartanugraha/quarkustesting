package com.dimata.service.general.model.entity;

import com.dimata.service.general.model.enums.MemberStatus;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(generator = "dimata_id_gen")
    @Column(name = "MEMBER_ID")
    public Long id;

    @CreationTimestamp
    @Column(name = "CREATED_AT")
    public LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "UPDATE_AT")
    public LocalDateTime updateAt;

    @Column(name = "NAME")
    public String name;

    public String getName(){
        return name.toUpperCase();
    }

    public void setName(){
        this.name = name.toUpperCase();
    }

    @Column(name = "ADDRESS")
    public String address;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    public MemberStatus status;

    public void setStatus(MemberStatus status) {
        if (status == null) {
            this.status = MemberStatus.ACTIVE;
        }
    }
}
