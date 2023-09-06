import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangbentgord = new Scanner(System.in);
        Scanner tb = new Scanner(System.in);
        System.out.print("Droppa talet bror:");
        int tal1 = tangbentgord.nextInt();
        System.out.print("Droppa andra talet bram:");
        int tal2 = tb.nextInt();
        int produkt = tal1*tal2;
        System.out.println(tal1+"*"+tal2+"="+produkt);
    }
}
