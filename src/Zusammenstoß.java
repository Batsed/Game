
public class Zusammenstoß {
	
	
	public static void ZKBrickReck() {					
		if(Strings.ZKRec1 == false) {
			if(Tutorial_Rectangles.rect1.intersects(gui.rect2)) {
				if(!(460 >= 608 - Tutorial_draw.KameraHöhe)) { 
					Blocker();
				}								
			}
		}
		if(Strings.ZKBrickReck1 == false) {			
			if(Tutorial_Rectangles.BrickReck1.intersects(gui.rect2)){
				if(!(560 >= 608 - Tutorial_draw.KameraHöhe)) {  
					Blocker();
				}
			}
		}
		if(Strings.ZKBrickReck2 == false) {
			if(Tutorial_Rectangles.BrickReck2.intersects(gui.rect2)) {
				if(!(360 >= 608 - Tutorial_draw.KameraHöhe)) { 
					Blocker();
				}			
		}	}
				
		if(Strings.ZKBrickReck3 == false) {
			if(Tutorial_Rectangles.BrickReck3.intersects(gui.rect2)) {
				if(!(260 >= 608 - Tutorial_draw.KameraHöhe)) { 
					Blocker();
				}
			}
		}
		if(Strings.ZKBrickWand == false) {
			if(Tutorial_Rectangles.WallBrick1.intersects(gui.rect2)) {
				if(!(160 >= 608 - Tutorial_draw.KameraHöhe)) { 
					Blocker();
				}
			}				
		}
		if(Strings.ZKBoden == false) {
			if(Tutorial_Rectangles.Boden.intersects(gui.rect2)) {
				if(!(610 >= 608 - Tutorial_draw.KameraHöhe)) { 
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
			Strings.ZKBoden = true;
			Strings.ZKRec1 = true;
			Strings.ZKBrickWand = true;
			if(Strings.ChaAufBlock == false) {
				Strings.BlockHöhe = 0;
			}						
		}else{
			if(Strings.ySchleife == true) {         			        			        		        			        		
	    		//Strings.ChaHöhe = Strings.BodenHöhe;
	    		Strings.KumpSchleife = true;	        			        		
	        	
	    		if(Strings.ChaAufBlock == false) {
					Strings.BlockHöhe = Strings.BodenHöhe;
				}
	        	
	        	Strings.KollisionsRechte = false;	        		        	
	        	
	        	Strings.ySchleife = false;
				}	    								
			Strings.AufBlock = false;				
			Strings.Zusammenstoß = "false";
		}
	}	
}
