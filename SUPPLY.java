import java.util.Scanner;

public class SUPPLY {
    private int Code;
    private String FoodName;
    private String Sticker;
    private String FoodType;

    // Function to assign FoodType based on Sticker
    public void GetType() {
        switch (Sticker.toLowerCase()) {
            case "green":
                FoodType = "Vegetarian";
                break;
            case "yellow":
                FoodType = "Contains Egg";
                break;
            case "red":
                FoodType = "Non Vegetarian";
                break;
            default:
                FoodType = "Unknown";
                break;
        }
    }

    // Function to input values for Code, FoodName, Sticker and call GetType
    public void FoodIn() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Code: ");
        Code = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        System.out.print("Enter FoodName: ");
        FoodName = sc.nextLine();

        System.out.print("Enter Sticker (Green/Yellow/Red): ");
        Sticker = sc.nextLine();

        // Assign FoodType based on Sticker
        GetType();
    }

    // Function to display the values of all data members
    public void FoodOut() {
        System.out.println("Code: " + Code);
        System.out.println("FoodName: " + FoodName);
        System.out.println("Sticker: " + Sticker);
        System.out.println("FoodType: " + FoodType);
    }

    // Main method to test the class
    public static void main(String[] args) {
        SUPPLY supply = new SUPPLY();
        supply.FoodIn();
        supply.FoodOut();
    }
}
