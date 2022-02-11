import java.util.Scanner;

public class Daire {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r,alpha,alan;
        System.out.println("yarı cap girin?");
        r = sc.nextDouble();
        System.out.println("açıyı girin?");
        alpha = sc.nextDouble();
        alan = (3.14*(r*r)*alpha)/360;
        System.out.println("Alan: "+alan);
    }
}
