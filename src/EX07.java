import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a temperatura em Celsius? ");
        int C = scanner.nextInt();
        int F = (9*C+160) / 5;
        System.out.println("A temperatura convertida é de: " + F + " Fahrenheit!");
    }
}
