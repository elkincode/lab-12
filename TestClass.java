import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass {
    private static final Pattern regex = Pattern.compile("(\\d+)(.\\d{1})? (USD|RUB|EUR)");
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Введите число и валюту, к которой оно относится: ");
                if (input.hasNextLine()) {
                    String string = input.nextLine();
                    Matcher match = regex.matcher(string);
                    if (match.find())
                        System.out.println("Да, это настоящие деньги");
                    else
                        System.out.println("Нет, это не похоже на деньги");
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода");
            }
        }
    }
}