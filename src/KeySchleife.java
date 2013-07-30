
public class KeySchleife {

	static String KeyPressedRight = "aus";
	
	static String KeyPressedSpace = "false";
	
	static String KeyPressedLeft = "false";
	
	static String ChaLeftUpdate = "false";
	
	static String KeyPressed = "aus";
	
	static String KeyPressedShift = "false";
	
	int yhöhe = 0;
	
	static String yOn = "false";
	
	int ytiefe = 0;		
	
	static int run = 0;
	
	static int setX = 0;
	
	static int ChaLeftUpdateSchleife = 2;
	
	static String stoßrechts = "false";
	
	static String stoßlinks = "false";
	
    public static void BildAnimation() {
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
        				gui.ySpace += 5;            				
        			}
				}else{
					if(gui.ySpace <= 100) {
        				gui.ySpace += 5;            				
        			}
    				if(gui.ySpace >= 100) {
    					if(!(gui.ySpace >= 170)) {        						        					
    					gui.ySpace += 4; 
    					}
    				}
    				if(gui.ySpace >= 170) {
    					gui.ySpace += 3;
    				}
				}        				
			}
			if(gui.ySpace >= 180) {
				yOn = "true";        				
			}
			if(yOn.equalsIgnoreCase("true")) {
				
				gui.ySpace += -5;
				
				if(Strings.KumpSchleife == true) {
					if(gui.ySpace + Strings.ChaY <= Strings.ChaHöhe) {
						KeyPressedSpace = "false";
						yOn = "false";
						gui.ySpace = 0;        						
						Strings.ChaY = Strings.ChaHöhe;
						Strings.StepGrass = "false";
						Strings.KumpSchleife = false;   
						Strings.EinerSprung = false;
					}
				}else{
				
    				if(gui.ySpace <= 0) {
    					KeyPressedSpace = "false";
    					gui.ySpace = 0;
    					Strings.StepGrass = "false";
    					yOn = "false";
    					Strings.EinerSprung = false;
    				}
				}
			}
			
		}
		
		if(!(KeyPressedRight.equalsIgnoreCase("aus"))) {
			if(!(KeyPressedLeft.equalsIgnoreCase("true"))) { 
				if(Strings.Zusammenstoß.equalsIgnoreCase("true")) {
					SchlumpfSpriteLaufen.Standbild = "aus";
    				SchlumpfSpriteLaufen.aa = 1;
					if(!(stoßrechts.equalsIgnoreCase("true"))) {							
						stoßlinks = "true";		
 						if(Strings.EinerSprung == false) {							
							if(KeySchleife.KeyPressedSpace == "true") {
								stoßlinks = "true";
								Strings.EinerSprung = true;	
							}																								
						}
					}else{        						        						
						KeyPressedRight();						
					}        					
					if(!(stoßrechts.equalsIgnoreCase("false"))) {			    			
	    				stoßlinks = "true";
	    				//gui.schleife = 1;
	    				//gui.KeySchleifeAnAus = 1;
	    				KeyPressed = "aus";	
	    				//KeyPressedRight = "aus";
	    				SchlumpfSpriteLaufen.Standbild = "aus";
	    				SchlumpfSpriteLaufen.aa = 1;				
	    				gui.speed = 0;
	    			}				
				}else{
					stoßlinks = "false";
					
					if(!(Strings.StepGrass.equalsIgnoreCase("true"))) {
						Strings.StepGrass = "true"; 
						Audio.mainStep();
					}															
					KeyPressedRight();
				}						        		
			}else{
				SchlumpfSpriteLaufen.Standbild = "aus";
				SchlumpfSpriteLaufen.aa = 1;
			}
		}
		
		if(KeyPressedLeft.equalsIgnoreCase("true")){ 
			if(!(KeyPressedRight.equalsIgnoreCase("an"))) {
				if(Strings.Zusammenstoß.equalsIgnoreCase("true")) {					
					SchlumpfSpriteLaufen.Standbild = "aus";
    				SchlumpfSpriteLaufen.aa = 1;
					if(!(stoßlinks.equalsIgnoreCase("true"))) {
						stoßrechts = "true";	
						if(Strings.EinerSprung == false) {							
							if(KeySchleife.KeyPressedSpace == "true") {
								stoßrechts = "true";
								Strings.EinerSprung = true;	
							}																								
						}
						
					}else{        						        						
						KeyPressedLeft();
					}
					        					
					if(!(stoßlinks.equalsIgnoreCase("false"))) {
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
					stoßrechts = "false";					
					
					KeyPressedLeft();	        							    										    		
				}	
			}else{
				SchlumpfSpriteLaufen.Standbild = "aus";
				SchlumpfSpriteLaufen.aa = 1;
			}
		}
    }
        		     		        	        		
	               
	
	public static void KeyPressedRight() {
		if(KeyPressedShift.equalsIgnoreCase("true")) {
    		run = 1;
    	}
		
		gui.speed = 6 + run;			    				    								    							        				        
    	
    	gui.anzahl += gui.speed - 5;
		gui.anzahl2 += gui.speed - 5;
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
    		run = 1;
    	}
		
		gui.speed = -6 - run;

		gui.anzahl += gui.speed + 5;
		gui.anzahl2 += gui.speed + 5;	
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
	
}
