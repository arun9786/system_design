package org.security.example.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.security.example.enums.Role;

@Data
public class RegisterRequest {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    private Role role;

}
