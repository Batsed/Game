import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class Audio {
	
	private Player playMp3;
	
	private Thread Audio = new Thread("Musik") {
	      @Override
	      public void run() {
	        try {
	         // playMp3.play();
	        } catch (Exception e) {
	            System.err.printf("%s\n", e.getMessage());
	        }
	      }
	    };
	
	
    public static void run() {} {
    	try {			
			FileInputStream fis = new FileInputStream(AudioPath.f);						
			BufferedInputStream bis = new BufferedInputStream(fis);		
			
			playMp3 = new Player(bis);
			
		}catch(Exception e) {
			System.out.println(e);
		}
    }
	
	
	public static void main() {
        new Audio().start();
    }
	
    private void start() {
    	Audio.start();
    }

}
