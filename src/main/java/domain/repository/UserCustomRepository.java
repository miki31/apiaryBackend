package domain.repository;

import domain.repository.model.User;

import java.util.List;

public interface UserCustomRepository {

    public List<User> login(String login, String pass);
}
