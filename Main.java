package option1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Inside inside = new Inside();
        int task = 0;
        while (task != 6) {
            System.out.println("");
            System.out.println("Enter your operation:");
            System.out.println("Add task - 1");
            System.out.println("List of completed tasks - 2");
            System.out.println("List of not completed tasks - 3");
            System.out.println("List of all tasks - 4");
            System.out.println("Mission accomplished - 5");
            Scanner sc = new Scanner(System.in);
            task = sc.nextInt();
            switch (task) {
                case 1:
                    inside.add();
                    break;
                case 2:
                    inside.listOfCompletedTasks();

                    break;
                case 3:
                    inside.listOfNotCompletedTasks();
                    break;
                case 4:
                    inside.listOfAllTasks();
                    break;
                case 5:
                    inside.missionAccomplished();
                    break;
                default:
                    System.out.println("Something wrong !");
            }
        }
    }
}