import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class Audio {
	
	static Player playMp3;
	
	static Player ChaJump;
	
	static Player StepGrass;
	
	private Thread Audio = new Thread("Musik") {
      @Override
      public void run() {
	    try {
	    	playMp3.play();
	    	//Strings.MenüMusik = "false";
	    	main();
	    } catch (Exception e) {
	        System.err.printf("%s\n", e.getMessage());
	    }
	  }      
    };
        	    	
    public static void ManüMusik() {} {
    	try {			
			FileInputStream fis = new FileInputStream(AudioPath.f);						
			BufferedInputStream bis = new BufferedInputStream(fis);		
			
			playMp3 = new Player(bis);			
		}catch(Exception e) {
			System.out.println(e);
		}
    }
    
    public static void ChaJump() {} {
    	try {			
			FileInputStream ChaJump3 = new FileInputStream(AudioPath.ChaJump);						
			BufferedInputStream ChaJump2 = new BufferedInputStream(ChaJump3);		
			
			ChaJump = new Player(ChaJump2);
			
		}catch(Exception e) {
			System.out.println(e);
		}
    }
    
    private Thread CharacterJump = new Thread() {
        @Override
        public void run() {
          try {
        	  ChaJump.play();
        	  Strings.ChaJump = "false";
          } catch (Exception e) {
              System.err.printf("%s\n", e.getMessage());
          }
        }
      };
      
      public static void StepGrass() {} {
      	try {			
  			FileInputStream StepGrass3 = new FileInputStream(AudioPath.StepGrass);						
  			BufferedInputStream StepGrass2 = new BufferedInputStream(StepGrass3);		
  			
  			StepGrass = new Player(StepGrass2);
  			
  		}catch(Exception e) {
  			System.out.println(e);
  		}
      }
      
      private Thread ChaStepGrass = new Thread("ChaStepGrass") {
          @Override
          public void run() {
            try {
            	StepGrass.play();
 	           	Strings.StepGrass = "false";
            } catch (Exception e) {
            	System.err.printf("%s\n", e.getMessage());            	
            }
            
          }
      };
	
	
	public static void main() {
        new Audio().start();
    }
	
	public static void mainStep() {
        new Audio().Stepstart();
    }
	
	private void Stepstart() {    	  
    	//if(Strings.StepGrass.equalsIgnoreCase("true")) {
    		//System.out.println(480  - gui.ySpace - Strings.ChaY);
    		if(480  - gui.ySpace - Strings.ChaY == 480) {
	    		StepGrass();
	    		ChaStepGrass.start();
    		}
    	//}
    }
	
    private void start() {
    	if(Strings.ChaJump.equalsIgnoreCase("true")) {
    		ChaJump();
    		CharacterJump.start();
    	}
    	if(Strings.MenüMusik.equalsIgnoreCase("true")) {
    		Audio.start();
    	}   
    }
}
