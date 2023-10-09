public class DeleteTask {
  //  ToDo todoList = new ToDo(5);


    public void deleteTask(int index,int size,Task tasks[]){
      if (index >= 0 && index < size) {
        for (int i = index; i < size - 1; i++) {
          tasks[i] =  tasks[i + 1];
        }
         tasks[size - 1] = null; // Set the last element to null
        size--;
    } else {
        System.out.println("Invalid index. Task not found.");
    }
}
}
