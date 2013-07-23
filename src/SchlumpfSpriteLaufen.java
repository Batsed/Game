import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class SchlumpfSpriteLaufen {
	
	static BufferedImage character;;
	
	static int SpriteAnzahl = 16;
	
	static int characterBreite;
	
	static int characterHöhe;
	
	static int characterBreiteFrame;
	
	static int x = 0;
	
	static int runde = 1;
	
	 private Thread SSLR = new Thread() {
	        public void run() {
	        	while (true) {					
					try {
						character = ImageIO.read(new File(Texturepack.pic_url));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}										
				
					characterBreite = character.getWidth(null);
					characterHöhe = character.getHeight(null);
					
					characterBreiteFrame = characterBreite / SpriteAnzahl;
					
					if(runde == 1) {
						
						x = 0;
					}
					if(runde >= 2) {
						x += characterBreiteFrame;
					}
					if(runde == SpriteAnzahl) {
						runde = 0;
					}
					
					runde = runde + 1;
					
					try {
						Thread.sleep(100);
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }					
				}
			}

			private boolean equalsIgnoreCase(String string) {
				// TODO Auto-generated method stub
				return false;
			}
	    };
	
	public static void main() {
        new SchlumpfSpriteLaufen().start();
    }
    
    private void start() {
    	SSLR.start();
    }
}
