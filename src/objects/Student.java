package objects;

public class Student {

    private String name;
    private int id;
    private String module;

    public Student(String name, int id, String module) {
        this.name = name;
        this.id = id;
        this.module = module;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
    public String toString(){
        return id+","+name+","+module;
    }
}
