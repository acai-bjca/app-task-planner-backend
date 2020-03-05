package ieti.apptaskplanner2.servicios;

import java.util.List;

import ieti.apptaskplanner2.model.User;

public interface UserService {
    List<User> getAll();
    
    User getById(String userId);
    
    User create(User user);
    
    User update(User user);
    
    void remove(String userId);
}