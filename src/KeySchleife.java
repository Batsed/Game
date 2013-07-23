
public class KeySchleife {
	
	static String KeyRightPressed;
	
	private Thread KeySchleife = new Thread() {
        public void run() {
        	while (true) {        		
        		
        		if(!(KeyRightPressed.equalsIgnoreCase("aus"))) {
		        	gui.speed = 10;																				
		
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
        		}else{  
        			try {
						Thread.sleep(100);
			        } catch (InterruptedException e) {
			        	e.printStackTrace();
			        }
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
