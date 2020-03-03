package ieti.servicios;

import java.util.List;
import ieti.model.Task;

public interface TaskService {
    List<Task> geAll();

    Task getById(String id);

    List<Task> getByUserId(String userId);

    Task assignTaskToUser(String taskId, User user);

    void remove(String taskId);

    Task update(Task task);
}