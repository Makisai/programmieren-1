import java.util.Scanner;

public class DialogApp {

  public static void main (String[] args) {

    Scanner vorstellung = new Scanner(System.in);

    System.out.println("Hallo, wie ist dein Name?");
    String name = vorstellung.nextLine();
    System.out.println("Freut mich dich kennen zu lernen " + name + "!");

  }
}
