import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangbentgord = new Scanner(System.in);
        System.out.println("Droppa talet bror:");
        int tal1 = tangbentgord.nextInt();
        System.out.println("Droppa andra talet bram:");
        int tal2 = tangbentgord.nextInt();
        System.out.println(tal1+tal2);
    }
}
