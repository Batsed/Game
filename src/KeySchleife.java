
public class KeySchleife {

	static String KeyPressedRight = "aus";
	
	static String KeyPressedSpace = "false";
	
	static String KeyPressedLeft = "false";
	
	static String ChaLeftUpdate = "false";
	
	static String KeyPressed = "aus";
	
	static String KeyPressedShift = "false";
	
	int yh�he = 0;
	
	static String yOn = "false";
	
	int ytiefe = 0;		
	
	static int run = 0;
	
	static int setX = 0;
	
	static int ChaLeftUpdateSchleife = 2;
	
	String sto�rechts = "false";
	
	String sto�links = "false";
	
	private Thread KeySchleife = new Thread() {
        public void run() {
        	while (true) { 
        		
        		AnimationY.AnimationY();
        		
        		if(KeyPressedSpace.equalsIgnoreCase("true")) {
        			if(!(yOn.equalsIgnoreCase("true"))) {
        				if(gui.ySpace <= 0) {
    						Strings.ChaJump = "true";
    						Audio.main();	
    						Strings.ChaJump = "false";
    					}
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
        				
        				if(Strings.KumpSchleife == true) {
        					if(gui.ySpace + Strings.ChaY <= Strings.ChaH�he) {
        						KeyPressedSpace = "false";
        						yOn = "false";
        						gui.ySpace = 0;        						
        						Strings.ChaY = Strings.ChaH�he;
        						Strings.StepGrass = "false";
        						Strings.KumpSchleife = false;        						
        					}
        				}else{
        				
	        				if(gui.ySpace <= 0) {
	        					KeyPressedSpace = "false";
	        					gui.ySpace = 0;
	        					Strings.StepGrass = "false";
	        					yOn = "false";
	        				}
        				}
        			}
        			
        		}
        		        		        		
        		if(!(KeyPressedRight.equalsIgnoreCase("aus"))) {
        				if(Strings.Zusammensto�.equalsIgnoreCase("true")) {
        					SchlumpfSpriteLaufen.Standbild = "aus";
	        				SchlumpfSpriteLaufen.aa = 1;
        					if(!(sto�rechts.equalsIgnoreCase("true"))) {
        						sto�links = "true";
        					}else{        						        						
        						KeyPressedRight();
        						
        					}        					
        					if(!(sto�rechts.equalsIgnoreCase("false"))) {			    			
			    				sto�links = "true";
			    				//gui.schleife = 1;
			    				//gui.KeySchleifeAnAus = 1;
			    				KeyPressed = "aus";	
			    				//KeyPressedRight = "aus";
			    				SchlumpfSpriteLaufen.Standbild = "aus";
			    				SchlumpfSpriteLaufen.aa = 1;				
			    				gui.speed = 0;
			    			}
        				}else{
        					
        					if(!(Strings.StepGrass.equalsIgnoreCase("true"))) {
    							Strings.StepGrass = "true"; 
    							Audio.mainStep();
    						}
        					
        					sto�links = "false";
        					KeyPressedRight();
        				}						        		
		    		
        		}
        		
        		if(KeyPressedLeft.equalsIgnoreCase("true")){           			
        				if(Strings.Zusammensto�.equalsIgnoreCase("true")) {
        					SchlumpfSpriteLaufen.Standbild = "aus";
	        				SchlumpfSpriteLaufen.aa = 1;
        					if(!(sto�links.equalsIgnoreCase("true"))) {
        						sto�rechts = "true";
        					}else{        						        						
        						KeyPressedLeft();
        					}
        					        					
        					if(!(sto�links.equalsIgnoreCase("false"))) {
		        				//ChaLeftUpdateSchleife = 1;
		        				KeyPressed = "aus";	
		        				//KeyPressedLeft = "false";
		        				//SchlumpfSpriteLaufen.LaufenLinks = "false";		        								
		        				gui.speed = 0;
		        			}
        				}else{   
        					
        					if(!(Strings.StepGrass.equalsIgnoreCase("true"))) {
        						Strings.StepGrass = "true"; 
        						Audio.mainStep();
        					}
        					
        					sto�rechts = "false";
        					KeyPressedLeft();	        							    										    		
			    		}	        		
        		}
        		
        		try {
					Thread.sleep(25);
		        } catch (InterruptedException e) {
		        	e.printStackTrace();
		        }	
        		     		        	        		
	        }
        }
	};
	
	public static void KeyPressedRight() {
		if(KeyPressedShift.equalsIgnoreCase("true")) {
    		run = 5;
    	}
		
		gui.speed = 15 + run;			    				    								    							        				        
    	
    	gui.anzahl += gui.speed - 8;
		gui.anzahl2 += gui.speed - 8;
		gui.BodenAnzahl += gui.speed;
		gui.BodenAnzahl2 += gui.speed;
		gui.Brick += gui.speed;
		
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
	
	public static void KeyPressedLeft () {
		if(KeyPressedShift.equalsIgnoreCase("true")) {
    		run = 5;
    	}
		
		gui.speed = -15 - run;

		gui.anzahl += gui.speed + 8;
		gui.anzahl2 += gui.speed + 8;	
		gui.BodenAnzahl += gui.speed;
		gui.BodenAnzahl2 += gui.speed;
		gui.Brick += gui.speed;
		
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
	
	public static void main() {
        new KeySchleife().start();
    }
	
    private void start() {
    	KeySchleife.start();
    }
	
}
