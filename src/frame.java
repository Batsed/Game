import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
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
static JLabel label2;

	public static void main (String[]args) throws Exception{ 							
            
		frame = new frame("Menü");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280,700);
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
		
		AudioPath.AudioPath();

		kontainer = new JPanel(); 
		setContentPane(kontainer); 
		kontainer.setLayout(null);
		Texturepack.image.setBounds(0,0,1280,700);		
		
		spielen = new JButton("Weiterspielen");
		spielen.setBounds(370, 260, 540, 40);
		spielen.addActionListener(this);
		spielen.setVisible(false);
		add(spielen);				
		
		schliessen = new JButton("Spiel starten");
		schliessen.setBounds(370, 260, 540, 40);
		schliessen.addActionListener(this);
		schliessen.setVisible(false);		
		add(schliessen);				
		
		einstellung = new JButton("Einstellungen");
		einstellung.setBounds(370, 340, 540, 40);
		einstellung.addActionListener(this);
		einstellung.setVisible(false);
		add(einstellung);
	
		
		info = new JButton("Credits");
		info.setBounds(370, 420, 540, 40);
		info.addActionListener(this);
		info.setVisible(false);
		add(info);
	
		
	    ende = new JButton("Beenden");
	    ende.setBounds(370, 500, 540, 40);
	    ende.addActionListener(this);
	    ende.setVisible(false);
	    add(ende);
	   	    
		label = new JLabel("Made by batsed (Alpha Build 0.1)");
		label.setBounds(550,580,250,20);
		label.setVisible(false);
		add(label);	
		
		label2 = new JLabel("GAME");
		label2.setFont(new Font("Sans", Font.PLAIN, 130)); 
		label2.setForeground(Color.WHITE);
		label2.setBounds(450,80,500,140);
		label2.setVisible(true);
		add(label2);	
		
		kontainer.add(Texturepack.image);		
	}

	public void actionPerformed(ActionEvent e){								
		
		if (e.getSource() == schliessen){
			if(!(settings.BukkitPfad == null)) {
				try {
					fenster();
				} catch (LineUnavailableException
						| UnsupportedAudioFileException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
			Thread.sleep(100);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		schliessen.setVisible(true);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		einstellung.setVisible(true);
				
		try {
			Thread.sleep(100);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		info.setVisible(true);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		ende.setVisible(true);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		label.setVisible(true);
	}
	
	public static void fenster() throws Exception{
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
		Texturepack.image.setBounds(0,0,1280,700);	
		kontainer.add(Texturepack.image);
	}
}
	
	
		
		
	
	
 