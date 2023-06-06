import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double raio,area;
        raio = sc.nextDouble();
        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A=%.4f\n",area);
    }
}