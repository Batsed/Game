
public class KollisionsUpdater {
	
	public static void BrickReck1() {	
    	if(560 >= gui.ChaHeightFuß - Tutorial_draw.KameraHöhe) {  
    		Strings.Climb = false;
    		Strings.ChaAufBlock = true;
    		Strings.BlockHöhe = 55;
    		Strings.ChaHöhe = 55;
    		HöhenMesser();    		
    	}else{    	    		
    		Strings.BlockMitte = 0 - Tutorial_Rectangles.Brick + 700 - 25 + Tutorial_draw.KameraBreite;
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
		if(460 >= gui.ChaHeightFuß - Tutorial_draw.KameraHöhe) { 
			Strings.Climb = false;
			Strings.ChaAufBlock = true;
			Strings.ChaHöhe = 155;
			Strings.BlockHöhe = 155; 
			HöhenMesser();				
		}else{
			Strings.BlockMitte = 50 - Tutorial_Rectangles.Brick + 700 - 25 + Tutorial_draw.KameraBreite;
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
		if(410 >= gui.ChaHeight - Tutorial_draw.KameraHöhe){		
			if(!(380 >= gui.ChaHeight - Tutorial_draw.KameraHöhe)) {
				Strings.ChaHöhe = 0;
				Strings.BlockJump = true;
				KeySchleife.yOn = "true";
			}			
		}else{
			Strings.BlockMitte = 100 - Tutorial_Rectangles.Brick + 700 - 25 + Tutorial_draw.KameraBreite;
			Zusammenstoß.ZKBrickReck();
			Zusammenstoß();			
		}
		if(360 >= gui.ChaHeightFuß - Tutorial_draw.KameraHöhe) {
			Strings.Climb = false;
			Strings.ChaAufBlock = true;
			Strings.ChaHöhe = 255;
			Strings.BlockHöhe = 255; 
			HöhenMesser();				
		}else{
			Strings.BlockMitte = 100 - Tutorial_Rectangles.Brick + 700 - 25 + Tutorial_draw.KameraBreite;
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
		if(310 >= gui.ChaHeight - Tutorial_draw.KameraHöhe){
			if(!(280 >= gui.ChaHeight - Tutorial_draw.KameraHöhe)) {
				Strings.ChaHöhe = 0;
				Strings.BlockJump = true;
				KeySchleife.yOn = "true";
			}
		}else{
			Strings.BlockMitte = 150 - Tutorial_Rectangles.Brick + 700 - 25 + Tutorial_draw.KameraBreite;
			Zusammenstoß.ZKBrickReck();
			Zusammenstoß();
		}
		if(260 >= gui.ChaHeightFuß - Tutorial_draw.KameraHöhe) { 
			Strings.Climb = false;
			Strings.ChaAufBlock = true;
			Strings.ChaHöhe = 355;
			Strings.BlockHöhe = 355; 
			HöhenMesser();				
		}else{
			Strings.BlockMitte = 150 - Tutorial_Rectangles.Brick + 700 - 25 + Tutorial_draw.KameraBreite;
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
		if(160 >= gui.ChaHeightFuß - Tutorial_draw.KameraHöhe) {
			Strings.Climb = false;
			Strings.ChaAufBlock = true;
			Strings.BlockHöhe = 455; 
			Strings.ChaHöhe = 455;			
			HöhenMesser();				
		}else{
			Strings.ChaAufBlock = false;
			Strings.BlockMitte = 150 - Tutorial_Rectangles.Brick + 1200 - 25 + Tutorial_draw.KameraBreite;
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
		if(560 >= gui.ChaHeightFuß - Tutorial_draw.KameraHöhe) {				
			Strings.Climb = false;
			Strings.BodenHöhe = 40; 
			Strings.ChaAufBlock = false;
			Strings.ChaHöhe = 45;
			Strings.BlockHöhe = 45;
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



