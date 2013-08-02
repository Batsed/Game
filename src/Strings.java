

public class Strings {

	static String ChaJump;
	
	static String MenüMusik;
	
	static String Zusammenstoß = "false";
	
	static int key;
	
	static int ChaHöhe;
	
	static boolean ySchleife;
	
	static boolean AnimationY = false;
	
	static boolean KumpSchleife = false;
	
	static boolean KollisionsRechte = false;
	
	static boolean berührung = false;
	
	static boolean AufBlock = false;
	
	static String StepGrass = "false";
	
	static int ChaY;
	
	//Climb
	static boolean Climb = false;
	
	static int ClimpPower = 230;
	
	
	static int BlockHöhe = 0; 
	
	static boolean EinerSprung = false;
	
	static boolean Global = false;
	
	//Brickrects
	static boolean ZKBrickReck1 = false;
	
	static boolean ZKBrickReck2 = false;
	
	static boolean ZKBrickReck3 = false;
	
	static boolean ZKRec1 = false;
	
	static boolean ZKBrickWand = false;
	
	//Bodenkolliesion
	static boolean ZKBoden = false;
	
	//Mitte des Zusammenstößigen Blocks oder sonstieges
	static int BlockMitte = 0;
	
	//Bodenhöhe
	static int BodenHöhe = 0;
			
	//Unterbrechung des Springens
	static boolean BlockJump = false;
	
	//Fps berechnung für Keyschleife
	static long KeyfirstFrame;
	static int Keyframes;
	static long KeycurrentFrame;
	static int Keyfps;
	
	//Fps berechnung für Keyschleife
	static long ChafirstFrame;
	static int Chaframes;
	static long ChacurrentFrame;
	static int Chafps;
	
	//Abfrage ob man auf einem Block steht
	static boolean ChaAufBlock = false;
			

	public static void Strings() {
		ChaJump = "false";
		
		MenüMusik = "true";
	}		
}
