package modele;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<Task> listTask;

    // CONSTRUCTOR
    public TaskList() {
        this.listTask = new ArrayList<>();
    }

    public void addTask(Task task) {
        listTask.add(task);
    }

    public void removeTask(Task task) {
        listTask.remove(task);
    }

    public Task getTask(int index) {
        return listTask.get(index);
    }

    public List<Task> getListTask() {
        return listTask;
    }
    public void displayNameTasks() {
        if (listTask.isEmpty()) {
            System.out.println("La liste des tâches est vide.");
        } else {
            System.out.println("Liste des tâches :");
            for (Task task : listTask) {
                System.out.println(task.getName());
            }
        }
    }

    public void displayTasks() {
        if (listTask.isEmpty()) {
            System.out.println("La liste des tâches est vide.");
        } else {
            System.out.println("Liste des tâches :");
            for (Task task : listTask) {
                System.out.println(task.toString());
            }
        }
    }

}
