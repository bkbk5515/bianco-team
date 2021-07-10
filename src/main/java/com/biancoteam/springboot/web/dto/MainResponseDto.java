package com.biancoteam.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MainResponseDto {
    private final String name;
    private final int amount;

}
