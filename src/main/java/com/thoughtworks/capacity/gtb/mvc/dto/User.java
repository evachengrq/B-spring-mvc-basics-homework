package com.thoughtworks.capacity.gtb.mvc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;
    @NotBlank(message = "username must not be blank")
    private String username;
    @NotBlank(message = "password must not be blank")
    private String password;
    private String email;
}
