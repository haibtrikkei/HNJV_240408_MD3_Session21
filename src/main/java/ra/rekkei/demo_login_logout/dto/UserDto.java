package ra.rekkei.demo_login_logout.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    @NotBlank(message = "Username is empty!")
    private String userName;
    @NotBlank(message = "Username is empty!")
    private String password;
    @NotBlank(message = "Username is empty!")
    private String fullName;
    @NotBlank(message = "Username is empty!")
    private String address;
    @NotBlank(message = "Username is empty!")
    @Email(message = "Email not valid")
    private String email;
}
