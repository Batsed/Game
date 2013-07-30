
public class Zusammenstoﬂ {
	
	
	public static void ZKBrickReck() {
		
		System.out.println("1: " + Strings.ZKRec1 + " 2: " + Strings.ZKBrickReck1 + " 3: " + Strings.ZKBrickReck2 + " 4: " + Strings.ZKBrickReck3);
		
		if(Strings.ZKRec1 == false) {
			if(gui.rect1.intersects(gui.rect2)) {
				Strings.Zusammenstoﬂ = "true";
				Strings.ZKRec1 = true;
			}
		}
		if(Strings.ZKBrickReck1 == false) {			
			if(gui.BrickReck1.intersects(gui.rect2)){
				Strings.Zusammenstoﬂ = "true";
				Strings.ZKBrickReck1 = true;
			}
		}
		if(Strings.ZKBrickReck2 == false) {
			if(gui.BrickReck2.intersects(gui.rect2)) {
				Strings.Zusammenstoﬂ = "true";
				Strings.ZKBrickReck2 = true;
			}
		}		
		if(Strings.ZKBrickReck3 == false) {
			if(gui.BrickReck3.intersects(gui.rect2)) {
				Strings.Zusammenstoﬂ = "true";
				Strings.ZKBrickReck3 = true;
			}
		}
	}			
}
