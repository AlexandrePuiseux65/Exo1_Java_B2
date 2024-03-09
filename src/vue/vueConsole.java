package vue;

import java.time.LocalDate;
import java.util.Scanner;

import modele.Task;
import modele.TaskList;

public class vueConsole {

    private TaskList taskList;
    private Scanner scanner;

    // CONSTRUCTOR
    public vueConsole(TaskList taskList) {
        this.taskList = taskList;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean quit = false;
        while (!quit) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Tâches à faire : ");
            taskList.displayTasks();
            System.out.println("Veuillez choisir une option : ");
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Supprimer une tâche");
            System.out.println("3. Quitter");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Task tsk1 = new Task();
                    System.out.println("Name : ");
                    tsk1.setName(scanner.nextLine());
                    System.out.println("Description : ");
                    tsk1.setDescription(scanner.nextLine());
                    System.out.println("Due Date : ");
                    tsk1.setDueDate(LocalDate.of(2024, 3, 15));
                    taskList.addTask(tsk1);
                    break;
                case 2:
                    taskList.displayNameTasks();

                    System.out.println("Entrez le numéro de la tâche à supprimer : ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine();

                    if (taskNumber > 0 && taskNumber <= taskList.getListTask().size()) {
                        taskList.removeTask(taskList.getTask(taskNumber - 1));
                        System.out.println("La tâche a été supprimée.");
                    } else {
                        System.out.println("Numéro de tâche invalide.");
                    }
                    break;
                case 3:
                    quit = true;
                    break;
                default:
                    System.out.println("Choix non valide, veuillez réessayer.");
            }
        }
    }
}
