public enum Task {
    TASK1("go gym"),
    TASK2("Task 2"),
    TASK3("Task 3"),
    TASK4("Task 4");

    final String description;

    Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

