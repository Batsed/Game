import java.awt.Image;

import javax.swing.ImageIcon;


public class LoadTutorial {
	
	//Aktuelle Koordinaten f�r Breite des Bildes
	static int anzahl = 0; 
	static int anzahl2 = 0;

	static int BodenAnzahl = 0;
	static int BodenAnzahl2 = 0;
	
	//Bildbreite f�r Gamebackground
	static int ImageWidthSpeed  = -15;
	static int BildbreiteMal1 = 1920 + ImageWidthSpeed;
	//Bildbreite * 2 f�r Gamebackground
	static int BildbreiteMal2 = BildbreiteMal1 * 2;
	//Bildbreite * 3 f�r Gamebackground
	static int BildbreiteMal3 = BildbreiteMal1 * 3;

	//Bildbreite * 1 f�r Boden
	static int BodenBreiteMal1 = 1000;
	//Bildbreite * 2 f�r Boden
	static int BodenBreiteMal2 = BodenBreiteMal1 * 2;
	//Bildbreite * 3 f�r Boden
	static int BodenBreiteMal3 = BodenBreiteMal1 * 3;
	
	//Bild vom Gamebackground
	static Image img;

	//Bild vom Boden
	static Image Boden;
	
	//Bild vom Block
	static Image Block;
	
	public static void Tutorial(){
		
		//L�dt das Bild vom Spielhintergrund
		String Pfad = Texturepack.game_background;
		ImageIcon u = new ImageIcon(Pfad);
		img = u.getImage();	
		
		//L�dt Block
		String Block2 = Texturepack.Brick;
		ImageIcon o2 = new ImageIcon(Block2);
		Block = o2.getImage();
		
		//L�dt das Bild vom Boden
		String Pfad2 = Texturepack.Boden;
		ImageIcon o = new ImageIcon(Pfad2);
		Boden = o.getImage();		
	}
	
}
