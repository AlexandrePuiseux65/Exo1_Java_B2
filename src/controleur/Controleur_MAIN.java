package controleur;

import modele.TaskList;
import vue.vueConsole;

public class Controleur_MAIN {

    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        vueConsole vueConsole = new vueConsole(taskList);
        vueConsole.start();
    }
}
