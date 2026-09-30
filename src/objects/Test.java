package objects;
import java.util.Random;
public class Test {
    public static void isVegetarian(Recipe[] recipies){
        System.out.println("all the vegetarian food are : ");
        for (int i=0;i<recipies.length;i++){
            if (!recipies[i].hasMeat()){
               System.out.println(recipies[i].getName());
            }
        }
    }
    public static void isVegan(Recipe[] recipies){
        System.out.println("all the vegan food are : ");
        for (int i=0;i<recipies.length;i++){
            if (!recipies[i].hasMeat() & !recipies[i].hasDiary()){
                System.out.println(recipies[i].getName());
            }
        }
    }
    public static void main(String[] args){
        Student newStudent = new Student("akshay",100,"design");
        System.out.println(newStudent.toString());
        newStudent.setModule("programming ");
        System.out.println(newStudent.toString());

        Recipe [] recipies= new Recipe[4];
        recipies[0]= new Recipe("pasta",false,true,true);
        recipies[1]= new Recipe("cake",true,false,true);
        recipies[2]= new Recipe("chips",false,false,true);
        recipies[3]= new Recipe("curry",false,true,true);

        isVegetarian(recipies);
        isVegan(recipies);


        Item[] item=new Item[10];
        Random random= new Random();
        for (int x=0,x<item.length(),x++){

        }
    }

}