import java.util.Scanner;

public class Visitenkarte {

  public static void main (String[] args) {

    Scanner angaben = new Scanner(System.in);

    System.out.println("Um eine Visitenkarte zu erstellen geben sie bitte folgende Daten ein:");
    System.out.print("Vorname: ");
    String vorname = angaben.nextLine();
    System.out.print("Name: ");
    String name = angaben.nextLine();
    System.out.print("Alter: ");
    int alter = angaben.nextInt();
    //leere Zeile ausgeben, entfehrnt neue zeile von int aus dem buffer
    angaben.nextLine();
    System.out.print("Firma: ");
    String firma = angaben.nextLine();
    System.out.print("Anschrift: ");
    String anschrift = angaben.nextLine();
    System.out.print("Postleitzahl: ");
    //Postleitzahl als String anstatt Int, da PLZ auch mit Null anfangen kann und diese Stellen in der Ausgabe fehlen würden
    String plz = angaben.nextLine();
    System.out.print("Stadt: ");
    String stadt = angaben.nextLine();
    System.out.print("Facebook: ");
    String facebook = angaben.nextLine();

    System.out.println("");

    String antwort = "hierBinIch";

    while(!antwort.equals("j") && !antwort.equals("n")) {
      System.out.println("Möchten sie nun eine Visitenkarte erstellen?(j/n)");
      antwort = angaben.nextLine();
    }

    if (antwort.equals("j")) {
      System.out.println("Name: " + vorname + " " + name);
      System.out.println(firma);
      System.out.println(alter + "Jahre");
      System.out.println("Anschrift: " + anschrift);
      System.out.println("\t" + plz + " " + stadt);
      System.out.println("Facebook me: " + facebook);
      }
  }

}
