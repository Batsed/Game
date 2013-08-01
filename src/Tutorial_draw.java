
public class Tutorial_draw {

		public static void Tutorial_draw(){
			
			//Anfang vom Zeichnen des Gamehintergrunds
			gui.bg.drawImage(LoadTutorial.img, 0 - LoadTutorial.anzahl2, 0,null);			

			gui.bg.drawImage(LoadTutorial.img, LoadTutorial.BildbreiteMal1 - LoadTutorial.anzahl, 0,null);				

			gui.bg.drawImage(LoadTutorial.img, LoadTutorial.BildbreiteMal2 - LoadTutorial.anzahl, 0,null);			

			gui.bg.drawImage(LoadTutorial.img, LoadTutorial.BildbreiteMal3 - LoadTutorial.anzahl, 0,null);
			//Ende vom Zeichnen des Gamehintergrunds
			
			//Anfang vom Zeichnen des Bodens
			gui.bg.drawImage(LoadTutorial.Boden, 0 - LoadTutorial.BodenAnzahl2, 600,null);

			gui.bg.drawImage(LoadTutorial.Boden, LoadTutorial.BodenBreiteMal1 - LoadTutorial.BodenAnzahl, 600,null);

			gui.bg.drawImage(LoadTutorial.Boden, LoadTutorial.BodenBreiteMal2 - LoadTutorial.BodenAnzahl, 600,null);

			gui.bg.drawImage(LoadTutorial.Boden, LoadTutorial.BodenBreiteMal3 - LoadTutorial.BodenAnzahl, 600,null);

			//Ende vom Zeichnen des Bodens
			
			gui.bg.drawImage(LoadTutorial.Block, 0 - Tutorial_Rectangles.Brick + 700, 550,null);
			Tutorial_Rectangles.BrickReck1.setBounds(0 - Tutorial_Rectangles.Brick + 700,540, 50, 60);
			//Block 2			
			gui.bg.drawImage(LoadTutorial.Block, 50 - Tutorial_Rectangles.Brick + 700, 450,null);
			Tutorial_Rectangles.rect1.setBounds(50 - Tutorial_Rectangles.Brick + 700,440, 50, 60);
			//Block 3
			gui.bg.drawImage(LoadTutorial.Block, 100 - Tutorial_Rectangles.Brick + 700, 350, null);
			Tutorial_Rectangles.BrickReck2.setBounds(100 - Tutorial_Rectangles.Brick + 700,340, 50, 60);
			//Block 4
			gui.bg.drawImage(LoadTutorial.Block, 150 - Tutorial_Rectangles.Brick + 700, 250, null);
			Tutorial_Rectangles.BrickReck3.setBounds(150 - Tutorial_Rectangles.Brick + 700,240, 50, 60);
			
			//Kolliesionen überprüfen	
			if(370 >= 608 - gui.ySpace - Strings.ChaY) {
				//System.out.println("Brick: " + (370) + " Cha: " + (608 - ySpace - Strings.ChaY));
				//System.out.println("Cha ist höher");
			}
			if(Tutorial_Rectangles.BrickReck1.intersects(gui.rect2)){				 
				KollisionsUpdater.BrickReck1();
	        }
			if(Tutorial_Rectangles.rect1.intersects(gui.rect2)){	
				KollisionsUpdater.rect1();		
			}
			if(Tutorial_Rectangles.BrickReck2.intersects(gui.rect2)) {
				KollisionsUpdater.BrickReck2();
			}
			if(Tutorial_Rectangles.BrickReck3.intersects(gui.rect2)) {
				KollisionsUpdater.BrickReck3();
			}
			if(!(Tutorial_Rectangles.BrickReck1.intersects(gui.rect2))){
				if(!(Tutorial_Rectangles.BrickReck2.intersects(gui.rect2))){
					if(!(Tutorial_Rectangles.rect1.intersects(gui.rect2))){
						if(!(Tutorial_Rectangles.BrickReck3.intersects(gui.rect2))) {
							
							
							if(KeySchleife.stoßrechts == "true") {
								KeySchleife.stoßlinks = "false";							
							}					
						KollisionsUpdater.NoK();
						}
					}
				}
			}		
		}
}
