import java.util.ArrayList;
public class RecipeBook{
    private ArrayList<Recipe>RecipeBook;
    public RecipeBook(){
        RecipeBook = new ArrayList();
    
    }
    public void bookDetails(){
        String author = "Tyron, Thomas and Vicky";
        String date = "November 24, 2026";
        String desc = "This virtual recipe book will allow you to discover new delicacies to discover and enjoy!";
        
        System.out.println(author  + date  + desc);
    }
}