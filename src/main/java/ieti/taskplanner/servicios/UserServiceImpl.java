package ieti.taskplanner.servicios;

import ieti.taskplanner.model.Task;
import ieti.taskplanner.model.User;
import ieti.taskplanner.persistence.AppTasksPersistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private AppTasksPersistence persistence = new AppTasksPersistence();

    @Override
    public List<User> getAll() {
        return persistence.getAllUsers();
    }

    @Override
    public User getById(String userId) {       
        return persistence.getUserById(userId);
    }

    @Override
    public User create(User user) {
        User newUer = persistence.addUser(user);
        return newUer;
    }

    @Override
    public User update(User user) {
        User newUer = persistence.updateUser(user);
        return newUer;
    }

    @Override
    public void remove(String userId) {
        persistence.deleteUser(userId);

    }

}
