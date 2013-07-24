
public class KeySchleife {

	static String KeyPressedRight = "aus";
	
	static String KeyPressedSpace = "false";
	
	static String KeyPressedLeft = "false";
	
	static String ChaLeftUpdate = "false";
	
	static String KeyPressed = "aus";
	
	int yhöhe = 0;
	
	String yOn = "false";
	
	int ytiefe = 0;		
	
	static int ChaLeftUpdateSchleife = 2;
	
	private Thread KeySchleife = new Thread() {
        public void run() {
        	while (true) {        		
        		
        		if(KeyPressedSpace.equalsIgnoreCase("true")) {
        			if(!(yOn.equalsIgnoreCase("true"))) {
        				
        				if(KeyPressed.equalsIgnoreCase("aus")) {
        					if(gui.ySpace <= 180) {
                				gui.ySpace += 15;            				
                			}
        				}else{
        					if(gui.ySpace <= 100) {
                				gui.ySpace += 15;            				
                			}
            				if(gui.ySpace >= 100) {
            					if(!(gui.ySpace >= 170)) {        						        					
            					gui.ySpace += 8; 
            					}
            				}
            				if(gui.ySpace >= 170) {
            					gui.ySpace += 2;
            				}
        				}        				
        			}
        			if(gui.ySpace >= 180) {
        				yOn = "true";        				
        			}
        			if(yOn.equalsIgnoreCase("true")) {
        				
        				gui.ySpace += -15;
        				
        				if(gui.ySpace <= 0) {
        					KeyPressedSpace = "false";
        					gui.ySpace = 0;
        					yOn = "false";
        				}
        			}
        			
        		}
        		
        		if(!(KeyPressedRight.equalsIgnoreCase("aus"))) {
		        	gui.speed = 15;																				
		
		        	gui.anzahl += gui.speed - 8;
					gui.anzahl2 += gui.speed - 8;
					gui.BodenAnzahl += gui.speed;
					gui.BodenAnzahl2 += gui.speed;
					
					if(gui.anzahl >= gui.BildbreiteMal3) {
						gui.anzahl = 0;
						gui.anzahl2 = 0;
					}	
					if(gui.BodenAnzahl >= gui.BodenBreiteMal3) {
						gui.BodenAnzahl = 0;
						gui.BodenAnzahl2 = 0;
					}
					if(gui.schleife == 1) {
						SchlumpfSpriteLaufen.an();
						gui.schleife = 2;
					}	
					SchlumpfSpriteLaufen.Standbild = "an";					
        		}
        		
        		if(KeyPressedLeft.equalsIgnoreCase("true")){
        			gui.speed = -15;

        			gui.anzahl += gui.speed + 8;
        			gui.anzahl2 += gui.speed + 8;	
        			gui.BodenAnzahl += gui.speed;
        			gui.BodenAnzahl2 += gui.speed;
    				
        			//Gamebackground
    				if(gui.anzahl <= 0) {
    					gui.anzahl = gui.BildbreiteMal2;					
    				}				
    				
    				if(gui.anzahl2 <= gui.BildbreiteMal1 - (gui.BildbreiteMal1 * 2)) {
    					gui.anzahl2 = gui.BildbreiteMal1;						
    				}
    				
    				
    				//Boden
    				if(gui.BodenAnzahl <= 0) {
    					gui.BodenAnzahl = gui.BodenBreiteMal1;
    				}
    				if(gui.BodenAnzahl == gui.BodenBreiteMal1) {
    					gui.BodenAnzahl2 = gui.BodenBreiteMal1;
    				}
    				SchlumpfSpriteLaufen.Standbild = "an";
    				SchlumpfSpriteLaufen.LaufenLinks = "true";
        		}
        		
        		
        		try {
					Thread.sleep(25);
		        } catch (InterruptedException e) {
		        	e.printStackTrace();
		        }	
        		     		        	        		
	        }
        }
	};
	
	public static void main() {
        new KeySchleife().start();
    }
	
    private void start() {
    	KeySchleife.start();
    }
	
}
