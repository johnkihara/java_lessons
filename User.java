import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private String dateOfBirth;
    private int distanceFromStore;
    private int age;
    final private int currentYear = 2024;

    Scanner input = new Scanner(System.in);

    //getting input from the user
    public void getUserData(){
        System.out.println("Enter your name");
        name = input.nextLine();
        System.out.println("Enter your surname");
        surname = input.nextLine();
        System.out.println("Enter your date of birth (DD/MM/YYYY)");
        dateOfBirth = input.nextLine();
        System.out.println("How far is your favorite store from your home?");
        distanceFromStore = input.nextInt();

        input.close();
    }

    //saying hello to users
    public void printHello(){
        if ((name.equals("John")) && (surname.equals("Smith"))){
            System.out.println("Hello " + name + " "+surname);
        } else if ((name.equals("Thabo")) && (surname.equals("Sebata"))){
            System.out.println("Hello " + name +" "+surname);

        }else {
            System.out.println(name +""+ surname);
        }
    }

    //calculating the age of the user
    public void displayAge(){
        int enteredYear = Integer.parseInt(dateOfBirth.split("/")[2]);
        age = currentYear - enteredYear;
        System.out.println("You are "+age+" years old.");
    }

    //converting the distance
    public void convertDistance(){
        float distanceInMiles = distanceFromStore * 0.621371f;
        float distanceInMeters = distanceFromStore * 1000;
        System.out.println("Distance in miles "+distanceInMiles);
        System.out.println("Distance in meters "+distanceInMeters);

    }

}
