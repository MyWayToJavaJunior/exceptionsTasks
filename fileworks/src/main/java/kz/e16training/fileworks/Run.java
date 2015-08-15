package kz.e16training.fileworks;


import kz.e16training.fileworks.controller.Controller;

/**
 * @author DK
 * @version 1.0.0
 *
 */
public class Run {
    public static void main(String[] args) {
        /*FileWork fileWork = new FileWork();
        try {
            System.out.println(fileWork.view("fileworks"));
            System.out.println(fileWork.view("text"));
            System.out.println(fileWork.view("text1"));
            fileWork.usingFile("text31", "line1");
            System.out.println(fileWork.view("text31"));
            fileWork.usingFile("text31", "line2");
            System.out.println(fileWork.view("text31"));
            fileWork.removeFile("text31");
        } catch (ProjectMainException e) {
            System.out.println(e.getMessage());
        }*/
        Controller controller = new Controller();
        controller.commandLine();
    }
}
