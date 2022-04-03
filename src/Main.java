import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splittedString = inputString.split(" ");
        if (splittedString.length > 0) System.out.println("Фамилия: "+splittedString[0]);
        if (splittedString.length > 1) System.out.println("Имя: "+splittedString[1]);
        if (splittedString.length > 2) System.out.println("Отчество: "+splittedString[2]);

	// write your code here
    }
}
