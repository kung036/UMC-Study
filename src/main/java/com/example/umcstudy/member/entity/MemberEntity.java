package com.example.umcstudy.member.entity;

import com.example.umcstudy.utils.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Positive;

@Getter
@Setter
@Entity(name = "MEMBER")
public class MemberEntity extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long memberId;

    @Column(length = 10, nullable = false)
    private String name;

    @Column(nullable = false)
    private int pay = 0;

    @Column(nullable = false)
    private double temperature = 36.5;

    @Column(nullable = false)
    private String image = "https://server?name=basic_image";
}