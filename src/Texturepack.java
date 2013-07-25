import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Texturepack {
static String menue_background;
static String game_background; 
static String pic_url;
static String ChaLinks;
static String Boden;
static Image game_icon;
static URL hauptpfad;
static JLabel image;
static URL hauptpfadUrl;
static String hauptpfadString;
static String Brick;


	@SuppressWarnings("rawtypes")
	public static URL getPath(Class cls) {
	
		String cn = cls.getName();
		hauptpfad = cls.getResource("");
		return cls.getResource( cn);
	
	}
	
	public static void Texturepack(){
		
		//Boden
		String Boden2 = (hauptpfad + "Texturepack/Boden.png");
		Boden = Boden2.substring(6);	
		
		//Menübackground
		String menue_background2 = (hauptpfad + "Texturepack/menue_background.jpg");
		menue_background = menue_background2.substring(6);
		image = new JLabel(new ImageIcon(menue_background));
		
		//Gamebackground
		String game_background2 = (hauptpfad + "Texturepack/game_background.jpg");
		game_background = game_background2.substring(6);	
		
		//Character lauf Animation nach rechts
		String pic_url3 = (hauptpfad + "Texturepack/Character Sprites/character rechts.png");
		pic_url = pic_url3.substring(6);
		
		//Character lauf Animation nach links
		String pic_sprite2 = (hauptpfad + "Texturepack/Character Sprites/character links.png");
		ChaLinks = pic_sprite2.substring(6);
		
		//Game icon
		String game_icon2 = (hauptpfad + "Texturepack/game_icon.png");
		String game_icon3 = game_icon2.substring(6);
		String Pfad = game_icon3;
		ImageIcon u = new ImageIcon(Pfad);
		game_icon = u.getImage();
		
		//Brick
		String Brick2 = (hauptpfad + "Texturepack/brick.png");
		Brick = Brick2.substring(6);
		
	}

	public static URL hauptpfad(String path) {
		// TODO Auto-generated method stub
		return null;
	}
}
