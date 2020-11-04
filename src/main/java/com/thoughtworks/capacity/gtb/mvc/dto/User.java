package com.thoughtworks.capacity.gtb.mvc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;
    @NotBlank(message = "username must not be blank")
    @Pattern(regexp = "[0-9A-Za-z_]{3,10}", message = "username must includes only numbers, characters or lower dash with a length of 3-10")
    private String username;
    @NotBlank(message = "password must not be blank")
    @Size(min = 5, max = 12, message = "password must have 5-12 characters")
    private String password;
    @Email(message = "not a valid email address")
    private String email;
}
