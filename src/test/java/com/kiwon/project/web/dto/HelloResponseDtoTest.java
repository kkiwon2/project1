package com.kiwon.project.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class HelloResponseDtoTest {
    @Test
    public void test(){
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
