import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Silders_pica {
	
	// Instance mainīgie
    private String vards;
    private String uzvards;
    private String adrese;
    private String telNr;
    private double cena;

    // Konstruktors
    public Silders_pica(String vards, String uzvards, String adrese, String telNr, double cena) {
        this.vards = vards;
        this.uzvards = uzvards;
        this.adrese = adrese;
        this.telNr = telNr;
        this.cena = cena;
    }

    public void saglPasutijumu() {
        try {
            FileWriter fileWriter = new FileWriter("Sutijumi.txt", true); // Ja būs false, tad pārrakstīs visu failu (viss iepriekšējais dzēsīsies)
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Picas pasūtījums:");
            printWriter.println("Pasūtītājs: " + vards + " " + uzvards);
            printWriter.println("Adrese: " + adrese);
            printWriter.println("Telefona nr.: " + telNr);
            printWriter.println("Kopējā cena: " + cena + "€");
            printWriter.println("-----------------------------------");

            printWriter.close();
            System.out.println("Pasūtījums saglabāts veiksmīgi.");
        } catch (IOException e) {
            System.out.println("Kļūda, nevarēja saglabāt pasūtījumu: " + e.getMessage());
        }
    }
}
