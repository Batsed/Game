
public class KollisionsUpdater {
	
	public static void BrickReck1() {		
		Zusammensto�.ZKBrickReck();
    	if(560 >= 608 - gui.ySpace - Strings.ChaY) { 
    		Strings.BlockH�he = 50;
    		Strings.ChaH�he = 50;
    		H�henMesser();    		
    	}else{
    		if(KeySchleife.KeyPressedSpace == "true") {
				Strings.Zusammensto� = "true";
			}
			if(!(Strings.ySchleife == true)) {
				Strings.Zusammensto� = "true";        			  
			}
		}	
    	if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = false;	
			Strings.ZKBrickReck1 = true;
			Strings.ZKBrickReck2 = false;		
			Strings.ZKBrickReck3 = false;
    	}
		
	}
	public static void rect1() {		
		Zusammensto�.ZKBrickReck();
		if(460 >= 608 - gui.ySpace - Strings.ChaY) { 
			Strings.ChaH�he = 150;
			Strings.BlockH�he = 150; 
			H�henMesser();				
		}else{
			if(KeySchleife.KeyPressedSpace == "true") {				
				Strings.Zusammensto� = "true";
			}
			if(!(Strings.ySchleife == true)) {				
				Strings.Zusammensto� = "true";        			  
			}
		}
		if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = true;	
			Strings.ZKBrickReck1 = false;
			Strings.ZKBrickReck2 = false;		
			Strings.ZKBrickReck3 = false;
		}
	}			
	
	public static void BrickReck2() {		
		Zusammensto�.ZKBrickReck();
		if(360 >= 608 - gui.ySpace - Strings.ChaY) { 
			Strings.ChaH�he = 250;
			Strings.BlockH�he = 250; 
			H�henMesser();				
		}else{
			if(KeySchleife.KeyPressedSpace == "true") {
				Strings.Zusammensto� = "true";
			}
			if(!(Strings.ySchleife == true)) {						
				Strings.Zusammensto� = "true";        			  
			}
		}
		if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = false;	
			Strings.ZKBrickReck1 = false;
			Strings.ZKBrickReck2 = true;		
			Strings.ZKBrickReck3 = false;
		}
				
	}
	
	public static void BrickReck3() {			
		Zusammensto�.ZKBrickReck();
		if(260 >= 608 - gui.ySpace - Strings.ChaY) { 
			Strings.ChaH�he = 350;
			Strings.BlockH�he = 350; 
			H�henMesser();				
		}else{
			if(KeySchleife.KeyPressedSpace == "true") {
				Strings.Zusammensto� = "true";
			}
			if(!(Strings.ySchleife == true)) {						
				Strings.Zusammensto� = "true";        			  
			}
		}
		if(KeySchleife.KeyPressedSpace == "false") {
			Strings.ZKRec1 = false;	
			Strings.ZKBrickReck1 = false;
			Strings.ZKBrickReck2 = false;		
			Strings.ZKBrickReck3 = true;
		}		
	}
	
	public static void H�henMesser() {		    		        	
		Strings.KumpSchleife = true;
		Strings.Zusammensto� = "false";        			
		Strings.ySchleife = true;        		        		        		        		     	          		      		            		         	
		Strings.AufBlock = true;
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



