// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ToDo todoList = new ToDo(5);
        AddTask add=new AddTask();
        FetchTAsk fetch= new FetchTAsk();
        DeleteTask delete=new DeleteTask();


       add.addtask(Task.TASK1);
       add.addtask(Task.TASK2);
       add.addtask(Task.TASK3);
       System.out.println(add.size);
        System.out.println(add.todoList.tasks[1]);

      fetch.fetchTAsk(add.size,add.todoList.tasks);



       delete.deleteTask(1, add.size,add.todoList.tasks);


        fetch.fetchTAsk(add.size, add.todoList.tasks);
    }
    }
