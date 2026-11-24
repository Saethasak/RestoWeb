import java.util.ArrayList;
public class RecipeBook{
    private ArrayList<Recipe>RecipeBook;
    public RecipeBook(){
        RecipeBook = new ArrayList();
    
    }
    public void bookDetails(){
        String author = "author";
        String date = "November 24, 2026";
        String desc = "description";
        
        System.out.println(author  + date  + desc);
    }
}