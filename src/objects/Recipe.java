package objects;

public class Recipe {
    private String name;
    private boolean diary;
    private boolean meat;
    private boolean gluten;

    public Recipe(String name, boolean diary,boolean meat, boolean gluten){
        this.name=name;
        this.diary=diary;
        this.meat=meat;
        this.gluten=gluten;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public boolean hasDiary(){
        return this.diary;
    }
    public boolean hasMeat(){
        return this.meat;
    }
    public boolean hasGluten(){
        return this.gluten;
    }

}
