package ieti.apptaskplanner2.servicios;

import ieti.apptaskplanner2.model.Task;
import ieti.apptaskplanner2.model.User;
import ieti.apptaskplanner2.persistence.AppTasksPersistence;

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
