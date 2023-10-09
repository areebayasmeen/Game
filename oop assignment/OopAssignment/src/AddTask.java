public class AddTask {
    ToDo todoList = new ToDo(5);
    int size=0;
    public void addtask(Task task){
        if (size <  todoList.tasks.length) {
            todoList.tasks[size] = task;
            size++;
        } else {
            System.out.println("Todo list is full. Cannot add more tasks.");
        }

    }

    }

