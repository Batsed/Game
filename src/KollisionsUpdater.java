
public class KollisionsUpdater {
	
	public static void BrickReck1() {			 
    	if(580 >= 608 - gui.ySpace - Strings.ChaY) { 
    		Strings.BlockH�he = 50;
    		Strings.ChaH�he = 50;
    		H�henMesser();
    	}else{
			if(!(Strings.ySchleife == true)) {
				Strings.Zusammensto� = "true";        			  
			}
		}							
	}
	public static void rect1() {						
		if(470 >= 608 - gui.ySpace - Strings.ChaY) { 
			Strings.ChaH�he = 150;
			Strings.BlockH�he = 150; 
			H�henMesser();				
		}else{
			if(!(Strings.ySchleife == true)) {				
				Strings.Zusammensto� = "true";        			  
			}
		}						
	}			
	
	public static void BrickReck2() {							
		if(370 >= 608 - gui.ySpace - Strings.ChaY) { 
			Strings.ChaH�he = 250;
			Strings.BlockH�he = 250; 
			H�henMesser();				
		}else{
			if(!(Strings.ySchleife == true)) {						
				Strings.Zusammensto� = "true";        			  
			}
		}		
				
	}
	
	public static void BrickReck3() {							
		if(370 >= 608 - gui.ySpace - Strings.ChaY) { 
			Strings.ChaH�he = 350;
			Strings.BlockH�he = 350; 
			H�henMesser();				
		}else{
			if(!(Strings.ySchleife == true)) {						
				Strings.Zusammensto� = "true";        			  
			}
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



