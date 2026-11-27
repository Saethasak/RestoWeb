import java.util.ArrayList;
import java.util.Scanner;
public class Book{
    protected String title;
    protected String detail;
    protected Scanner scanner;
    private ArrayList<Tag>tags;
    private ArrayList<Ingredient>ingredients;
    private ArrayList<Recipe>RecipeBook;
    public Book(String title, String detail){
        scanner = new Scanner(System.in);
        this.title = title;
        this.detail = detail;
        RecipeBook = new ArrayList();
        ingredients = new ArrayList();
    }
    public String getTitle(){
        return title;
    }
    public String getDetail(){
        return detail;
    }
    public ArrayList<Tag> getTags(){
        return tags;
    }
    public void createRecipe(){
        System.out.println("Please name your Recipe Title");
        String title = scanner.nextLine();
        System.out.println("Please describe the Recipe");
        String detail = scanner.nextLine();
        
        Recipe recipe = new Recipe(title, detail);
        RecipeBook.add(recipe);
        System.out.println("Recipe has been added to the Recipe Book");
    }
    public void createIngredient(){
        System.out.println("Please Create the ingredient");
        String nameIngredient = scanner.nextLine();
        Ingredient ingredient = new Ingredient(nameIngredient);
        ingredients.add(ingredient);
        System.out.println("Ingredient has been added to the Recipe Book");
    }
    public void createTag(){
        System.out.println("Please Create the ingredient");
        String nameTag = scanner.nextLine();
        Tag tag = new Tag(nameTag);
        tags.add(tag);
        System.out.println("Tag has been added to the Recipe Book");
    }
    public void printAllTag(){
        for(Tag tag: tags){
            System.out.println(tag);
        }
    }
    public void printAllIngredient(){
        for(Ingredient ingredient: ingredients){
            System.out.println(ingredient);
        }
    }
    public void addIngredientInRecipe(){
        System.out.println("Please enter an existing Recipe Title");
        String title = scanner.nextLine();
        
        Recipe foundRecipe = null;
        for(Recipe recipe: RecipeBook){
           if(recipe.getTitle().equals(title)){
                foundRecipe = recipe;
                break;
            }
            
        }
        if(foundRecipe == null){
            System.out.println("Recipe not found");
            return;
        }
        System.out.println("Please add the existing Ingredient");
        String nameIngredient = scanner.nextLine();
        
    }
     

}