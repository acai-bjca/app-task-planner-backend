package ieti.taskplanner.servicios;

import java.util.List;

import ieti.taskplanner.model.*;

public interface TaskService {
    List<Task> getAll();

    Task getById(String id);

    List<Task> getByUserId(String userId);

    Task assignTaskToUser(String taskId, String userId);

    void remove(String taskId);

    Task update(Task task);
}