import java.util.*;
import volumecalculator.*;

public class New{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        volume v = new volume();
        System.out.println("Choose any one option!");
        System.out.println("1.rectaingle\n2.prizom rectaingle\n3.cylinder\n4.Square pramid\n5.Circle pyramid\n6.Sphere");
        System.out.print("Choose: ");
        int choose = sc.nextInt();

        if(choose == 1){
            System.out.print("Enter Length: ");
            int length = sc.nextInt();
            System.out.print("Enter Width: ");
            int width = sc.nextInt();
            System.out.print("Enter Height: ");
            int height = sc.nextInt();
            System.out.println(v.rectaingle(length, width, height));
        }
        else if(choose == 2){
            System.out.print("Enter base: ");
            int base = sc.nextInt();
            System.out.print("Enter Height: ");
            int height = sc.nextInt();
            System.out.println(v.prizomrectaingle(base, height));
        }
        else if(choose == 3){
            System.out.print("Enter baseradius: ");
            double base = sc.nextDouble();
            System.out.print("Enter Height: ");
            int height = sc.nextInt();
            System.out.println(v.cylinder(base, height));
        }
        else if(choose == 4){
            System.out.print("Enter base: ");
            int base = sc.nextInt();
            System.out.print("Enter Height: ");
            int height = sc.nextInt();
            System.out.println(v.SP(base, height));
        }
        else if(choose == 5){
            System.out.print("Enter baseRadius: ");
            int base = sc.nextInt();
            System.out.print("Enter Height: ");
            int height = sc.nextInt();
            System.out.println(v.CP(base, height));
        }
        else if(choose == 6){
            System.out.print("Enter Radius: ");
            double radius = sc.nextDouble();
            System.out.println(v.sphere(radius));
        }
    }
}