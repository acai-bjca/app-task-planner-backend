package ieti.taskplanner.model;

import java.util.ArrayList;
import java.util.List;

public class User{
    private String userId;
    private String name;
    private String email;
    private String pasw;
    private List<Task> tasks;
    //private String paswConfirmation;

    public User(String userId, String name, String email, String pasw){
        this.userId=userId;
        this.name=name;
        this.email=email;
        this.pasw=pasw;
        this.tasks = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return pasw;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void setUserId(String userId) {
        this.userId = userId;
    } 

    public void setName(String name) {
        this.name = name;
    }    

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String pasw) {
        this.pasw = pasw;
    }

} 