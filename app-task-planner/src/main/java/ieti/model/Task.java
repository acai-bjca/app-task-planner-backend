package ieti.model;

public class Task{
    private String description;
    private String nameResponsible;
    private String emailResponsible;
    private String status;
    private String dueDate;

    public Task(String description, String nameResponsible, String emailResponsible, String status, String dueDate){
        this.description=description;
        this.nameResponsible=nameResponsible;
        this.emailResponsible=emailResponsible;
        this.status=status;
        this.dueDate=dueDate;
    }

    public String getDescription() {
        return description;
    }

    public String getNameResponsible() {
        return nameResponsible;
    }

    public String getEmailResponsible() {
        return emailResponsible;
    }

    public String getStatus() {
        return status;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }    

    public void setNameResponsible(String nameResponsible) {
        this.nameResponsible = nameResponsible;
    }

    public void setEmailResponsible(String emailResponsible) {
        this.emailResponsible = emailResponsible;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
} 