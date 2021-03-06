import java.util.LinkedHashMap;
import java.util.Scanner;

public class Ex18_Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        String input;
        while (!(input = scan.nextLine()).equals("END")) {
            String[] split = input.split(" ");
            if (split[0].equals("A")) {
                map.put(split[1], split[2]);
            } else if (split[0].equals("S")) {
                if (map.containsKey(split[1]))
                    System.out.printf("%s -> %s\r\n", split[1], map.get(split[1]));
                else
                    System.out.printf("Contact %s does not exist.\r\n", split[1]);
            }
        }
    }
}
