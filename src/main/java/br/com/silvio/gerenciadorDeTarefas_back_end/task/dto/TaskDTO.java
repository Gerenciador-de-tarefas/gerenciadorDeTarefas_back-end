package br.com.silvio.gerenciadorDeTarefas_back_end.task.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class TaskDTO {

    private String id;

    private String title;

    private String description;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate creationDate;

    private boolean isComplete;

    public TaskDTO() {}

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
