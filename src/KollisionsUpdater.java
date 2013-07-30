
public class KollisionsUpdater {
	
	public static void BrickReck1() {
		if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = false;	
			Strings.ZKBrickReck1 = true;
			Strings.ZKBrickReck2 = false;		
			Strings.ZKBrickReck3 = false;
		}
		Zusammenstoß.ZKBrickReck();
    	if(580 >= 608 - gui.ySpace - Strings.ChaY) { 
    		Strings.BlockHöhe = 50;
    		Strings.ChaHöhe = 50;
    		HöhenMesser();    		
    	}else{
			if(!(Strings.ySchleife == true)) {
				Strings.Zusammenstoß = "true";        			  
			}
		}							
	}
	public static void rect1() {
		if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = true;	
			Strings.ZKBrickReck1 = false;
			Strings.ZKBrickReck2 = false;		
			Strings.ZKBrickReck3 = false;
		}
		Zusammenstoß.ZKBrickReck();
		if(470 >= 608 - gui.ySpace - Strings.ChaY) { 
			Strings.ChaHöhe = 150;
			Strings.BlockHöhe = 150; 
			HöhenMesser();				
		}else{
			if(!(Strings.ySchleife == true)) {				
				Strings.Zusammenstoß = "true";        			  
			}
		}						
	}			
	
	public static void BrickReck2() {
		if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = false;	
			Strings.ZKBrickReck1 = false;
			Strings.ZKBrickReck2 = true;		
			Strings.ZKBrickReck3 = false;
		}
		Zusammenstoß.ZKBrickReck();
		if(360 >= 608 - gui.ySpace - Strings.ChaY) { 
			Strings.ChaHöhe = 250;
			Strings.BlockHöhe = 250; 
			HöhenMesser();				
		}else{
			if(!(Strings.ySchleife == true)) {						
				Strings.Zusammenstoß = "true";        			  
			}
		}		
				
	}
	
	public static void BrickReck3() {	
		if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = false;	
			Strings.ZKBrickReck1 = false;
			Strings.ZKBrickReck2 = false;		
			Strings.ZKBrickReck3 = true;
		}
		Zusammenstoß.ZKBrickReck();
		if(270 >= 608 - gui.ySpace - Strings.ChaY) { 
			Strings.ChaHöhe = 350;
			Strings.BlockHöhe = 350; 
			HöhenMesser();				
		}else{
			if(!(Strings.ySchleife == true)) {						
				Strings.Zusammenstoß = "true";        			  
			}
		}		
	}
	
	public static void HöhenMesser() {		    		        	
		Strings.KumpSchleife = true;
		Strings.Zusammenstoß = "false";        			
		Strings.ySchleife = true;        		        		        		        		     	          		      		            		         	
		Strings.AufBlock = true;
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



