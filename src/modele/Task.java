package modele;

import java.time.LocalDate;

public class Task {
    private String name;
    private String description;
    private LocalDate dueDate;

    // - CONSTRUCTOR - //
    public Task() {}

    public Task(String name, String description, LocalDate dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
    }

    // - SETTERS - //
    public void setName(String name) {
        this.name = name;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // - GETTERS - //
    public String getName() {
        return name;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "\t* Task : \n" +
                "\t\t- Non = " + name + '\n' +
                "\t\t- Description = " + description + '\n' +
                "\t\t- Delay =  " + dueDate;
    }
}
