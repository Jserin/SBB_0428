package com.ll.sbb1.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
    @Size(min = 3, max = 25)
    @NotEmpty(message = "id 필수")
    private String username;

    @NotEmpty(message = "password 필수")
    private String password1;

    @NotEmpty(message = "password check 필수")
    private String password2;

    @NotEmpty(message = "email 필수")
    @Email
    private String email;

}
