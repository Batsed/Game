
public class KollisionsUpdater {
	
	public static void BrickReck1() {
    	if(560 >= 608 - gui.ySpace - Strings.ChaY) {  
    		Strings.Climb = false;
    		Strings.ChaAufBlock = true;
    		Strings.BlockH�he = 50;
    		Strings.ChaH�he = 50;
    		H�henMesser();    		
    	}else{
    		Strings.BlockMitte = 0 - Tutorial_Rectangles.Brick + 700 - 25;
    		Zusammensto�.ZKBrickReck();
    		Zusammensto�();
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
			Strings.ChaH�he = 150;
			Strings.BlockH�he = 150; 
			H�henMesser();				
		}else{
			Strings.BlockMitte = 50 - Tutorial_Rectangles.Brick + 700 - 25;
			Zusammensto�.ZKBrickReck();
			Zusammensto�();
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
				Strings.ChaH�he = 0;
				Strings.BlockJump = true;
				KeySchleife.yOn = "true";
			}			
		}else{
			Strings.BlockMitte = 100 - Tutorial_Rectangles.Brick + 700 - 25;
			Zusammensto�.ZKBrickReck();
			Zusammensto�();			
		}
		if(360 >= 608 - gui.ySpace - Strings.ChaY) {
			Strings.Climb = false;
			Strings.ChaAufBlock = true;
			Strings.ChaH�he = 250;
			Strings.BlockH�he = 250; 
			H�henMesser();				
		}else{
			Strings.BlockMitte = 100 - Tutorial_Rectangles.Brick + 700 - 25;
			Zusammensto�.ZKBrickReck();
			Zusammensto�();
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
				Strings.ChaH�he = 0;
				Strings.BlockJump = true;
				KeySchleife.yOn = "true";
			}
		}else{
			Strings.BlockMitte = 150 - Tutorial_Rectangles.Brick + 700 - 25;
			Zusammensto�.ZKBrickReck();
			Zusammensto�();
		}
		if(260 >= 608 - gui.ySpace - Strings.ChaY) { 
			Strings.Climb = false;
			Strings.ChaAufBlock = true;
			Strings.ChaH�he = 350;
			Strings.BlockH�he = 350; 
			H�henMesser();				
		}else{
			Strings.BlockMitte = 150 - Tutorial_Rectangles.Brick + 700 - 25;
			Zusammensto�.ZKBrickReck();
			Zusammensto�();			
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
			Strings.BlockH�he = 450; 
			Strings.ChaH�he = 450;			
			H�henMesser();				
		}else{
			Strings.ChaAufBlock = false;
			Strings.BlockMitte = 150 - Tutorial_Rectangles.Brick + 1200 - 25;
			Zusammensto�.ZKBrickReck();
			Zusammensto�();
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
			Strings.BodenH�he = 0; 
			Strings.ChaAufBlock = false;
			Strings.ChaH�he = 0;
			Strings.BlockH�he = 0;
			H�henMesserBoden();				
		}
		Zusammensto�.ZKBrickReck();
		if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKBoden = true;
			Strings.ZKRec1 = false;	
			Strings.ZKBrickReck1 = false;
			Strings.ZKBrickReck2 = false;		
			Strings.ZKBrickReck3 = false;
			Strings.ZKBrickWand = false;
    	}
	}
	
	public static void H�henMesser() {		    		        	
		Strings.KumpSchleife = true;
		Strings.Zusammensto� = "false";        			
		Strings.ySchleife = true;        		        		        		        		     	          		      		            		         	
		Strings.AufBlock = true;
	}
	public static void H�henMesserBoden() {
		//Strings.Zusammensto� = "false";        			      		        		        		        		     	          		      		            		         	
		Strings.AufBlock = true;
	}
	
	public static void Zusammensto�() {
		if(KeySchleife.KeyPressedSpace == "true") {
			Strings.Zusammensto� = "true";
		}
		if(!(Strings.ySchleife == true)) {						
			Strings.Zusammensto� = "true";        			  
		}		
	}
	
	public static void NoK() {
	if(!(KeySchleife.KeyPressedSpace.equalsIgnoreCase("true"))) {	
		if(Strings.AufBlock == false) {			
	    	if(Strings.ySchleife == true) {         			        			        		        			        		
	    		Strings.ChaH�he = 0;
	    		Strings.KumpSchleife = true;	        			        		

	        	Strings.AnimationY = true;
	        	
	        	Strings.KollisionsRechte = false;	        		        	
	        	
	        	Strings.ySchleife = false;
				}
		    	
			}						
			Strings.AufBlock = false;			
			Strings.BlockH�he = 0;
			Strings.Zusammensto� = "false";
		}
	}
}



