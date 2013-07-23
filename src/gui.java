import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class gui extends JPanel implements ActionListener {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Timer time;
static Image img;

int key;

//Geschwindigkeit des scrollens des Bildes
static int speed; 

//Aktuelle Breite des Bildes
static int anzahl = 0; 
static int anzahl2 = 0;

//fps
int fps;

//Seconds
int Seconds;

int Bildhöhe = 700;

//Bildbreite
static int BildbreiteMal1 = 1280;

//Bildbreite * 2
static int BildbreiteMal2 = BildbreiteMal1 * 2;

//Bildbreite * 3
static int BildbreiteMal3 = BildbreiteMal1 * 3;

//Geschwindigkeit der Perfomance
int Geschwindigkeit = 25;

//Auf diesen Bild wird dann gezeichnet
Image offscreen;

//Dies ist die Grafik Device des Bildes(Image offscreen),
//worauf man einfach zeichnen kann.
static Graphics bg; 

static int schleife = 1;  

static int KeySchleifeAnAus = 3;

	public gui() { 				

		setFocusable(true);

		String Pfad = Texturepack.game_background;
		ImageIcon u = new ImageIcon(Pfad);
		img = u.getImage();			

		addKeyListener(new AL());								
		//setDoubleBuffered(true);

		//SchlumpfSpriteLaufen.SchlumpfSpriteLaufen();
		SchlumpfSpriteLaufen.main();
		
		time = new Timer(Geschwindigkeit,this);
		time.start();
	}

 
	public void actionPerformed(ActionEvent e){
		repaint();
	}		

	public void paint(Graphics g){
		
		offscreen = createImage(BildbreiteMal1,Bildhöhe);
		bg = offscreen.getGraphics();

		bg.clearRect(0,0,BildbreiteMal1,Bildhöhe);

		if(Seconds >= 1000) {					
			String Fps = String.valueOf(fps);
			frame.fenster.setTitle("Game | fps: " + Fps);
			fps = 0;
			Seconds = 0;
		}else{
			Seconds += Geschwindigkeit;
			fps += 1;			
		}

		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;				

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
		if(!(SchlumpfSpriteLaufen.character == null)) {
			if(!(SchlumpfSpriteLaufen.y + SchlumpfSpriteLaufen.characterHöheFrame < SchlumpfSpriteLaufen.characterHöheFrame)){
				bg.drawImage(SchlumpfSpriteLaufen.character.getSubimage(SchlumpfSpriteLaufen.x, SchlumpfSpriteLaufen.y, SchlumpfSpriteLaufen.characterBreiteFrame, SchlumpfSpriteLaufen.characterHöheFrame), 600, 500, this);
			}
		}    	
		
		//Doublebuffer
		g2d.drawImage(offscreen,0,0,null);
		
	}

	public void update(Graphics g)
	{ 
		paint(g); 
	}

	private class AL extends KeyAdapter{

		 public AL() {

		 }

		  //Taste gedrückt
		public void keyReleased(KeyEvent e){

			key = e.getKeyCode();

			if(key == KeyEvent.VK_LEFT){

				speed = 0;
			}

			if( key == KeyEvent.VK_RIGHT){	
				schleife = 1;
				KeySchleifeAnAus = 1;
				KeySchleife.KeyRightPressed = "aus";
				SchlumpfSpriteLaufen.Standbild = "aus";
				SchlumpfSpriteLaufen.aa = 1;				
				speed = 0;																

			}
		}

		 public void keyPressed(KeyEvent e){


			 key = e.getKeyCode();

			if (key == KeyEvent.VK_LEFT ){

				speed = -20;

				anzahl += speed;
				anzahl2 += speed;	

				if(anzahl <= 20) {
					anzahl = BildbreiteMal3;											
				}
				if(anzahl == BildbreiteMal1) {
					anzahl2 = BildbreiteMal1;	
				}
			} 


			if(key == KeyEvent.VK_RIGHT) {
				
				KeySchleife.KeyRightPressed = "an";											
				
				if(KeySchleifeAnAus == 3) {
					KeySchleife.main();
					KeySchleifeAnAus = 1;										
				}
			}
				
					
					
				if(key == KeyEvent.VK_ESCAPE) {

					frame.visible();
				}		 					
		 }
	}
}