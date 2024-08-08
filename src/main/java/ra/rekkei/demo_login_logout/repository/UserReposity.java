package ra.rekkei.demo_login_logout.repository;


import ra.rekkei.demo_login_logout.entity.Users;

public interface UserReposity{
    Users findUsersByUserName(String userName);
    Users save(Users user);
}
