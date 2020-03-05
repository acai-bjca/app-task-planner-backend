package ieti.apptaskplanner2.servicios;

import java.util.List;

import ieti.apptaskplanner2.model.*;

public interface TaskService {
    List<Task> getAll();

    Task getById(String id);

    List<Task> getByUserId(String userId);

    Task assignTaskToUser(String taskId, String userId);

    void remove(String taskId);

    Task update(Task task);
}