package com.example.umcstudy.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.Positive;

public class MemberDto {
    @Getter
    @Setter
    @AllArgsConstructor
    public static class Post {
        private long memberId;
        private String name;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Patch {
        private long memberId;
        private String name;
        private String pay;
        private float temperature;
        private String image;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Put {
        private long memberId;
        private String name;
        private String pay;
        private float temperature;
        private String image;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Response {
        private long memberId;
        private String name;
        private String pay;
        private float temperature;
        private String image;
    }
}
