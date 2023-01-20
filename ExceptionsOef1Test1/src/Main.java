import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef getal 1");
        int getal1 = sc.nextInt();
        System.out.println("Geef getal 2");
        int getal2 = sc.nextInt();
        Som som1 = new Som(getal1,getal2);


        try {
            System.out.println(som1.berekenSom());
        }catch (BovenloopException e){
            System.out.println(e.getMessage());
        } catch (OnderloopException e) {
            System.out.println(e.getMessage());
        }


    }
}
