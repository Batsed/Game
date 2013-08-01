
public class AnimationY {
	
	public static void AnimationY() {
		
		if(Strings.AnimationY == true) {		
			if(Strings.ChaY <= Strings.BlockHöhe) {			
				Strings.ChaY = Strings.BlockHöhe;
				Strings.StepGrass = "false";
				Strings.AnimationY = false;				
			}
			if(!(Strings.ChaY <= Strings.BlockHöhe)) {
				if(Strings.AnimationY == true) {
					Strings.ChaY =  Strings.ChaY - 4;					
				}			
			}			
		}		
	}
}
