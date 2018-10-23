package Service;

import DAO.UserDAO;
import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    public void addPerson(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(user);
        logger.info("Person saved successfully, Person Details="+user);
    }

    public void updatePerson(User user) {

    }

    public List<User> listUsers() {
        return null;
    }

    public User getUserById(int id) {
        return null;
    }

    public void removeUser(int id) {

    }

    public boolean compareCredentials(User user) {
        return false;
    }
}
