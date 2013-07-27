
public class AnimationY {
	
	public static void AnimationY() {
		
		//if(Strings.Zusammenstoß.equalsIgnoreCase("false")) {
		//	if(608 - gui.ySpace - Strings.ChaY == 508) {
			//	Strings.AnimationY = true;
			//	Strings.berührung = false;
				
			//}
	//	}
		
	if(Strings.AnimationY == true) {		
				if(Strings.ChaY <= Strings.BlockHöhe) {			
					Strings.ChaY = Strings.BlockHöhe;
					Strings.StepGrass = "false";
					Strings.AnimationY = false;				
				}
				if(!(Strings.ChaY <= Strings.BlockHöhe)) {
					if(Strings.AnimationY == true) {
						Strings.ChaY =  Strings.ChaY - 15;					
					}
				
			}			
		}		
	}
}
