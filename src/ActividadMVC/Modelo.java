package ActividadMVC;

public class Modelo {
 private String name;
    private boolean completed;

    public Modelo(String name){
        this.name = name;
        this.completed = false;
    }
    public String getName(){
        return name;
    }
    public boolean isCompleted(){
        return completed;
    }
    public void complete(){
        this.completed = true;
    }
}
