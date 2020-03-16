package ieti.taskplanner.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import ieti.taskplanner.model.Task;
import ieti.taskplanner.persistence.AppTasksPersistence;
import ieti.taskplanner.servicios.TaskService;

@Service
public class TaskServiceImp implements TaskService {
    private AppTasksPersistence persistence = new AppTasksPersistence();

    
    public List<Task> getAll() {        
        return persistence.getAllTasks();
    }

    
    public Task getById(String id) {        
        return persistence.getTaskById(id);
    }

    
    public List<Task> getByUserId(String userId) {
        return persistence.getTaskByUserId(userId);
    }

    
    //Considero que n odebe ir el usuario si no el id del usuario como parámetro
    public Task assignTaskToUser(String taskId, String userId) {
        return persistence.assignTaskToUser(taskId, userId);
    }

    
    public void remove(String taskId) {
        persistence.deleteTask(taskId);

    }

    
    public Task update(Task task) {
        Task taskUpdate = persistence.updateTask(task);
        return taskUpdate;
    }
}