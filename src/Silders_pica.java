import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

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
            FileWriter fileW = new FileWriter("Sutijumi.txt", true); // Ja būs false, tad pārrakstīs visu failu (viss iepriekšējais dzēsīsies)
            PrintWriter printW = new PrintWriter(fileW);

            printW.println("Picas pasūtījums:");
            printW.println("Pasūtītājs: " + vards + " " + uzvards);
            printW.println("Adrese: " + adrese);
            printW.println("Telefona nr.: " + telNr);
            printW.println();
            printW.println("Picas izmērs: " + picasIzm);
            printW.println("Piedevas ( katra +0,50€): " + piedevas);
            printW.println("Mērce: " + merce);
            printW.println("Ēšanas vieta: " + esanasVieta);
            printW.println("Kopējā cena: " + cena + "€");
            printW.println("-----------------------------------");

            printW.close();
            JOptionPane.showMessageDialog(null, "Pasūtījums saglabāts veiksmīgi!", "Šermando", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
        	JOptionPane.showMessageDialog(null, "Radās kļūda! Nevarēja saglabāt pasūtījumu!", "Šermando", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
