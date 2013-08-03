
public class ClimbPower {
	
	public static void ClimbPower(){
		if(Tutorial_Rectangles.Boden.intersects(gui.rect2)) {
			if(KeySchleife.KeyPressedControl == false) {
				if(Strings.ClimpPower <= 229) {
					Strings.ClimpPower += 1;
				}
			}
		}
		if(Strings.ChaAufBlock == true) {
			if(KeySchleife.KeyPressedControl == false) { 
				if(Strings.ClimpPower <= 229) {
					if(!(Tutorial_Rectangles.Boden.intersects(gui.rect2))) {
						Strings.ClimpPower += 1;
					}
				}	
			}
		}
	}
}
