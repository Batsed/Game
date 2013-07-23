import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;





public class gui extends JPanel implements ActionListener {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Timer time;

//Bild vom Gamebackground
static Image img;

//Bild vom Boden
static Image Boden;

int key;

//Geschwindigkeit des scrollens des Bildes
static int speed; 

//Aktuelle Breite des Bildes
static int anzahl = 0; 
static int anzahl2 = 0;

static int BodenAnzahl = 0;
static int BodenAnzahl2 = 0;

//fps
long firstFrame;
int frames;
long currentFrame;
int fps;
String fpsvisible = "false";

//Seconds
int Seconds;

//H�he f�r offscreenimage
int Bildh�he = frame.fenster.getHeight();

//Bildbreite f�r Gamebackground
static int BildbreiteMal1 = 1920;
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

//Geschwindigkeit der Perfomance
int Geschwindigkeit = 1;

//Auf diesen Bild wird dann gezeichnet
Image offscreen;

//Offscreen Image
static Graphics bg; 

static int schleife = 1;  

static int KeySchleifeAnAus = 3;

static int ySpace = 0;

	public gui() { 				
		
		setFocusable(true);				
		
		//L�dt das Bild vom Spielhintergrund
		String Pfad = Texturepack.game_background;
		ImageIcon u = new ImageIcon(Pfad);
		img = u.getImage();	
		
		//L�dt das Bild vom Boden
		String Pfad2 = Texturepack.Boden;
		ImageIcon o = new ImageIcon(Pfad2);
		Boden = o.getImage();	
		
		//F�gt einen Keylistener hinzu
		addKeyListener(new AL());	

		//�ffnet neuen Thread f�r Character
		SchlumpfSpriteLaufen.main();
		
		time = new Timer(Geschwindigkeit,this);
		time.start();
	}

 
	public void actionPerformed(ActionEvent e){
		repaint();
	}		

	public void paint(Graphics g){
		
		offscreen = createImage(BildbreiteMal1,Bildh�he);
		bg = offscreen.getGraphics();

		bg.clearRect(0,0,BildbreiteMal1,Bildh�he);									

		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;				
		
		//Anfang vom Zeichnen des Gamehintergrunds
		if(anzahl2 >= -20) {
			if(!(anzahl2 >= BildbreiteMal3)) {
				bg.drawImage(img, 0 - anzahl2, 0,null);
			}
		}				

		if (anzahl >= 0) {
			if(!(anzahl >= BildbreiteMal3)) {
				bg.drawImage(img, BildbreiteMal1 - anzahl, 0,null);
			}
		}				

		if (anzahl >= BildbreiteMal1){
			if(!(anzahl >= BildbreiteMal3)) {
				bg.drawImage(img, BildbreiteMal2 - anzahl, 0,null);
			}
		}				

		if (anzahl >= BildbreiteMal2){
			if(!(anzahl >= BildbreiteMal3)) {
				bg.drawImage(img, BildbreiteMal3 - anzahl, 0,null);
			}
		}
		//Ende vom Zeichnen des Gamehintergrunds
		
		//Anfang vom Zeichnen des Bodens
		if(BodenAnzahl2 >= -20) {
			if(!(BodenAnzahl2 >= BodenBreiteMal3)) {
				bg.drawImage(Boden, 0 - BodenAnzahl2, 600,null);
			}
		}
		
		if (BodenAnzahl >= 0) {
			if(!(BodenAnzahl >= BodenBreiteMal3)) {
				bg.drawImage(Boden, BodenBreiteMal1 - BodenAnzahl, 600,null);
			}
		}
		
		if (BodenAnzahl >= BodenBreiteMal1){
			if(!(BodenAnzahl >= BodenBreiteMal3)) {
				bg.drawImage(Boden, BodenBreiteMal2 - BodenAnzahl, 600,null);
			}
		}
		
		if (BodenAnzahl >= BodenBreiteMal2){
			if(!(BodenAnzahl >= BodenBreiteMal3)) {
				bg.drawImage(Boden, BodenBreiteMal3 - BodenAnzahl, 600,null);
			}
		}
		//Ende vom Zeichnen des Bodens
		
		//Anfang vom Zeichnen des Characters
		if(!(SchlumpfSpriteLaufen.character == null)) {
			if(!(SchlumpfSpriteLaufen.y + SchlumpfSpriteLaufen.characterH�heFrame < SchlumpfSpriteLaufen.characterH�heFrame)){
				bg.drawImage(SchlumpfSpriteLaufen.character.getSubimage(SchlumpfSpriteLaufen.x, SchlumpfSpriteLaufen.y, SchlumpfSpriteLaufen.characterBreiteFrame, SchlumpfSpriteLaufen.characterH�heFrame), 600, 480  - ySpace, this);
			}
		}    	
		//Ende vom Zeichnen des Characters				
		
		
		//Anzeige f�r Fps
		if(fpsvisible.equalsIgnoreCase("true")){						
			frames++;
			currentFrame = System.currentTimeMillis();
			if(currentFrame > firstFrame + 1000){
				firstFrame = currentFrame;
				fps = frames;
				frames = 0;
			}
			String Fps = String.valueOf(fps);
			bg.setFont(new Font("Sans", Font.PLAIN, 30)); 
			bg.setColor(Color.WHITE); 
		    bg.drawString("fps: " + Fps, 50, 50);
		}
        
		//Doublebuffer
		g2d.drawImage(offscreen,0,0,null);
		
	}

	public void update(Graphics g)
	{ 
		paint(g); 
	}
	
	//Keyevent
	private class AL extends KeyAdapter{

		 public AL() {

		 }
		 
		 //Anfang vom �berpr�fen ob eine Taste losgelassen wurde
		 public void keyReleased(KeyEvent e){

			 key = e.getKeyCode();

			 if(key == KeyEvent.VK_LEFT){

				 speed = 0;
			 }

			 if( key == KeyEvent.VK_RIGHT){	
				schleife = 1;
				KeySchleifeAnAus = 1;
				KeySchleife.KeyPressedRight = "aus";
				SchlumpfSpriteLaufen.Standbild = "aus";
				SchlumpfSpriteLaufen.aa = 1;				
				speed = 0;																

			 }
		 }
		 //Ende vom �berpr�fen ob eine Taste losgelassen wurde

		//Anfang vom �berpr�fen ob eine Taste gedr�ckt wurde
		 public void keyPressed(KeyEvent e){


			 key = e.getKeyCode();

			if (key == KeyEvent.VK_LEFT ){

				speed = -20;

				anzahl += speed;
				anzahl2 += speed;	
				BodenAnzahl += speed;
				BodenAnzahl2 += speed;
				

				if(anzahl <= 20) {
					anzahl = BildbreiteMal3;					
				}
				if(BodenAnzahl <= 20) {
					BodenAnzahl = BodenBreiteMal1;
				}
				if(anzahl == BildbreiteMal1) {
					anzahl2 = BildbreiteMal1;	
					
				}
				if(BodenAnzahl == BodenBreiteMal1) {
					BodenAnzahl2 = BodenBreiteMal1;
				}
			} 


			if(key == KeyEvent.VK_RIGHT) {
				
				KeySchleife.KeyPressedRight = "an";											
				
				if(KeySchleifeAnAus == 3) {
					KeySchleife.main();
					KeySchleifeAnAus = 1;										
				}
			}
				
			if(key == KeyEvent.VK_F3) {
				if(fpsvisible.equalsIgnoreCase("true")) {
					fpsvisible = "false";
				}else{
					fpsvisible = "true";
				}
			}
					
			if(key == KeyEvent.VK_ESCAPE) {

				frame.visible();
			}
			if(key == KeyEvent.VK_SPACE) {
				KeySchleife.KeyPressedSpace = "true";
			}
		 }
		//Ende vom �berpr�fen ob eine Taste gedr�ckt wurde
	}
}