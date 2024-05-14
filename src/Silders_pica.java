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
    private String picasIzm;
    private String piedevas;
    private String merce;
    private String esanasVieta;

    // Konstruktors
    public Silders_pica(String vards, String uzvards, String adrese, String telNr, double cena, String picasIzm, String piedevas, String merce, String esanasVieta) {
        this.vards = vards;
        this.uzvards = uzvards;
        this.adrese = adrese;
        this.telNr = telNr;
        this.cena = cena;
        this.picasIzm = picasIzm;
        this.piedevas = piedevas;
        this.merce = merce;
        this.esanasVieta = esanasVieta;
    }

    public void saglPasutijumu() {
        try {
            FileWriter fileWriter = new FileWriter("Sutijumi.txt", true); // Ja būs false, tad pārrakstīs visu failu (viss iepriekšējais dzēsīsies)
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Picas pasūtījums:");
            printWriter.println("Pasūtītājs: " + vards + " " + uzvards);
            printWriter.println("Adrese: " + adrese);
            printWriter.println("Telefona nr.: " + telNr);
            printWriter.println();
            printWriter.println("Picas izmērs: " + picasIzm);
            printWriter.println("Piedevas: " + piedevas);
            printWriter.println("Mērce: " + merce);
            printWriter.println("Ēšanas vieta: " + esanasVieta);
            printWriter.println("Kopējā cena: " + cena + "€");
            printWriter.println("-----------------------------------");

            printWriter.close();
            System.out.println("Pasūtījums saglabāts veiksmīgi.");
        } catch (IOException e) {
            System.out.println("Kļūda, nevarēja saglabāt pasūtījumu: " + e.getMessage());
        }
    }
}
