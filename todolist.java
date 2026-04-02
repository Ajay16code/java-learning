import java.io.*;
import java.util.*;

class Task {
    String title;
    boolean isCompleted;

    Task(String title, boolean isCompleted) {
        this.title = title;
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return title + "," + isCompleted;
    }

    public static Task fromString(String line) {
        String[] parts = line.split(",");
        return new Task(parts[0], Boolean.parseBoolean(parts[1]));
    }
}

public class TodoApp {
    static final String FILE_NAME = "tasks.txt";
    static List<Task> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        loadTasks();

        int choice;
        do {
            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> markCompleted();
                case 4 -> deleteTask();
                case 5 -> saveTasks();
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    static void addTask() {
        System.out.print("Enter task: ");
        String title = sc.nextLine();
        tasks.add(new Task(title, false));
        System.out.println("Task added!");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            System.out.println((i + 1) + ". " + t.title +
                    (t.isCompleted ? " ✅" : " ❌"));
        }
    }

    static void markCompleted() {
        viewTasks();
        System.out.print("Enter task number: ");
        int index = sc.nextInt() - 1;

        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).isCompleted = true;
            System.out.println("Marked as completed!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    static void deleteTask() {
        viewTasks();
        System.out.print("Enter task number: ");
        int index = sc.nextInt() - 1;

        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    static void loadTasks() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                tasks.add(Task.fromString(line));
            }
        } catch (IOException e) {
            // File may not exist initially
        }
    }

    static void saveTasks() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Task t : tasks) {
                bw.write(t.toString());
                bw.newLine();
            }
            System.out.println("Tasks saved!");
        } catch (IOException e) {
            System.out.println("Error saving tasks.");
        }
    }
}
