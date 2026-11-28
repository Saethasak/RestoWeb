import java.util.ArrayList;
import java.util.Scanner;
public class User{
    public static void chooseAndRateRecipe(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = Book.getRecipes();
        if(recipes.isEmpty()){
            System.out.println("There are no recipes at the moment.");
        }
        System.out.println("Recipe List: ");
        for (int i = 0; i < recipes.size(); i++){
            System.out.println(i + " = " + recipes.get(i));
    }
    
    int chooseRecipe = -1;
    while(chooseRecipe < 0 || chooseRecipe >= recipes.size()){
        System.out.println("Select the number of the recipe you want to rate and review.");
        if (scanner.hasNextInt()){
            chooseRecipe = scanner.nextInt();
            if (chooseRecipe < 0 || chooseRecipe >= recipes.size()){
                System.out.println("Number must be on the list.");
            }
        }
        else {
            System.out.println("Enter a valid number.");
            scanner.next();
        }
    }
    scanner.nextLine();
    
    Recipe recipeChosen = recipes.get(chooseRecipe);
    int rating = 0;
    while (rating < 1 || rating > 5){
        System.out.println("Rate " + recipeChosen + " on a scale from 1 to 5.");
        if (scanner.hasNextInt()){
            rating = scanner.nextInt();
            if (rating < 1 || rating > 5){
                System.out.println("Number must be 1 to 5.");
            }
        }
        else {
            System.out.println("Enter a valid number.");
            scanner.next();
        }
    }
    scanner.nextLine();
    
    String review = scanner.nextLine();
    ArrayList<String> reviews = new ArrayList<>();
    reviews.add(rating, review);
    System.out.println("Review for " + recipeChosen);
    for (String opinion : reviews){
        System.out.println(opinion);
    }
    
    
}
}
