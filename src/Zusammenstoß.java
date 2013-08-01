
public class Zusammenstoß {
	
	
	public static void ZKBrickReck() {
		
		//System.out.println("1: " + Strings.ZKRec1 + " 2: " + Strings.ZKBrickReck1 + " 3: " + Strings.ZKBrickReck2 + " 4: " + Strings.ZKBrickReck3);					
		if(Strings.ZKRec1 == false) {
			if(Tutorial_Rectangles.rect1.intersects(gui.rect2)) {
				if(!(460 >= 608 - gui.ySpace - Strings.ChaY)) { 
					Blocker();
				}								
			}
		}
		if(Strings.ZKBrickReck1 == false) {			
			if(Tutorial_Rectangles.BrickReck1.intersects(gui.rect2)){
				if(!(560 >= 608 - gui.ySpace - Strings.ChaY)) {  
					Blocker();
				}
			}
		}
		if(Strings.ZKBrickReck2 == false) {
			if(Tutorial_Rectangles.BrickReck2.intersects(gui.rect2)) {
				if(!(360 >= 608 - gui.ySpace - Strings.ChaY)) { 
					Blocker();
				}			
		}	}
				
		if(Strings.ZKBrickReck3 == false) {
			if(Tutorial_Rectangles.BrickReck3.intersects(gui.rect2)) {
				if(!(260 >= 608 - gui.ySpace - Strings.ChaY)) { 
					Blocker();
				}
			}
		}				
	}
	public static void Blocker() {				
		if(Strings.ySchleife == false) {
			Strings.Zusammenstoß = "true";
			Strings.ZKBrickReck3 = true;
			Strings.ZKBrickReck2 = true;
			Strings.ZKBrickReck1 = true;
			Strings.ZKRec1 = true;
			if(Strings.ChaAufBlock == false) {
				Strings.BlockHöhe = 0;
			}			
			KeySchleife.stoßlinks = "false";
			KeySchleife.stoßrechts = "false";
		}
		if(Strings.ySchleife == true) {         			        			        		        			        		
    		Strings.ChaHöhe = 0;
    		Strings.KumpSchleife = true;	        			        		
        	
    		if(Strings.ChaAufBlock == false) {
				Strings.BlockHöhe = 0;
			}
        	
        	Strings.KollisionsRechte = false;	        		        	
        	
        	Strings.ySchleife = false;
			}	    								
		Strings.AufBlock = false;					
		Strings.Zusammenstoß = "false";
	}	
}
