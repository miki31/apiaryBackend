package DAO;

import entity.User;

import java.util.List;

public interface UserDAO {

    public void addPerson(User user);
    public void updatePerson(User user);
    public List<User> listUsers();
    public User getUserById(int id);
    public void removeUser(int id);

    public boolean compareCredentials(User user);
}
