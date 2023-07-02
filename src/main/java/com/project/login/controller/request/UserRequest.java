package com.project.login.controller.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserRequest {

    @NotNull
    private String name;

    @NotNull
    @Min(8)
    private String password;

    @NotNull
    @Email
    private String email;
}