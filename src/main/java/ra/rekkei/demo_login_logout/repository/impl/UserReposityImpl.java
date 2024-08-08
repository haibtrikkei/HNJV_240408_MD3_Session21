package ra.rekkei.demo_login_logout.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ra.rekkei.demo_login_logout.entity.Roles;
import ra.rekkei.demo_login_logout.entity.Users;
import ra.rekkei.demo_login_logout.repository.UserReposity;

@Repository
public class UserReposityImpl implements UserReposity {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Users findUsersByUserName(String userName) {
        Session session = sessionFactory.openSession();
        try{
            Users user = (Users) session.createQuery("from Users where userName = :userName")
                    .setParameter("userName",userName)
                    .getSingleResult();
            return user;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    @Override
    public Users save(Users user) {
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            return user;
        }catch (Exception ex){
            ex.printStackTrace();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return null;
    }
}
