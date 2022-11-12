import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("Temperature ?: ");//get temp from user
        double temp = dat.nextDouble();

        if (temp < 5) {//first condition
            System.out.println("Sky");
        } else if (temp >= 5 && temp < 15) {//second condition
            System.out.println("Movie");

        } else if (temp >= 15 && temp < 25) {//third condition
            System.out.println("Picnic");

        } else System.out.println("Swim");//other condition


    }
}
