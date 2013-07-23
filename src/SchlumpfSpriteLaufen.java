import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class SchlumpfSpriteLaufen {
	
	static BufferedImage character;;
	
	static int SpriteAnzahlBreite = 4;
	
	static int SpriteAnzahlH�he = 4;
	
	static int SpriteStehen = 4;
	
	static int characterBreite;
	
	static int characterH�he;
	
	static int characterBreiteFrame;
	
	static int characterH�heFrame;
	
	static int x = 0;
	
	static int y = 0;
	
	static int runde = 1;
	
	static int rundeVonH�he = 0;
	
	static int rundenaussatz = 0;
	
	static String Standbild = "aus";
	
	static int aa = 1;
	
	 private Thread SSLR = new Thread() {
	        public void run() {
	        	try {
					character = ImageIO.read(new File(Texturepack.pic_url));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}										
	        	
				characterBreite = character.getWidth(null);
				characterH�he = character.getHeight(null);
				
				characterBreiteFrame = characterBreite / SpriteAnzahlBreite;
				characterH�heFrame = characterH�he / SpriteAnzahlH�he;
								
				
	        	while (true) {	
	        		String standbild = Standbild;
	        		if(!(standbild.equalsIgnoreCase("aus"))) {
												
						if(runde == 1) {						
							x = 0;
						}
						if(runde >= 2) {						
							x += characterBreiteFrame;
						}
						if(runde == SpriteAnzahlBreite) {																							
							runde = 0;
							rundeVonH�he += 1;																														
						}	
						
						if(rundenaussatz == SpriteAnzahlH�he) {
							if(!(rundeVonH�he == SpriteAnzahlH�he)) {
								y += characterH�heFrame;
								rundenaussatz = 0;
							}else{
								y = 0;
								rundeVonH�he = 0;
								rundenaussatz = 0;
							}
						}
																				
						runde = runde + 1;
						rundenaussatz += 1;
						
						try {
							Thread.sleep(21);
				        } catch (InterruptedException e) {
				        	e.printStackTrace();
				        }					
	        		}else{	        				        			
	    				
	        			if(!(aa == 2)) {
	        				x = 0;
		        			y = characterBreiteFrame * (SpriteStehen - 1);
		        			
		        			aa = 2;
	        			}
	        			try {
							Thread.sleep(30);
				        } catch (InterruptedException e) {
				        	e.printStackTrace();
				        }	
	        			
	        		}
	        			
	        	}
	        }
	 };
	 
	public static void an() {
		x = 0;
		
		y = 0;
		
		runde = 1;
		
		rundeVonH�he = 0;
		
		rundenaussatz = 0;
		
		aa = 1;
	}
	
	public static void main() {
        new SchlumpfSpriteLaufen().start();
    }
	
    private void start() {
    	SSLR.start();
    }
}
