package by.training.tasks.aliv.mas;

public abstract class Task {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public Task() {

    }

    public abstract void execute();

}
