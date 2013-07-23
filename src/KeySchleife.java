
public class KeySchleife {
	
	static String KeyPressedRight;
	
	static String KeyPressedSpace = "false";
	
	int yhöhe = 0;
	
	String yOn = "false";
	
	int ytiefe = 0;
	
	private Thread KeySchleife = new Thread() {
        public void run() {
        	while (true) {        		
        		
        		if(KeyPressedSpace.equalsIgnoreCase("true")) {
        			if(!(yOn.equalsIgnoreCase("true"))) {
        				if(yhöhe <= 150) {
            				gui.ySpace += 10;            				
            			}	
        			}
        			
        			if(gui.ySpace >= 150) {
        				yOn = "true";        				
        			}
        			if(yOn.equalsIgnoreCase("true")) {
        				if(gui.ySpace <= 150) {
        					gui.ySpace += -10;
        				}
        				if(gui.ySpace == 0) {
        					KeyPressedSpace = "false";
        					yOn = "false";
        				}
        			}
        			
        		}
        		
        		if(!(KeyPressedRight.equalsIgnoreCase("aus"))) {
		        	gui.speed = 20;																				
		
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
					try {
						Thread.sleep(12);
			        } catch (InterruptedException e) {
			        	e.printStackTrace();
			        }
        		}  
        		try {
					Thread.sleep(20);
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
