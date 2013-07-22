import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.VolatileImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;



public class gui extends JPanel implements ActionListener {
Timer time;
static Image img;
static Image character;

int key;

//Geschwindigkeit des scrollens des Bildes
int speed; 

//Aktuelle Breite des Bildes
int anzahl = 0; 
int anzahl2 = 0;

//fps
int fps;

//Seconds
int Seconds;

//Bildbreite
int BildbreiteMal1 = 850;

//Bildbreite * 2
int BildbreiteMal2 = 1700;

//Bildbreite * 3
int BildbreiteMal3 = 2550;

//Geschwindigkeit der Perfomance
int Geschwindigkeit = 1;

//Auf diesen Bild wird dann gezeichnet
Image offscreen;

//Dies ist die Grafik Device des Bildes(Image offscreen),
//worauf man einfach zeichnen kann.
static Graphics bg; 

int screenWidth, screenHeight;

final int TILE_WIDTH = 128;

final int TILE_HEIGHT = 128;

int tilePosX;

int tilePosY;

final int TILE_COLUMN_CNT = 4;

final int TILE_ROW_CNT = 4;

VolatileImage[] tiles;

BufferStrategy strategy;

	public gui() { 				
		
		setFocusable(true);
		//URL Pfad = this.getClass().getResource("Texturepack/game_background.png");
		
		String Pfad = Texturepack.game_background;
		ImageIcon u = new ImageIcon(Pfad);
		img = u.getImage();	
		
		//String PfadCharacter = Texturepack.pic_url;
		//ImageIcon a = new ImageIcon(PfadCharacter);				
		//character = a.getImage();
		
		TilesTest.main(null );
		
		addKeyListener(new AL());						
		
		//setDoubleBuffered(true);
		
		time = new Timer(Geschwindigkeit,this);
		time.start();
	}

 
	public void actionPerformed(ActionEvent e){
		repaint();
	}		

	public void paint(Graphics g){
		
		offscreen = createImage(900,506);
		bg = offscreen.getGraphics();
		
		bg.clearRect(0,0,900,506);
		
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
		
		//Zeichnung vom Character
		//bg.drawImage(TilesTest.strategy, 0, 0, null);
		//bg.getGraphics().drawImage(tilesMap.getSubimage(x, y, TILE_WIDTH, TILE_HEIGHT), 0, 0, null);
		
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
					
					speed = 20;
					
					anzahl += speed;
					anzahl2 += speed;					
											
					if(anzahl >= BildbreiteMal3) {
						anzahl = 0;
						anzahl2 = 0;						
					}					
				}
				if(key == KeyEvent.VK_ESCAPE) {
					
					frame.visible();
				}		 					
		 }
	}
	
	public Thread renderer = new Thread() {
        public void run() {
            int i = 0;
            while (true) {
                Graphics2D be = (Graphics2D) strategy.getDrawGraphics();
                be.clipRect(0, 0, screenWidth, screenHeight);
                be.drawImage(tiles[i], tilePosX, tilePosY, null);
                i = ++i % tiles.length;
                g.dispose();
                strategy.show();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
 
    public TilesTest() {
        //super("TilesTest");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        screenWidth = 200;
    	screenHeight = 200;
    	
 
        tilePosX = (screenWidth - TILE_WIDTH) / 2;
        tilePosY = (screenHeight - TILE_HEIGHT) / 2;
        //setSize(screenWidth, screenHeight);
        //setResizable(false);
        //setVisible(true);
        initGFX();
        createBufferStrategy(2);
        strategy = getBufferStrategy();
    }
 
    /**
     * 
     */
    private void initGFX() {
        try {			
            BufferedImage tilesMap = ImageIO.read(new File(Texturepack.pic_url));
            int width = tilesMap.getWidth();
            int height = tilesMap.getHeight();
 
            tiles = new VolatileImage[TILE_ROW_CNT * TILE_COLUMN_CNT];
 
            for (int i = 0, y = 0; i < TILE_ROW_CNT; i++) {
                for (int j = 0, x = 0; j < TILE_COLUMN_CNT; j++) {
                	VolatileImage vImg = this.createVolatileImage(TILE_WIDTH, TILE_HEIGHT);
                	vImg.getGraphics().drawImage(tilesMap.getSubimage(x, y, TILE_WIDTH, TILE_HEIGHT), 0, 0, this);
                	tiles[i * TILE_ROW_CNT + j] = vImg;
                	x += TILE_WIDTH;
                }
                y += TILE_HEIGHT;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    //public static void main(String[] args) {
      //  new start();
    //}
 
    /**
     * 
     */
    //private void start() {
      //  renderer.start();
    //}
}
	
	
	



