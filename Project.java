// DRAFT 
// Final Project
// May 25th
// Author: Sabrina Rosa de Oliveira

// Collaborative Project Management System

import java.util.ArrayList;
import java.util.List;

class Project{
    private String name;
    private List<Task> task;

    public Project(String name){
        this.name = name;
        this.task = new ArrayList<>();

    }

    public String getName() {
        return name;

    }

    public void addTask(Task task){
        task.add(task);
    }

    public List<Task> getTask(){
        return task;
    }
}
    class Task{
        private String description;
        private boolean confirmed;

    public task (String description){
        this.description = description;
        this.confirmed = false;
    }

    public String getDescription(){
        return description;
    }

    public boolean isConfirmed(){
        return confirmed;
    }

    public void markAsConfirmed(){
        this.confirmed = true;
      }

    }

    public class Main{
        public static void main(String[] args){
            Project project = new Project("Project A");

            Task task1 = new Task("Implement Login");
            Task task2 = new Task("Create profile page");
            Task task3 = new Task("Add sharing info");

            project.addTask(task1);
            project.addTask(task2);
            project.addTask(task3);
        
            System.out.println("Project: " + project.getName());
            System.out.println("Task: ");

            for (Task task : project.getTask()){
                System.out.println(" " + task.getDescription()); 
            }
        
        }
    }