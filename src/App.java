import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangbentgord = new Scanner(System.in);
        System.out.print("Droppa talet bror:");
        int tal1 = tangbentgord.nextInt();
        tangbentgord.nextLine();
        System.out.print("Droppa andra talet bram:");
        int tal2 = tangbentgord.nextInt();
                tangbentgord.nextLine();
        
        System.out.print("Droppa decimaltalet bror:");
        double  tal3 = tangbentgord.nextDouble();
                tangbentgord.nextLine();
        System.out.print("Droppa andra decimaltalet yäni:");
        double tal4 = tangbentgord.nextDouble();
                tangbentgord.nextLine();
        double kvot = tal3/tal4;
        System.out.println(tal3+"/"+tal4+"="+kvot);
        int produkt = tal1*tal2;
        System.out.println(tal1+"*"+tal2+"="+produkt);
        
    }
}
