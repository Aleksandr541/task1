package option1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inside {
    List<String> taskList = new ArrayList<>();

    void add() {
        System.out.println("Enter you task:");
        Scanner sc = new Scanner(System.in);
        String addTask = sc.nextLine();

        taskList.add(addTask);
        System.out.println("Task added");
    }

    void listOfCompletedTasks() {

        for (int i = 0; i < taskList.size(); i++) {
            String element = taskList.get(i);
            boolean aa = element.contains("Performed");
            if (aa)
                System.out.println(i + ")" + element);
        }
        System.out.println("These tasks are completed");
    }

    void listOfNotCompletedTasks() {
        for (int i = 0; i < taskList.size(); i++) {
            String element = taskList.get(i);
            boolean aa = element.contains("Performed");
            if (!aa)
                System.out.println(i + ")" + element);
        }
        System.out.println("These tasks are not completed");
    }


    void listOfAllTasks() {
        int i = -1;
        if (taskList.isEmpty()) {
            System.out.println("You have no tasks!!!");
        } else {
            for (String a : taskList) {
                i++;
                System.out.println(i + ")" + a);
            }
        }
    }

    void missionAccomplished() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number task:");
        int numberTask = sc.nextInt();
        System.out.println("Enter your task status:");
        System.out.println("1 - Performed");
//        System.out.println("2 - Not performed");
        int status = sc.nextInt();
        switch (status) {
            case 1:
                taskList.set(numberTask, "Performed");
                System.out.println("Your task completed");
                break;
            default:
                System.out.println("Something wrong !");
        }
    }
}