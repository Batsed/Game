import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
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

//Block
static Image Block;

//Geschwindigkeit des scrollens des Bildes
static int speed; 

//Aktuelle Breite des Bildes
static int anzahl = 0; 
static int anzahl2 = 0;

static int BodenAnzahl = 0;
static int BodenAnzahl2 = 0;

static int Brick = 0;

//fps
long firstFrame;
int frames;
long currentFrame;
int fps;
String fpsvisible = "false";

//Seconds
int Seconds;

static Rectangle rect1 = new Rectangle();
static Rectangle BrickReck1 = new Rectangle();
static Rectangle BrickReck2 = new Rectangle();
static Rectangle BrickReck3 = new Rectangle();

static Rectangle rect2 = new Rectangle();

//Höhe für offscreenimage
int Bildhöhe = frame.fenster.getHeight();

//Bildbreite für Gamebackground
static int ImageWidthSpeed  = -15;
static int BildbreiteMal1 = 1920 + ImageWidthSpeed;
//Bildbreite * 2 für Gamebackground
static int BildbreiteMal2 = BildbreiteMal1 * 2;
//Bildbreite * 3 für Gamebackground
static int BildbreiteMal3 = BildbreiteMal1 * 3;

//Bildbreite * 1 für Boden
static int BodenBreiteMal1 = 1000;
//Bildbreite * 2 für Boden
static int BodenBreiteMal2 = BodenBreiteMal1 * 2;
//Bildbreite * 3 für Boden
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

	public gui() throws Exception { 				
		
		setFocusable(true);					        		       			
		
		//Lädt das Bild vom Spielhintergrund
		String Pfad = Texturepack.game_background;
		ImageIcon u = new ImageIcon(Pfad);
		img = u.getImage();	
		
		//Lädt das Bild vom Boden
		String Pfad2 = Texturepack.Boden;
		ImageIcon o = new ImageIcon(Pfad2);
		Boden = o.getImage();	
		
		//Lädt Block
		String Block2 = Texturepack.Brick;
		ImageIcon o2 = new ImageIcon(Block2);
		Block = o2.getImage();
		
		KeySchleife.main();
		
		//Öffnet neuen Thread für Character
		SchlumpfSpriteLaufen.main();
		//Fügt einen Keylistener hinzu
		addKeyListener(new AL());	

		
		
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

		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;										
		
		//Anfang vom Zeichnen des Gamehintergrunds
		bg.drawImage(img, 0 - anzahl2, 0,null);			

		bg.drawImage(img, BildbreiteMal1 - anzahl, 0,null);				

		bg.drawImage(img, BildbreiteMal2 - anzahl, 0,null);			

		bg.drawImage(img, BildbreiteMal3 - anzahl, 0,null);
		//Ende vom Zeichnen des Gamehintergrunds
		
		//Anfang vom Zeichnen des Bodens
		bg.drawImage(Boden, 0 - BodenAnzahl2, 600,null);

		bg.drawImage(Boden, BodenBreiteMal1 - BodenAnzahl, 600,null);

		bg.drawImage(Boden, BodenBreiteMal2 - BodenAnzahl, 600,null);

		bg.drawImage(Boden, BodenBreiteMal3 - BodenAnzahl, 600,null);

		//Ende vom Zeichnen des Bodens
		
		//Anfang vom Zeichnen des Blocks
		//bg.setColor(Color.GREEN);	
		//bg.drawRect(500 - Brick, 340, 50, 60);
		
		//Block 1
		bg.drawImage(Block, 0 - Brick, 550,null);
		BrickReck1.setBounds(0 - Brick,540, 50, 60);
		//Block 2			
		bg.drawImage(Block, 250 - Brick, 450,null);
		rect1.setBounds(250 - Brick,440, 50, 60);
		//Block 3
		bg.drawImage(Block, 500 - Brick, 350, null);
		BrickReck2.setBounds(500 - Brick,340, 50, 60);
		//Block 4
		bg.drawImage(Block, 750 - Brick, 250, null);
		BrickReck3.setBounds(750 - Brick,240, 50, 60);
		
		//Anfang vom Zeichnen des Characters
		if(!(SchlumpfSpriteLaufen.character == null)) {
			if(!(SchlumpfSpriteLaufen.y + SchlumpfSpriteLaufen.characterHöheFrame < SchlumpfSpriteLaufen.characterHöheFrame)){
				//double degrees = 180;
				//AffineTransformOp op = new AffineTransformOp(AffineTransform.getRotateInstance(Math.toRadians(degrees),(double)SchlumpfSpriteLaufen.character.getWidth()/2.0, (double)SchlumpfSpriteLaufen.character.getHeight()/2.0), AffineTransformOp.TYPE_BILINEAR); 
				//BufferedImage character2 = op.filter(SchlumpfSpriteLaufen.character, null);  
				

				int y = SchlumpfSpriteLaufen.y;
		        int x = SchlumpfSpriteLaufen.x;
		        int CharBreite = SchlumpfSpriteLaufen.characterBreiteFrame;
		        int CharHöhe = SchlumpfSpriteLaufen.characterHöheFrame;
		        
		        if(!(CharHöhe + y >= 513)) {
		    		//bg.drawRect(590, 480 - ySpace  - Strings.ChaY, 60, 120);
		    		rect2.setBounds(590, 480 - ySpace  - Strings.ChaY, 60, 120);
		        	bg.drawImage(SchlumpfSpriteLaufen.character.getSubimage(x, y, CharBreite, CharHöhe), 550, 480  - ySpace - Strings.ChaY, this);
		        }else{
		        	//bg.drawRect(590, 480 - ySpace  - Strings.ChaY, 60, 120);
		        	rect2.setBounds(590, 480 - ySpace  - Strings.ChaY, 60, 120);
		        	bg.drawImage(SchlumpfSpriteLaufen.character.getSubimage(x, y - 384, CharBreite, CharHöhe), 550, 480  - ySpace - Strings.ChaY, this);
		        }
		        		        
		        
		        
			}
		}    	
		//Ende vom Zeichnen des Characters				
		
		//Überprüfen 
		
		
		//Anzeige für Fps
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
		
		//Kolliesionen überprüfen	
		if(370 >= 608 - ySpace - Strings.ChaY) {
			//System.out.println("Brick: " + (370) + " Cha: " + (608 - ySpace - Strings.ChaY));
			//System.out.println("Cha ist höher");
		}
		if(BrickReck1.intersects(rect2)){				 
			KollisionsUpdater.BrickReck1();
        }
		if(rect1.intersects(rect2)){	
			KollisionsUpdater.rect1();		
		}
		if(BrickReck2.intersects(rect2)) {
			KollisionsUpdater.BrickReck2();
		}
		if(BrickReck3.intersects(rect2)) {
			KollisionsUpdater.BrickReck3();
		}
		if(!(BrickReck1.intersects(rect2))){
			if(!(BrickReck2.intersects(rect2))){
				if(!(rect1.intersects(rect2))){
					if(!(BrickReck3.intersects(rect2))) {											
					KollisionsUpdater.NoK();
					}
				}
			}
		}		
	}	

	public void update(Graphics g)
	{ 
		paint(g); 
	}
	
	//Keyevent
	private class AL extends KeyAdapter{

		 public AL() {

		 }
		 
		 //Anfang vom überprüfen ob eine Taste losgelassen wurde
		 public void keyReleased(KeyEvent e){

			 Strings.key = e.getKeyCode();
			 
			 if(Strings.key == KeyEvent.VK_LEFT){	
				 KeySchleife.ChaLeftUpdateSchleife = 1;
				 KeySchleife.KeyPressed = "aus";	
				 KeySchleife.KeyPressedLeft = "false";
				 SchlumpfSpriteLaufen.LaufenLinks = "false";
				 SchlumpfSpriteLaufen.Standbild = "aus";
				 SchlumpfSpriteLaufen.aa = 1;				
				 speed = 0;
			 }

			 if(Strings.key == KeyEvent.VK_RIGHT){					 
				schleife = 1;
				KeySchleifeAnAus = 1;
				KeySchleife.KeyPressed = "aus";	
				KeySchleife.KeyPressedRight = "aus";
				SchlumpfSpriteLaufen.Standbild = "aus";
				SchlumpfSpriteLaufen.aa = 1;				
				speed = 0;																

			 }
			 if(Strings.key == KeyEvent.VK_SHIFT) {
				 KeySchleife.run = 0;
				 KeySchleife.KeyPressedShift = "false";
			 }
		 }
		 //Ende vom überprüfen ob eine Taste losgelassen wurde

		//Anfang vom überprüfen ob eine Taste gedrückt wurde
		 public void keyPressed(KeyEvent e){
			 Strings.key = e.getKeyCode();  
			 if(Strings.key == KeyEvent.VK_F3) {
					if(fpsvisible.equalsIgnoreCase("true")) {
						fpsvisible = "false";
					}else{
						fpsvisible = "true";
					}
				}
						
				if(Strings.key == KeyEvent.VK_ESCAPE) {
					Strings.ChaJump = "false";
					Strings.MenüMusik = "true";
					frame.visible();
				}
				if(Strings.key == KeyEvent.VK_SHIFT) {
					KeySchleife.KeyPressedShift = "true";
				}
				if(Strings.key == KeyEvent.VK_SPACE) {
					if(!(Strings.AnimationY == true)) {
						KeySchleife.KeyPressedSpace = "true";	
					}								
				}
			 

				
				if (Strings.key == KeyEvent.VK_LEFT ){
					if(KeySchleife.ChaLeftUpdateSchleife == 1) {
						KeySchleife.ChaLeftUpdate = "true"; 
						KeySchleife.ChaLeftUpdateSchleife = 2;
						KeySchleife.KeyPressed = "an";	
					}
					KeySchleife.KeyPressedLeft = "true";
					SchlumpfSpriteLaufen.RightLeft = "left";										
				} 

	
				

				if(Strings.key == KeyEvent.VK_RIGHT) {	
					KeySchleife.KeyPressedRight = "an";
					KeySchleife.KeyPressed = "an";	
					SchlumpfSpriteLaufen.RightLeft = "right";									
					
					if(KeySchleifeAnAus == 3) {					
						KeySchleifeAnAus = 1;										
					}
				}
			 }
	
			
		//Ende vom überprüfen ob eine Taste gedrückt wurde
	}
}