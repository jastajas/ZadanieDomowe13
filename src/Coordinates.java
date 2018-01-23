import java.util.Scanner;

public class Coordinates {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj X: ");
        int x = sc.nextInt();

        System.out.println("Podaj Y: ");
        int y = sc.nextInt();

        if(x > 0 && y > 0){
            System.out.println("Twój punkt (" + x + ", " + y + ") znajduje się w I ćwiartce układu współrzędnych.");
        } else if (x < 0 && y > 0){
            System.out.println("Twój punkt (" + x + ", " + y + ") znajduje się w II ćwiartce układu współrzędnych.");
        } else if (x < 0 && y < 0){
            System.out.println("Twój punkt (" + x + ", " + y + ") znajduje się w III ćwiartce układu współrzędnych.");
        } else if (x > 0 && y < 0){
            System.out.println("Twój punkt (" + x + ", " + y + ") znajduje się w IV ćwiartce układu współrzędnych.");
        } else if (x == 0 && y > 0){
            System.out.println("Twój punkt (" + x + ", " + y + ") znajduje się na granicy I i II ćwiartki układu współrzędnych.");
        } else if (x == 0 && y < 0){
            System.out.println("Twój punkt (" + x + ", " + y + ") znajduje się na granicy III i IV ćwiartki układu współrzędnych.");
        } else if (x > 0 && y == 0){
            System.out.println("Twój punkt (" + x + ", " + y + ") znajduje się na granicy I i IV ćwiartki układu współrzędnych.");
        } else {
            System.out.println("Twój punkt (" + x + ", " + y + ") znajduje się na granicy II i III ćwiartki układu współrzędnych.");
        }
        //(x < 0 && y == 0)

    }
}
