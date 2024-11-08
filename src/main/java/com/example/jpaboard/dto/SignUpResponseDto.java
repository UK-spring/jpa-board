package com.example.jpaboard.dto;

import lombok.Getter;

@Getter
public class SignUpResponseDto {
    private final Long id;

    public SignUpResponseDto(Long id) {
        this.id = id;
    }
}
