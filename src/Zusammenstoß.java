
public class Zusammensto� {
	
	
	public static void ZKBrickReck() {
		
		//System.out.println("1: " + Strings.ZKRec1 + " 2: " + Strings.ZKBrickReck1 + " 3: " + Strings.ZKBrickReck2 + " 4: " + Strings.ZKBrickReck3);
		
		
		if(Strings.ZKRec1 == false) {
			if(gui.rect1.intersects(gui.rect2)) {
				if(!(460 >= 608 - gui.ySpace - Strings.ChaY)) { 
					Strings.Zusammensto� = "true";
					Strings.ZKRec1 = true;
					Strings.BlockH�he = 0; 
					Strings.AnimationY = true;
					KeySchleife.sto�links = "false";
					KeySchleife.sto�rechts = "false";
				}
			}
		}
		if(Strings.ZKBrickReck1 == false) {			
			if(gui.BrickReck1.intersects(gui.rect2)){
				if(!(560 >= 608 - gui.ySpace - Strings.ChaY)) {  
				Strings.Zusammensto� = "true";
				Strings.ZKBrickReck1 = true;
				Strings.BlockH�he = 0;
				Strings.AnimationY = true;
				KeySchleife.sto�links = "false";
				KeySchleife.sto�rechts = "false";
				}
			}
		}
		if(Strings.ZKBrickReck2 == false) {
			if(gui.BrickReck2.intersects(gui.rect2)) {
				if(!(360 >= 608 - gui.ySpace - Strings.ChaY)) { 
					Strings.Zusammensto� = "true";
					Strings.ZKBrickReck2 = true;
					Strings.BlockH�he = 0;
					Strings.AnimationY = true;
					KeySchleife.sto�links = "false";
					KeySchleife.sto�rechts = "false";
				}
			}
		}		
		if(Strings.ZKBrickReck3 == false) {
			if(gui.BrickReck3.intersects(gui.rect2)) {
				if(!(260 >= 608 - gui.ySpace - Strings.ChaY)) { 
					Strings.Zusammensto� = "true";
					Strings.ZKBrickReck3 = true;
					Strings.BlockH�he = 0;
					Strings.AnimationY = true;
					KeySchleife.sto�links = "false";
					KeySchleife.sto�rechts = "false";
				}
			}
		}
	}			
}
