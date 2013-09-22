


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
	
	int BHöhe = Strings.BodenHöhe;
	
	private Thread BildAnimation = new Thread() {  
		public void run() {
			while (true) { 			
				Strings.KeycurrentFrame = System.currentTimeMillis();
				
				ChaDown();
				
				//Abragung ob LShit gedrückt wird
				if(Strings.SprintPower <= 0) {											
					KeySchleife.KeyPressedShift = "false";
				}
				
				if(Strings.KeycurrentFrame > Strings.KeyfirstFrame + 7){				
					Strings.KeyfirstFrame = Strings.KeycurrentFrame;					
					AnimationY.AnimationY();															
					
					//Climb Power
					ClimbPower.ClimbPower();
					//System.out.println("rechts: " + stoßrechts + " links: " + stoßlinks);
					
					if(KeyPressedControl == true) {
						if(Strings.Zusammenstoß.equalsIgnoreCase("true")) {
							if(Strings.BlockJump == false) {
								Strings.Climb = true; 
								Strings.ChaY += 2;
								Strings.ClimpPower -= 1;														
							}
						}
						if(Strings.Zusammenstoß.equalsIgnoreCase("false")) {
							if(Strings.ySchleife == false) {
								if(Strings.ChaAufBlock == false) {								
									if(Strings.Climb == true) {										
										Strings.AnimationY = true;										
										if(KeySchleife.KeyPressedSpace.equalsIgnoreCase("false")) {											
											//KeyPressedSpace = "false";										
										}									
									}
								}						
							}						
						}						
					}else{
						if(Strings.ySchleife == false) {							
							//if(Strings.ChaAufBlock == false) {								
								if(Strings.Climb == true) {									
									Strings.AnimationY = true;
									Strings.Climb = false;									
								}
							//}						
						}
					
					}					
					
					if(KeyPressedSpace.equalsIgnoreCase("true")) {						
						if(Strings.Climb == false) {							
							if(!(yOn.equalsIgnoreCase("true"))) {
								if(gui.ySpace <= 0) {
									Strings.ChaJump = "true";
									Audio.main();	
								}								
								if(Strings.BlockJump == false) {
									if(KeyPressed.equalsIgnoreCase("aus")) {
										
										if(gui.ySpace <= 180 + BHöhe) {
					        				gui.ySpace += 5;            				
					        			}
									}else{
										if(gui.ySpace <= 100 + BHöhe) {
					        				gui.ySpace += 5;            				
					        			}
					    				if(gui.ySpace >= 100 + BHöhe) {
					    					if(!(gui.ySpace >= 170 + BHöhe)) {        						        					
					    					gui.ySpace += 4; 
					    					}
					    				}
					    				if(gui.ySpace >= 170 + BHöhe) {
					    					gui.ySpace += 3;
					    				}
									}  
								}
							}													
							
							if(gui.ySpace >= 180 + BHöhe) {
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
				    					gui.ySpace = BHöhe;
				    					Strings.StepGrass = "false";
				    					yOn = "false";
				    					Strings.EinerSprung = false;
				    					Strings.BlockJump = false;
				    				}
								}
							}
							
						}else{
							Strings.ChaY = gui.ySpace +  Strings.ChaY;
							KeyPressedSpace = "false";    					
	    					Strings.StepGrass = "false";
	    					gui.ySpace = BHöhe;
	    					yOn = "false";    					
						}
					}
					
					if(!(KeyPressedRight.equalsIgnoreCase("aus"))) {						
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
								
								if(Strings.StepGrass.equalsIgnoreCase("false")) {
									Strings.StepGrass = "true"; 
									//Audio.mainStep();
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
									//Audio.mainStep();
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
					Thread.sleep(1);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
		        		     		        	        		
			               
			
	public static void KeyPressedRight() {
		if(KeyPressedShift.equalsIgnoreCase("true")) {
			Strings.SprintPower -= 0.5;
    		run = 1;
    	}
				
		gui.speed = 6 + run;			    				    								    							        				        
    	
		LoadTutorial.anzahl += gui.speed - 5;
		LoadTutorial.anzahl2 -= gui.speed - 5;
		LoadTutorial.BodenAnzahl += gui.speed;
		LoadTutorial.BodenAnzahl2 -= gui.speed;
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
			Strings.SprintPower -= 0.5;
    		run = 1;
    	}
		
		gui.speed =  -6 - run;

		LoadTutorial.anzahl += gui.speed + 5;
		LoadTutorial.anzahl2 -= gui.speed + 5;	
		LoadTutorial.BodenAnzahl += gui.speed;
		LoadTutorial.BodenAnzahl2 -= gui.speed;
		Tutorial_Rectangles.Brick += gui.speed;
		
		
		
		//Gamebackground		
		if(LoadTutorial.anzahl <= 0) {
			LoadTutorial.anzahl = LoadTutorial.BildbreiteMal2;				
		}				
		
		if(LoadTutorial.anzahl <= LoadTutorial.BildbreiteMal1) {
			if(LoadTutorial.anzahl2 >= 0)
			LoadTutorial.anzahl2 = -LoadTutorial.BildbreiteMal1;				
		}		  				
		//Boden
		if(LoadTutorial.BodenAnzahl <= 0) {
			LoadTutorial.BodenAnzahl = LoadTutorial.BodenBreiteMal2;	
			Strings.Stand -= 1;
		}	
		if(LoadTutorial.BodenAnzahl <= LoadTutorial.BodenBreiteMal1) {			
			if(LoadTutorial.BodenAnzahl2 >= 0)			
			LoadTutorial.BodenAnzahl2 = -LoadTutorial.BodenBreiteMal1;	
		}
		
		SchlumpfSpriteLaufen.Standbild = "an";
		SchlumpfSpriteLaufen.LaufenLinks = "true";
	}
	
	public static void main() {
		 new KeySchleife().start();
	}
	
	public static void ChaDown() {
		if(gui.ySpace == 0) {					
			if(Strings.ChaY == 0) {				
				if(Tutorial_draw.KameraHöhe + 480 >= gui.ChaHeight) {					
					if(Strings.Climb == false){		
						if(Strings.Zusammenstoß.equalsIgnoreCase("false")) {				
							if(KeySchleife.KeyPressedControl == false) {															
									
									gui.Physix -= 1;																								
							}
						}
					}	
				}
			}			
		}
	}
		     
	 private void start() {
		 //BildAnimation.setPriority(10);
		 BildAnimation.start();
	 }
}
