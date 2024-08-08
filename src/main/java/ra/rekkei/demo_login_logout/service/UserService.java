package ra.rekkei.demo_login_logout.service;

import ra.rekkei.demo_login_logout.dto.UserDto;
import ra.rekkei.demo_login_logout.entity.Users;

public interface UserService {
     Users findUsersByUserName(String userName);
     void saveUser(UserDto userDto);
     void saveAdmin(UserDto userDto);
}
