public class Tarefas {

    private int id;
    private String description;
    private Boolean done;

    @Override
    public String toString(){
        return "Tarefa [id=" + id + ", description=" + description + ",done=" + done + "]\n";
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
