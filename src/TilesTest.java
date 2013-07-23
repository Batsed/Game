import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.VolatileImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;




public class TilesTest extends JFrame {


	
static int screenWidth;

static int screenHeight;

final static int TILE_WIDTH = 128;
	 
final static int TILE_HEIGHT = 128;
	 
static int tilePosX;
	 
static int tilePosY;
	 
final int TILE_COLUMN_CNT = 4;
	 
final int TILE_ROW_CNT = 4;
	    
VolatileImage[] tiles;
	 
BufferStrategy strategy;

static int Geschwindigkeit = 1;
static Timer time;
	 
	public void TilesTest() {	    			  	    	
    	
    	screenWidth = TilesTest.fenster.getWidth();
    	screenHeight = TilesTest.fenster.getHeight();
    	
        tilePosX = (screenWidth - TILE_WIDTH) / 2;
        tilePosY = (screenHeight - TILE_HEIGHT) / 2;
        initGFX();
        //main(null);
	}
	
	private void initGFX() {
        try {			
            BufferedImage tilesMap = ImageIO.read(new File(Texturepack.pic_url));
            int width = tilesMap.getWidth();
            int height = tilesMap.getHeight();
            
            System.out.println("test");
            
            tiles = new VolatileImage[TILE_ROW_CNT * TILE_COLUMN_CNT];
 
            for (int i = 0, y = 0; i < TILE_ROW_CNT; i++) {
                for (int j = 0, x = 0; j < TILE_COLUMN_CNT; j++) {
                	VolatileImage vImg = this.createVolatileImage(TILE_WIDTH, TILE_HEIGHT);
                	vImg.getGraphics().drawImage(tilesMap.getSubimage(x, y, TILE_WIDTH, TILE_HEIGHT), 0, 0, this);
                	gui.bg.drawImage(tilesMap.getSubimage(x, y, TILE_WIDTH, TILE_HEIGHT), 0, 0, null);
                	//gui.offscreen = createImage(frame.fenster.getWidth(),frame.fenster.getHeight());
                	//vImg = gui.offscreen.getGraphics();
                	kontainer.add(Texturepack.image);
                	//Image a = tilesMap.getGraphics();
                	tiles[i * TILE_ROW_CNT + j] = vImg;
                	x += TILE_WIDTH;
                }
                y += TILE_HEIGHT;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	    
	//private Thread renderer = new Thread() {
        public void run() {
            int i = 0;
            while (true) {
            	createBufferStrategy(2);
            	strategy = getBufferStrategy();
                Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
                g.clipRect(0, 0, screenWidth, screenHeight);
                g.drawImage(tiles[i], tilePosX, tilePosY, TilesTest.this);
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
    //};
    
 
    public static void main(String[] args) {
        new TilesTest().start();
    }
    
    private void start() {
        run();
    }
}