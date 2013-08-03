import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class SchlumpfSpriteLaufen {

	static BufferedImage character;;

	static int SpriteAnzahlBreite = 4;

	static int SpriteAnzahlHöhe = 4;

	static int SpriteStehen = 4;

	static int characterBreite;

	static int characterHöhe;

	static int characterBreiteFrame;

	static int characterHöheFrame;

	static String LaufenLinks = "false";

	static int x = 0;

	static int y = 0;

	static int runde = 1;

	static int rundeVonHöhe = 0;

	static int rundenaussatz = 0;

	static String Standbild = "aus";

	static int aa = 1;

	static String RightLeft = "right";

	static int one = 1;	
	private Thread SSLR = new Thread() {            
	public void run() {	   
			while (true) {   
				
				//Anzeige für Fps
				if(gui.fpsvisible.equalsIgnoreCase("true")){						
					Strings.Chaframes++;
					Strings.ChacurrentFrame = System.currentTimeMillis();
					if(Strings.ChacurrentFrame > Strings.ChafirstFrame + 1000){				
						Strings.ChafirstFrame = Strings.ChacurrentFrame;
						Strings.Chafps = Strings.Chaframes;
						Strings.Chaframes = 0;
					}			
					
				}
				
				
				String standbild = Standbild;
				String laufenLinks = LaufenLinks;
				if(!(standbild.equalsIgnoreCase("aus"))) {
		    		if(!(laufenLinks.equalsIgnoreCase("true"))) {
		        		try {
							character = ImageIO.read(new File(Texturepack.pic_url));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		    		}
				}
				if(!(standbild.equalsIgnoreCase("aus"))) {
		    		if(laufenLinks.equalsIgnoreCase("true")) {		        					        				        			
		    			try {
							character = ImageIO.read(new File(Texturepack.ChaLinks));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		    		}
				}	        			        		
		
				if(one == 1) {
					try {
						character = ImageIO.read(new File(Texturepack.pic_url));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
					characterBreite = character.getWidth(null);
					characterHöhe = character.getHeight(null);
		
					characterBreiteFrame = characterBreite / SpriteAnzahlBreite;
					characterHöheFrame = characterHöhe / SpriteAnzahlHöhe;
					one = 2;
				}
		
				characterBreite = character.getWidth(null);
				characterHöhe = character.getHeight(null);
		
				characterBreiteFrame = characterBreite / SpriteAnzahlBreite;
				characterHöheFrame = characterHöhe / SpriteAnzahlHöhe;
		
				if(!(standbild.equalsIgnoreCase("aus"))) {	        				        		
		
					if(KeySchleife.ChaLeftUpdate.equalsIgnoreCase("true")) {
						x = 0;	        				
						y = 0;	        				
						runde = 1;	        				
						rundeVonHöhe = 0;	        				
						rundenaussatz = 0;	
		
						KeySchleife.ChaLeftUpdate = "false";
					}	        			  	        		
		
					if(runde == 1) {						
						x = 0;
					}
					if(runde >= 2) {						
						x += characterBreiteFrame;
					}
					if(runde == SpriteAnzahlBreite) {																							
						runde = 0;
						rundeVonHöhe += 1;																														
					}	
		
					if(rundenaussatz == SpriteAnzahlHöhe) {
						if(!(rundeVonHöhe == SpriteAnzahlHöhe)) {
							y += characterHöheFrame;
							rundenaussatz = 0;
						}else{
							y = 0;
							rundeVonHöhe = 0;
							rundenaussatz = 0;
						}
					}
		
					runde = runde + 1;
					rundenaussatz += 1;
		
				}else{	  	        				        			
		
					if(!(aa == 2)) {
						if(RightLeft.equalsIgnoreCase("left")){	        				
		        			try {
								character = ImageIO.read(new File(Texturepack.ChaLinks));
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}	    	        			        					        				
		    			}else{
		    				try {
								character = ImageIO.read(new File(Texturepack.pic_url));
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		    			}
		
						
						x = 0;
		    			y = characterBreiteFrame * (SpriteStehen - 1);
		
		    			aa = 2;		        			
					}		        			
				}
				if(KeySchleife.KeyPressedShift == "false") {
					try {
						Thread.sleep(30);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(KeySchleife.KeyPressedShift == "true") {
					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}  
			}
		}
	};
	
	 public static void main() {
		 new SchlumpfSpriteLaufen().start();
	 }
		     
	 private void start() {
		//SSLR.setPriority(0);			
		 SSLR.start();
	 }
	

	public static void an() {
		x = 0;

		y = 0;

		runde = 1;

		rundeVonHöhe = 0;

		rundenaussatz = 0;

		aa = 1;
	}
}