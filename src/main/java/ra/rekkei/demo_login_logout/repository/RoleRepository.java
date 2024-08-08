package ra.rekkei.demo_login_logout.repository;


import ra.rekkei.demo_login_logout.entity.Roles;

public interface RoleRepository{
    Roles findRolesByRoleName(String roleName);
}
