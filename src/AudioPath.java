
public class AudioPath {
	
	static String f;
	
	static String ChaJump;
	
	static String StepGrass;
	
	public static void AudioPath() {
	 
		String f2 = (Texturepack.hauptpfad + "Audio/principleIV_menu.mp3");	
		f = f2.substring(6);
		
		String ChaJump2 = (Texturepack.hauptpfad + "Audio/Character Sounds/ChaJump.mp3");
		ChaJump = ChaJump2.substring(6);
		
		String StepGrass2 = (Texturepack.hauptpfad + "Audio/Step/grass.mp3");
		StepGrass = StepGrass2.substring(6);
	}
}
