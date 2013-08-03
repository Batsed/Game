
public class ClimbPower {
	
	public static void ClimbPower(){
		if(Tutorial_Rectangles.Boden.intersects(gui.rect2)) {
			if(KeySchleife.KeyPressedControl == false) {
				if(Strings.ClimpPower < 230) {
					Strings.ClimpPower += 0.5;
				}
			}
		}
		if(Strings.ChaAufBlock == true) {
			if(KeySchleife.KeyPressedControl == false) { 
				if(Strings.ClimpPower < 230) {
					if(!(Tutorial_Rectangles.Boden.intersects(gui.rect2))) {
						Strings.ClimpPower += 0.5; 
					}
				}	
			}
		}
	}
}
