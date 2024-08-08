package ra.rekkei.demo_login_logout.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ra.rekkei.demo_login_logout.entity.Roles;
import ra.rekkei.demo_login_logout.repository.RoleRepository;

@Repository
public class RoleRepositoryImpl implements RoleRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Roles findRolesByRoleName(String roleName) {
        Session session = sessionFactory.openSession();
        try{
            Roles role = (Roles) session.createQuery("from Roles where roleName = :roleName")
                    .setParameter("roleName",roleName)
                    .getSingleResult();
            return role;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
}
