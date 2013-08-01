
public class KollisionsUpdater {
	
	public static void BrickReck1() {		
		Zusammenstoß.ZKBrickReck();
    	if(560 >= 608 - gui.ySpace - Strings.ChaY) { 
    		Strings.BlockHöhe = 50;
    		Strings.ChaHöhe = 50;
    		HöhenMesser();    		
    	}else{
    		Zusammenstoß();
		}	
    	if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = false;	
			Strings.ZKBrickReck1 = true;
			Strings.ZKBrickReck2 = false;		
			Strings.ZKBrickReck3 = false;
    	}
		
	}
	public static void rect1() {		
		Zusammenstoß.ZKBrickReck();
		if(460 >= 608 - gui.ySpace - Strings.ChaY) { 
			Strings.ChaHöhe = 150;
			Strings.BlockHöhe = 150; 
			HöhenMesser();				
		}else{
			Zusammenstoß();
		}
		if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = true;	
			Strings.ZKBrickReck1 = false;
			Strings.ZKBrickReck2 = false;		
			Strings.ZKBrickReck3 = false;
		}
	}			
	
	public static void BrickReck2() {		
		Zusammenstoß.ZKBrickReck();
		if(410 >= 480 - gui.ySpace - Strings.ChaY){		
			if(!(380 >= 480 - gui.ySpace - Strings.ChaY)) {
				Strings.ChaHöhe = 0;
				Strings.BlockJump = true;
				KeySchleife.yOn = "true";
			}			
		}else{
			Zusammenstoß();
		}
		if(360 >= 608 - gui.ySpace - Strings.ChaY) { 
			Strings.ChaHöhe = 250;
			Strings.BlockHöhe = 250; 
			HöhenMesser();				
		}else{
			Zusammenstoß();
		}		
		if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = false;	
			Strings.ZKBrickReck1 = false;
			Strings.ZKBrickReck2 = true;		
			Strings.ZKBrickReck3 = false;
		}				
	}
	
	public static void BrickReck3() {			
		Zusammenstoß.ZKBrickReck();
		if(310 >= 480 - gui.ySpace - Strings.ChaY){
			if(!(280 >= 480 - gui.ySpace - Strings.ChaY)) {
				Strings.ChaHöhe = 0;
				Strings.BlockJump = true;
				KeySchleife.yOn = "true";
			}
		}else{
			Zusammenstoß();
		}
		if(260 >= 608 - gui.ySpace - Strings.ChaY) { 
			Strings.ChaHöhe = 350;
			Strings.BlockHöhe = 350; 
			HöhenMesser();				
		}else{
			Zusammenstoß();
		}
		if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = false;	
			Strings.ZKBrickReck1 = false;
			Strings.ZKBrickReck2 = false;		
			Strings.ZKBrickReck3 = true;
		}		
	}
	
	public static void HöhenMesser() {		    		        	
		Strings.KumpSchleife = true;
		Strings.Zusammenstoß = "false";        			
		Strings.ySchleife = true;        		        		        		        		     	          		      		            		         	
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



