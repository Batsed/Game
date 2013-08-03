
public class KollisionsUpdater {
	
	public static void BrickReck1() {
    	if(560 >= 608 - gui.ySpace - Strings.ChaY) {  
    		Strings.Climb = false;
    		Strings.ChaAufBlock = true;
    		Strings.BlockHöhe = 50;
    		Strings.ChaHöhe = 50;
    		HöhenMesser();    		
    	}else{
    		Strings.BlockMitte = 0 - Tutorial_Rectangles.Brick + 700 - 25;
    		Zusammenstoß.ZKBrickReck();
    		Zusammenstoß();
		}	 
    	if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = false;	
			Strings.ZKBrickReck1 = true;
			Strings.ZKBrickReck2 = false;		
			Strings.ZKBrickReck3 = false;
			Strings.ZKBoden = false;
			Strings.ZKBrickWand = false;
    	}
		
	}
	public static void rect1() {
		if(460 >= 608 - gui.ySpace - Strings.ChaY) { 
			Strings.Climb = false;
			Strings.ChaAufBlock = true;
			Strings.ChaHöhe = 150;
			Strings.BlockHöhe = 150; 
			HöhenMesser();				
		}else{
			Strings.BlockMitte = 50 - Tutorial_Rectangles.Brick + 700 - 25;
			Zusammenstoß.ZKBrickReck();
			Zusammenstoß();
		}		
		if(KeySchleife.KeyPressedSpace == "false") {			
			Strings.ZKRec1 = true;	
			Strings.ZKBrickReck1 = false;
			Strings.ZKBrickReck2 = false;		
			Strings.ZKBrickReck3 = false;
			Strings.ZKBoden = false;
			Strings.ZKBrickWand = false;
		}
	}			
	
	public static void BrickReck2() {	
		if(410 >= 480 - gui.ySpace - Strings.ChaY){		
			if(!(380 >= 480 - gui.ySpace - Strings.ChaY)) {
				Strings.ChaHöhe = 0;
				Strings.BlockJump = true;
				KeySchleife.yOn = "true";
			}			
		}else{
			Strings.BlockMitte = 100 - Tutorial_Rectangles.Brick + 700 - 25;
			Zusammenstoß.ZKBrickReck();
			Zusammenstoß();			
		}
		if(360 >= 608 - gui.ySpace - Strings.ChaY) {
			Strings.Climb = false;
			Strings.ChaAufBlock = true;
			Strings.ChaHöhe = 250;
			Strings.BlockHöhe = 250; 
			HöhenMesser();				
		}else{
			Strings.BlockMitte = 100 - Tutorial_Rectangles.Brick + 700 - 25;
			Zusammenstoß.ZKBrickReck();
			Zusammenstoß();
		}			
		if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = false;	
			Strings.ZKBrickReck1 = false;
			Strings.ZKBrickReck2 = true;		
			Strings.ZKBrickReck3 = false;
			Strings.ZKBrickWand = false;
			Strings.ZKBoden = false;
		}				
	}
	
	public static void BrickReck3() {	
		if(310 >= 480 - gui.ySpace - Strings.ChaY){
			if(!(280 >= 480 - gui.ySpace - Strings.ChaY)) {
				Strings.ChaHöhe = 0;
				Strings.BlockJump = true;
				KeySchleife.yOn = "true";
			}
		}else{
			Strings.BlockMitte = 150 - Tutorial_Rectangles.Brick + 700 - 25;
			Zusammenstoß.ZKBrickReck();
			Zusammenstoß();
		}
		if(260 >= 608 - gui.ySpace - Strings.ChaY) { 
			Strings.Climb = false;
			Strings.ChaAufBlock = true;
			Strings.ChaHöhe = 350;
			Strings.BlockHöhe = 350; 
			HöhenMesser();				
		}else{
			Strings.BlockMitte = 150 - Tutorial_Rectangles.Brick + 700 - 25;
			Zusammenstoß.ZKBrickReck();
			Zusammenstoß();			
		}			
		if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = false;	
			Strings.ZKBrickReck1 = false;
			Strings.ZKBrickReck2 = false;		
			Strings.ZKBrickReck3 = true;
			Strings.ZKBrickWand = false;
			Strings.ZKBoden = false;
		}		
	}
	
	//Erste Wand
	public static void WallBrick() {	
		if(160 >= 608 - gui.ySpace - Strings.ChaY) {
			Strings.Climb = false;
			Strings.ChaAufBlock = true;
			Strings.BlockHöhe = 450; 
			Strings.ChaHöhe = 450;			
			HöhenMesser();				
		}else{
			Strings.ChaAufBlock = false;
			Strings.BlockMitte = 150 - Tutorial_Rectangles.Brick + 1200 - 25;
			Zusammenstoß.ZKBrickReck();
			Zusammenstoß();
		}
		if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = false;	
			Strings.ZKBrickReck1 = false;
			Strings.ZKBrickReck2 = false;		
			Strings.ZKBrickReck3 = false;
			Strings.ZKBrickWand = true;
			Strings.ZKBoden = false;
    	}
	}
	
	public static void Boden() {		
		if(610 >= 608 - gui.ySpace - Strings.ChaY) {	
			Strings.Climb = false;
			Strings.BodenHöhe = 0; 
			Strings.ChaAufBlock = false;
			Strings.ChaHöhe = 0;
			Strings.BlockHöhe = 0;
			HöhenMesserBoden();				
		}
		Zusammenstoß.ZKBrickReck();
		if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKBoden = true;
			Strings.ZKRec1 = false;	
			Strings.ZKBrickReck1 = false;
			Strings.ZKBrickReck2 = false;		
			Strings.ZKBrickReck3 = false;
			Strings.ZKBrickWand = false;
    	}
	}
	
	public static void HöhenMesser() {		    		        	
		Strings.KumpSchleife = true;
		Strings.Zusammenstoß = "false";        			
		Strings.ySchleife = true;        		        		        		        		     	          		      		            		         	
		Strings.AufBlock = true;
	}
	public static void HöhenMesserBoden() {
		//Strings.Zusammenstoß = "false";        			      		        		        		        		     	          		      		            		         	
		Strings.AufBlock = true;
	}
	
	public static void Zusammenstoß() {
		if(KeySchleife.KeyPressedSpace == "true") {
			Strings.Zusammenstoß = "true";
		}
		if(!(Strings.ySchleife == true)) {						
			Strings.Zusammenstoß = "true";        			  
		}		
	}
	
	public static void NoK() {
	if(!(KeySchleife.KeyPressedSpace.equalsIgnoreCase("true"))) {	
		if(Strings.AufBlock == false) {			
	    	if(Strings.ySchleife == true) {         			        			        		        			        		
	    		Strings.ChaHöhe = 0;
	    		Strings.KumpSchleife = true;	        			        		

	        	Strings.AnimationY = true;
	        	
	        	Strings.KollisionsRechte = false;	        		        	
	        	
	        	Strings.ySchleife = false;
				}
		    	
			}						
			Strings.AufBlock = false;			
			Strings.BlockHöhe = 0;
			Strings.Zusammenstoß = "false";
		}
	}
}



