
public class AnimationY {
	
	public static void AnimationY() {

		if(Strings.AnimationY == true) {
			if(Strings.ChaY <= Strings.BlockH�he) {			
				//Strings.ChaY = Strings.BlockH�he;
				if(KeySchleife.KeyPressedControl == false) {
					Strings.StepGrass = "false";				
					Strings.AnimationY = false;	
					Strings.BlockJump = false;					
					Strings.Climb = false;
				}
			}
			if(Strings.ChaY >= Strings.BlockH�he) {	
				if(Strings.AnimationY == true) {
					if(Strings.Climb == false) {
						Strings.Climb = false;
						if(KeySchleife.KeyPressedControl == false) {
							KeySchleife.yOn = "false";
							Strings.ChaY =  Strings.ChaY - 4;	
						}else{
							if(Strings.Zusammensto�.equalsIgnoreCase("false")) {								
								Strings.ChaY =  Strings.ChaY - 4;	
							}
						}
					}
					if(Strings.Climb == true) {
						Strings.Climb = false;
						if(KeySchleife.KeyPressedControl == false) {
							KeySchleife.yOn = "false";
							Strings.ChaY =  Strings.ChaY - 4;	
						}else{
							if(Strings.Zusammensto�.equalsIgnoreCase("false")) {								
								Strings.ChaY =  Strings.ChaY - 4;	
							}
						}
					}					
				}			
			}			
		}		
	}
}
