package artikal;

import java.awt.Image;
import java.util.LinkedList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Artikal {

	public String naziv;
	public double cena;
	public LinkedList<String> sastojci;
	public String slika;
	public Icon image;
	public String tip;

	public Artikal(double cenaa, String nazivv, String putanjaSlike, LinkedList<String> sastojcii, String tipp ) {
		naziv = nazivv;
		cena = cenaa;
		image = new ImageIcon(getClass().getResource(putanjaSlike));
		sastojci = sastojcii;
		tip = tipp;
	}
}
