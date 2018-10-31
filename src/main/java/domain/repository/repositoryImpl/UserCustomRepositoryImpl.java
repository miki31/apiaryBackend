package domain.repository.repositoryImpl;

import domain.repository.UserCustomRepository;
import domain.repository.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserCustomRepositoryImpl implements UserCustomRepository {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<User> login(String login, String pass) {
        String sqlString = "select user.usr_login,usr_password from user where usr_login = :login and usr_password = :pass";
        Query query = entityManager.createNativeQuery(sqlString);
        query.setParameter("login",login);
        query.setParameter("pass",pass);
        return query.getResultList();
    }
}
