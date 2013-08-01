


public class KeySchleife {

	static String KeyPressedRight = "aus";
	
	static String KeyPressedSpace = "false";
	
	static String KeyPressedLeft = "false";
	
	static String ChaLeftUpdate = "false";
	
	static String KeyPressed = "aus";
	
	static String KeyPressedShift = "false";
	
	static boolean KeyPressedControl = false;
	
	int yhöhe = 0;
	
	static String yOn = "false";
	
	int ytiefe = 0;		
	
	static int run = 0;
	
	static int setX = 0;
	
	static int ChaLeftUpdateSchleife = 2;
	
	static String stoßrechts2 = "false";
	
	static String stoßlinks2 = "false";
	
	private Thread BildAnimation = new Thread() {  
		public void run() {
			while (true) { 				
				//Anzeige für Fps
				if(gui.fpsvisible.equalsIgnoreCase("true")){	
					Strings.Keyframes++;
					Strings.KeycurrentFrame = System.currentTimeMillis();
					if(Strings.KeycurrentFrame > Strings.KeyfirstFrame + 1000){				
						Strings.KeyfirstFrame = Strings.KeycurrentFrame;
						Strings.Keyfps = Strings.Keyframes;
						Strings.Keyframes = 0;
					}			
				}
				
				AnimationY.AnimationY();
				//System.out.println("rechts: " + stoßrechts + " links: " + stoßlinks);
				
				if(KeyPressedControl == true) {
					if(Strings.Zusammenstoß.equalsIgnoreCase("true")) {
						Strings.ClimbY += 2;
					}
				}else{
					if(!(Strings.ClimbY <= 0)){
						Strings.ClimbY -= 5;
					}
				}							
				
				if(KeyPressedSpace.equalsIgnoreCase("true")) {
					if(Strings.ClimbY >= Strings.ClimbHöhe) {
						if(!(yOn.equalsIgnoreCase("true"))) {
							if(gui.ySpace <= Strings.BodenHöhe) {
								Strings.ChaJump = "true";
								Audio.main();	
							}
							if(Strings.BlockJump == false) {
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
									Strings.ChaY = Strings.ChaHöhe;
									gui.ySpace = 0;        															
									Strings.StepGrass = "false";
									Strings.KumpSchleife = false;   
									Strings.EinerSprung = false;
									Strings.BlockJump = false;
								}
							}else{
							
			    				if(gui.ySpace <= Strings.BodenHöhe) {
			    					KeyPressedSpace = "false";
			    					gui.ySpace = Strings.BodenHöhe;
			    					Strings.StepGrass = "false";
			    					yOn = "false";
			    					Strings.EinerSprung = false;
			    					Strings.BlockJump = false;
			    				}
							}
						}
						
					}
				}
				
				if(!(KeyPressedRight.equalsIgnoreCase("aus"))) {
					if(Strings.ClimbHöhe <= 608 - gui.ySpace - Strings.ChaY - Strings.ClimbY) {
						if(!(KeyPressedLeft.equalsIgnoreCase("true"))) { 
							if(Strings.Zusammenstoß.equalsIgnoreCase("true")) {
								SchlumpfSpriteLaufen.Standbild = "aus";
			    				SchlumpfSpriteLaufen.aa = 1;

			    				if(Strings.BlockMitte - 50 >= 550 + 20) {
			    					KeyPressedRight();
			    				}else{
			    					if(Strings.BlockMitte - 50 <= 500 + 20) {
			    						if(!(Strings.BlockMitte - 50 >= 520 + 20)){
			    							KeyPressedRight();
			    						}
			    					}
			    				}			
							}else{
								
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
				}
				
				if(KeyPressedLeft.equalsIgnoreCase("true")){ 
					if(Strings.ClimbHöhe <= 608 - gui.ySpace - Strings.ChaY - Strings.ClimbY) {
						if(!(KeyPressedRight.equalsIgnoreCase("an"))) {
							if(Strings.Zusammenstoß.equalsIgnoreCase("true")) {					
								SchlumpfSpriteLaufen.Standbild = "aus";
			    				SchlumpfSpriteLaufen.aa = 1;
			    				
			    				if(Strings.BlockMitte + 25 <= 550) {
			    					KeyPressedLeft();
			    				}else{
			    					if(Strings.BlockMitte + 25 >= 550) {
			    						if(!(Strings.BlockMitte + 25 <= 610)) {
			    							KeyPressedLeft();
			    						}
			    					}
			    				}
							}else{   
								
								if(!(Strings.StepGrass.equalsIgnoreCase("true"))) {
									Strings.StepGrass = "true"; 
									Audio.mainStep();
								}					
								
								KeyPressedLeft();	        							    										    		
							}	
						}else{
							SchlumpfSpriteLaufen.Standbild = "aus";
							SchlumpfSpriteLaufen.aa = 1;
						}
					}
				}
				try {
					Thread.sleep(9);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}          			
			}			
		}
	};
		        		     		        	        		
			               
			
	public static void KeyPressedRight() {
		if(KeyPressedShift.equalsIgnoreCase("true")) {
    		run = 1;
    	}
		
		gui.speed = 6 + run;			    				    								    							        				        
    	
		LoadTutorial.anzahl += gui.speed - 5;
		LoadTutorial.anzahl2 += gui.speed - 5;
		LoadTutorial.BodenAnzahl += gui.speed;
		LoadTutorial.BodenAnzahl2 += gui.speed;
		Tutorial_Rectangles.Brick += gui.speed;
		
		if(LoadTutorial.anzahl >= LoadTutorial.BildbreiteMal3) {
			LoadTutorial.anzahl = 0;
			LoadTutorial.anzahl2 = 0;
		}	
		if(LoadTutorial.BodenAnzahl >= LoadTutorial.BodenBreiteMal3) {
			LoadTutorial.BodenAnzahl = 0;
			LoadTutorial.BodenAnzahl2 = 0;
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

		LoadTutorial.anzahl += gui.speed + 5;
		LoadTutorial.anzahl2 += gui.speed + 5;	
		LoadTutorial.BodenAnzahl += gui.speed;
		LoadTutorial.BodenAnzahl2 += gui.speed;
		Tutorial_Rectangles.Brick += gui.speed;
		
		//Gamebackground
		if(LoadTutorial.anzahl <= 0) {
			LoadTutorial.anzahl = LoadTutorial.BildbreiteMal2;					
		}				
		
		if(LoadTutorial.anzahl2 <= LoadTutorial.BildbreiteMal1 - (LoadTutorial.BildbreiteMal1 * 2)) {
			LoadTutorial.anzahl2 = LoadTutorial.BildbreiteMal1;						
		}
		    				
		//Boden
		if(LoadTutorial.BodenAnzahl <= 0) {
			LoadTutorial.BodenAnzahl = LoadTutorial.BodenBreiteMal1;
		}
		if(LoadTutorial.BodenAnzahl == LoadTutorial.BodenBreiteMal1) {
			LoadTutorial.BodenAnzahl2 = LoadTutorial.BodenBreiteMal1;
		}
		SchlumpfSpriteLaufen.Standbild = "an";
		SchlumpfSpriteLaufen.LaufenLinks = "true";
	}
	
	public static void main() {
		 new KeySchleife().start();
	 }
		     
	 private void start() {
		 BildAnimation.setPriority(10);
		 BildAnimation.start();
	 }
}
