
public class KollisionsUpdater {
	
	public static void BrickReck1() {	
    	if(560 >= gui.ChaHeightFu� - Tutorial_draw.KameraH�he) {  
    		Strings.Climb = false;
    		Strings.ChaAufBlock = true;
    		Strings.BlockH�he = 55;
    		Strings.ChaH�he = 55;
    		H�henMesser();    		
    	}else{    	    		
    		Strings.BlockMitte = 0 - Tutorial_Rectangles.Brick + 700 - 25 + Tutorial_draw.KameraBreite;
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
		if(460 >= gui.ChaHeightFu� - Tutorial_draw.KameraH�he) { 
			Strings.Climb = false;
			Strings.ChaAufBlock = true;
			Strings.ChaH�he = 155;
			Strings.BlockH�he = 155; 
			H�henMesser();				
		}else{
			Strings.BlockMitte = 50 - Tutorial_Rectangles.Brick + 700 - 25 + Tutorial_draw.KameraBreite;
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
		if(410 >= gui.ChaHeight - Tutorial_draw.KameraH�he){		
			if(!(380 >= gui.ChaHeight - Tutorial_draw.KameraH�he)) {
				Strings.ChaH�he = 0;
				Strings.BlockJump = true;
				KeySchleife.yOn = "true";
			}			
		}else{
			Strings.BlockMitte = 100 - Tutorial_Rectangles.Brick + 700 - 25 + Tutorial_draw.KameraBreite;
			Zusammensto�.ZKBrickReck();
			Zusammensto�();			
		}
		if(360 >= gui.ChaHeightFu� - Tutorial_draw.KameraH�he) {
			Strings.Climb = false;
			Strings.ChaAufBlock = true;
			Strings.ChaH�he = 255;
			Strings.BlockH�he = 255; 
			H�henMesser();				
		}else{
			Strings.BlockMitte = 100 - Tutorial_Rectangles.Brick + 700 - 25 + Tutorial_draw.KameraBreite;
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
		if(310 >= gui.ChaHeight - Tutorial_draw.KameraH�he){
			if(!(280 >= gui.ChaHeight - Tutorial_draw.KameraH�he)) {
				Strings.ChaH�he = 0;
				Strings.BlockJump = true;
				KeySchleife.yOn = "true";
			}
		}else{
			Strings.BlockMitte = 150 - Tutorial_Rectangles.Brick + 700 - 25 + Tutorial_draw.KameraBreite;
			Zusammensto�.ZKBrickReck();
			Zusammensto�();
		}
		if(260 >= gui.ChaHeightFu� - Tutorial_draw.KameraH�he) { 
			Strings.Climb = false;
			Strings.ChaAufBlock = true;
			Strings.ChaH�he = 355;
			Strings.BlockH�he = 355; 
			H�henMesser();				
		}else{
			Strings.BlockMitte = 150 - Tutorial_Rectangles.Brick + 700 - 25 + Tutorial_draw.KameraBreite;
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
		if(160 >= gui.ChaHeightFu� - Tutorial_draw.KameraH�he) {
			Strings.Climb = false;
			Strings.ChaAufBlock = true;
			Strings.BlockH�he = 455; 
			Strings.ChaH�he = 455;			
			H�henMesser();				
		}else{
			Strings.ChaAufBlock = false;
			Strings.BlockMitte = 150 - Tutorial_Rectangles.Brick + 1200 - 25 + Tutorial_draw.KameraBreite;
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
		if(560 >= gui.ChaHeightFu� - Tutorial_draw.KameraH�he) {				
			Strings.Climb = false;
			Strings.BodenH�he = 40; 
			Strings.ChaAufBlock = false;
			Strings.ChaH�he = 45;
			Strings.BlockH�he = 45;
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



