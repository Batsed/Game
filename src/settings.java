import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class settings extends JFrame implements ActionListener{
	
static JFrame SFrame;
public static JButton SPfad;
public static JButton SOk;
static String BukkitPfad = "baum";
static JLabel label3;
static JLabel label2;
JLabel img = Texturepack.image;

	public static void Smain (String[]args) throws Exception{ 			 				
		
		SFrame = new settings("Einstellungen");
		SFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SFrame.setSize(400,300);
		SFrame.setIconImage(Texturepack.game_icon);
		SFrame.setLocationRelativeTo(null);
		SFrame.setLayout(null);
		SFrame.setVisible(true);
		SFrame.setTitle("Einstellungen");
		SFrame.setResizable(false);	
	}
	
	public settings(String String) {
		
		JPanel kontainer = new JPanel(); 
		setContentPane(kontainer); 
		kontainer.setLayout(null);
		img.setBounds(0,0,400,400);
		
		JLabel label = new JLabel("Damit wählt man irgendwann mal das Texture pack aus");
		label.setBounds(40,40,400,20);
		add(label);
		
		label3 = new JLabel("Pfad:");
		label3.setBounds(0,130,250,20);
		label3.setVisible(false);
		add(label3);
		
		label2 = new JLabel(BukkitPfad);
		label2.setBounds(0,160,380,20);
		label2.setVisible(false);
		add(label2);
		
		SPfad = new JButton("Klick mich");
		SPfad.setBounds(140, 70, 120, 40);
		SPfad.addActionListener(this);
		SPfad.setVisible(true);
		add(SPfad);	
		
		SOk = new JButton("OK");
		SOk.setBounds(160, 200, 80, 40);
		SOk.addActionListener(this);
		SOk.setVisible(true);
		add(SOk);
				
		kontainer.add(img);
	}
	
	public void actionPerformed1(ActionEvent e) {		
		
		JFileChooser fc = new JFileChooser();

		int returnVal = fc.showOpenDialog(null);

		if (returnVal == JFileChooser.APPROVE_OPTION) {

			File folder = fc.getSelectedFile();
			System.out.println(folder.getPath());
			//lbl.setText("Pfad: " + file.getPath());
			BukkitPfad = folder.getPath();
			
			settings.label3.setVisible(true);
			settings.label2.setText(BukkitPfad);
			settings.label2.setVisible(true);
			
		} else if (returnVal == JFileChooser.CANCEL_OPTION) {


		} else if (returnVal == JFileChooser.ERROR_OPTION) {

			System.out.println("Error!");
		}
		

	}

	@Override
public void actionPerformed(ActionEvent e){
		if(e.getSource() == SOk) {
			frame.framevisible();
		}
		if (e.getSource() == SPfad){
			actionPerformed1(e);			
		}
	}
}
