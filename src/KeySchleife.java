


public class KeySchleife {

	static String KeyPressedRight = "aus";
	
	static String KeyPressedSpace = "false";
	
	static String KeyPressedLeft = "false";
	
	static String ChaLeftUpdate = "false";
	
	static String KeyPressed = "aus";
	
	static String KeyPressedShift = "false";
	
	static boolean KeyPressedControl = false;
	
	int yhˆhe = 0;
	
	static String yOn = "false";
	
	int ytiefe = 0;		
	
	static int run = 0;
	
	static int setX = 0;
	
	static int ChaLeftUpdateSchleife = 2;
	
	static String stoﬂrechts2 = "false";
	
	static String stoﬂlinks2 = "false";
	
	private Thread BildAnimation = new Thread() {  
		public void run() {
			while (true) { 
				//System.out.println(Strings.KollisionsUpdate);
				if(Strings.KollisionsUpdate == true) {
					//Anzeige f¸r Fps
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
					
					//Kollisionsabfrage
					if(Strings.KollisionsUpdate == true) { 
						Strings.KollisionsUpdate = false;
						Tutorial_draw.BlockUpdater();						
					}
					
					//Climb Power
					ClimbPower.ClimbPower();
					//System.out.println("rechts: " + stoﬂrechts + " links: " + stoﬂlinks);
					
					if(KeyPressedControl == true) {
						if(Strings.Zusammenstoﬂ.equalsIgnoreCase("true")) {
							if(Strings.BlockJump == false) {
								Strings.Climb = true; 
								Strings.ChaY += 2;
								Strings.ClimpPower -= 1;														
							}
						}
						if(Strings.Zusammenstoﬂ.equalsIgnoreCase("false")) {
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
									if(gui.ySpace + Strings.ChaY <= Strings.ChaHˆhe) {								
										KeyPressedSpace = "false";
										yOn = "false";
										Strings.ChaY = Strings.ChaHˆhe;									
										gui.ySpace = 0;        															
										Strings.StepGrass = "false";
										Strings.KumpSchleife = false;   
										Strings.EinerSprung = false;
										Strings.BlockJump = false;
									}
								}else{
								
				    				if(gui.ySpace <= Strings.BodenHˆhe) {
				    					KeyPressedSpace = "false";
				    					gui.ySpace = Strings.BodenHˆhe;
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
	    					gui.ySpace = 0;
	    					yOn = "false";    					
						}
					}
					
					if(!(KeyPressedRight.equalsIgnoreCase("aus"))) {						
						if(!(KeyPressedLeft.equalsIgnoreCase("true"))) { 
							if(Strings.Zusammenstoﬂ.equalsIgnoreCase("true")) {
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
							if(Strings.Zusammenstoﬂ.equalsIgnoreCase("true")) {					
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
					try {
						Thread.sleep(9);
					}catch (InterruptedException e) {
						e.printStackTrace();
					} 					
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
