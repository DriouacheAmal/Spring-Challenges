package com.example.To.Do.App.BackEnd.Entities.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserRequestDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
