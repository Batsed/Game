import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Texturepack {
static String menue_background;
static String game_background; 
static String pic_url;
static Image game_icon;
static URL hauptpfad;
static JLabel image;
static URL hauptpfadUrl;
static String hauptpfadString;


	@SuppressWarnings("rawtypes")
	public static URL getPath(Class cls) {
	
		String cn = cls.getName();
		hauptpfad = cls.getResource("");
		return cls.getResource( cn);
	
	}
	
	public static void Texturepack(){
		
		String menue_background2 = (hauptpfad + "Texturepack/menue_background.png");
		menue_background = menue_background2.substring(6);
		image = new JLabel(new ImageIcon(menue_background));
		
		String pic_url3 = (hauptpfad + "Texturepack/character.png");
		pic_url = pic_url3.substring(6);
		
		String game_background2 = (hauptpfad + "Texturepack/game_background.png");
		game_background = game_background2.substring(6);				
		
		String game_icon2 = (hauptpfad + "Texturepack/game_icon.png");
		String game_icon3 = game_icon2.substring(6);
		String Pfad = game_icon3;
		ImageIcon u = new ImageIcon(Pfad);
		game_icon = u.getImage();
		
		
	}

	public static URL hauptpfad(String path) {
		// TODO Auto-generated method stub
		return null;
	}
}
