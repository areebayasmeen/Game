public class FetchTAsk {
    ToDo todoList = new ToDo(5);
    AddTask a=new AddTask();

   // int size=a.size;
    public void fetchTAsk(int size,Task list[]){
        //System.out.println(a.size);
        if (size == 0) {
            System.out.println("Todo list is empty.");
        } else {
            System.out.println("Tasks in the todo list:");
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + list[i]);
            }
        }
    }
}

