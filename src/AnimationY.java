
public class AnimationY {
	
	public static void AnimationY() {

		if(Strings.AnimationY == true) {
			if(Strings.ChaY <= Strings.BlockHöhe) {			
				//Strings.ChaY = Strings.BlockHöhe;
				if(KeySchleife.KeyPressedControl == false) {
					Strings.StepGrass = "false";				
					Strings.AnimationY = false;	
					Strings.BlockJump = false;					
					Strings.Climb = false;
				}
			}
			if(Strings.ChaY >= Strings.BlockHöhe) {	
				if(Strings.AnimationY == true) {
					if(Strings.Climb == false) {
						Strings.Climb = false;
						if(KeySchleife.KeyPressedControl == false) {
							KeySchleife.yOn = "false";
							Strings.ChaY =  Strings.ChaY - 4;	
						}else{
							if(Strings.Zusammenstoß.equalsIgnoreCase("false")) {								
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
							if(Strings.Zusammenstoß.equalsIgnoreCase("false")) {								
								Strings.ChaY =  Strings.ChaY - 4;	
							}
						}
					}					
				}			
			}			
		}		
	}
}
