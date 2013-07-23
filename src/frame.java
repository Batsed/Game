import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class frame extends JFrame implements ActionListener {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private static JButton schliessen;
private static JButton einstellung;
private static JButton info;
private static JButton ende;
private static JButton spielen;
public static JFrame frame;
static Image MenüBackground;
static JPanel kontainer;
static JLabel label;
static JFrame fenster;
//static JLabel bild = new JLabel(new ImageIcon(Texturepack."Texturepack/menue_background.png"));

	public static void main (String[]args) throws Exception{ 			 								
		
		frame = new frame("Menü");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250,400);
        frame.setIconImage(Texturepack.game_icon);
        frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setTitle("Menü");
		frame.setResizable(false);
        frame.setVisible(true);
		
        animation();
	}

	public frame(String title) throws InterruptedException, MalformedURLException {					
		
		Texturepack.getPath(this.getClass());
		Texturepack.Texturepack();

		kontainer = new JPanel(); 
		setContentPane(kontainer); 
		kontainer.setLayout(null);
		Texturepack.image.setBounds(0,0,400,400);		
		
		spielen = new JButton("Weiterspielen");
		spielen.setBounds(45, 40, 160, 40);
		spielen.addActionListener(this);
		spielen.setVisible(false);
		add(spielen);				
		
		schliessen = new JButton("Spiel starten");
		schliessen.setBounds(45, 40, 160, 40);
		schliessen.addActionListener(this);
		schliessen.setVisible(false);		
		add(schliessen);				
		
		einstellung = new JButton("Einstellungen");
		einstellung.setBounds(45, 120, 160, 40);
		einstellung.addActionListener(this);
		einstellung.setVisible(false);
		add(einstellung);
	
		
		info = new JButton("Credits");
		info.setBounds(45, 200, 160, 40);
		info.addActionListener(this);
		info.setVisible(false);
		add(info);
	
		
	    ende = new JButton("Beenden");
	    ende.setBounds(45, 280, 160, 40);
	    ende.addActionListener(this);
	    ende.setVisible(false);
	    add(ende);
	   	    
		label = new JLabel("Made by batsed (Alpha Build 0.1)");
		label.setBounds(35,340,250,20);
		label.setVisible(false);
		add(label);	
		
		kontainer.add(Texturepack.image);		
	}

	public void actionPerformed(ActionEvent e){								
		
		if (e.getSource() == schliessen){
			if(!(settings.BukkitPfad == null)) {
				fenster();
				frame.setVisible(false);
			}else{
				try {
					frame.setVisible(false);
					settings.Smain(null);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}			
		}
		
		if (e.getSource() == info){
			Object[] options = { "OK"};
			JOptionPane.showOptionDialog(null, "Programmiert von batsed. Hompage: Batsed.de", "Information",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		}
		
		if (e.getSource() == einstellung){
			try {
				frame.setVisible(false);
				settings.Smain(null);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
		}
		
		
		if (e.getSource() == ende){
			System.exit(0);						
		}
				
		
		if (e.getSource() == spielen) {
			if(!(gui.img == null)) {
				frame.setVisible(false);
				fenster.setVisible(true);
				spielen.setVisible(false);
				schliessen.setVisible(true);
				frame.setTitle("Menü");
			}else{
				try {
					frame.setVisible(false);
					settings.Smain(null);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}
	}
	 
	public static void animation() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		schliessen.setVisible(true);
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		einstellung.setVisible(true);
				
		try {
			Thread.sleep(300);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		info.setVisible(true);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		ende.setVisible(true);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		label.setVisible(true);
	}
	
	public static void fenster(){
		fenster = new JFrame("Game");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	fenster.setSize(1280,700);				
    	fenster.add(new gui());	
    	fenster.setIconImage(Texturepack.game_icon);
    	fenster.setLocationRelativeTo(null);
    	fenster.setVisible(true);
    	fenster.setResizable(false);  
	}

	public static void visible(){
		schliessen.setVisible(false);
		spielen.setVisible(true);		
		frame.setTitle("Pause");
		frame.setVisible(true);
		fenster.setVisible(false);
	}		
	public static void framevisible() {
		frame.setVisible(true);
		settings.SFrame.setVisible(false);				
		kontainer.add(Texturepack.image);
	}
}
	
	
		
		
	
	
 