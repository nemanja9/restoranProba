package artikal;

import java.awt.Image;
import java.util.LinkedList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * 
 * Klasa Artikal u paketu artikal
 * 
 * @author Nemanja, Jovana i Andjela
 * @version 1.0
 *
 */

public class Artikal {

	/**
	 * Atribut koji prikazuje naziv artikla, String
	 */
	public String naziv;
	/**
	 * Atribut koji prikazuje cenu artikla, double
	 */
	public double cena;
	/**
	 * Atribut koji prikazuje sastojke, lista Stringova
	 */
	public LinkedList<String> sastojci;
	/**
	 * Atribut koji prikazuje sliku artikla, String
	 */
	public String slika;
	/**
	 * Atribut koji prikazuje ikonu artikla, Icon
	 */
	public Icon image;
	/**
	 * Atribut koji prikazuje tip artikla, String
	 */
	public String tip;

	/**
	 * Konstruktor koji pravi novi Artikal
	 * 
	 * @param cenaa
	 * @param nazivv
	 * @param putanjaSlike
	 * @param sastojcii
	 * @param tipp
	 */
	public Artikal(double cenaa, String nazivv, String putanjaSlike, LinkedList<String> sastojcii, String tipp) {
		naziv = nazivv;
		cena = cenaa;
		image = new ImageIcon(getClass().getResource(putanjaSlike));
		sastojci = sastojcii;
		tip = tipp;
	}
}
