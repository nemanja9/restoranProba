package restoran.gui.kontroler;

import java.awt.EventQueue;
import java.util.LinkedList;

import artikal.Artikal;
import restoran.gui.GlavniProzorLAZY;
import restoran.gui.HranaProzor;
import restoran.gui.KonobarovPrikaz;
import restoran.gui.PicaProzor;
import restoran.gui.PotvrdiPorudzbinuHraneDijalog;
import restoran.gui.PotvrdiPorudzbinuPicaDijalog;
import restoran.interfejs.Restoran;
import restoran.interfejs.RestoranInterfejs;

public class GUIKontroler {
	public static RestoranInterfejs restoran = new Restoran();
	public static GlavniProzorLAZY gp;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKontroler.gp = new GlavniProzorLAZY();
					GUIKontroler.gp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void prikaziHranaProzor() {
		HranaProzor hp = new HranaProzor();
		hp.setLocationRelativeTo(gp);
		hp.setVisible(true);
	}

	public static void prikaziPicaProzor() {
		PicaProzor pp = new PicaProzor();
		pp.setLocationRelativeTo(gp);
		pp.setVisible(true);
		
	}
	private final static String newline = "\n";
	public static void racunTextArea() {
		gp.textArea.append("---------------------------------" +newline);
		gp.textArea.append("KONOBAR CE DOCI SA VASIM RACUNOM" +newline);
		gp.textArea.append("Ukupan iznos vaseg racuna je: "+ restoran.racunaUkupanIznosRacuna() +newline);
		
		gp.textArea.append("HVALA NA POSETI!" +newline);
	}
	
	public static void prikaziPotvrdiPorudzbinuHraneDijalog(Artikal a) {
		PotvrdiPorudzbinuHraneDijalog dij = new PotvrdiPorudzbinuHraneDijalog(a);
		dij.setLocationRelativeTo(gp);
		dij.setVisible(true);
	}
	public static void poruci(Artikal a, LinkedList<String> izabraniSastojci) {
		a.sastojci = izabraniSastojci;
		restoran.poruciArtikal(a);
		ispis(a);
		prikaziKonobarProzor(a);
	
	}
	
	public static void ispis(Artikal a) {
		
			gp.textArea.append(a.naziv + "............." +a.cena + newline);
		
	}
	public static void prikaziPotvrdiPorudzbinuPicaDijalog(Artikal a) {
		PotvrdiPorudzbinuPicaDijalog dij = new PotvrdiPorudzbinuPicaDijalog(a);
		dij.setLocationRelativeTo(gp);
		dij.setVisible(true);
	}
	public static void prikaziKonobarProzor(Artikal a) {
		KonobarovPrikaz kp = new KonobarovPrikaz();
		kp.setVisible(true);
	}
	
}
