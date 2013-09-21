import java.awt.Color;




public class Tutorial_draw {

		public static void Tutorial_draw(){
			
			//Anfang vom Zeichnen des Gamehintergrunds
			gui.bg.drawImage(LoadTutorial.img, LoadTutorial.anzahl2, 0,null);			

			gui.bg.drawImage(LoadTutorial.img, LoadTutorial.BildbreiteMal1 - LoadTutorial.anzahl, 0,null);				

			gui.bg.drawImage(LoadTutorial.img, LoadTutorial.BildbreiteMal2 - LoadTutorial.anzahl, 0,null);			

			gui.bg.drawImage(LoadTutorial.img, LoadTutorial.BildbreiteMal3 - LoadTutorial.anzahl, 0,null);
			//Ende vom Zeichnen des Gamehintergrunds						
			
			Tutorial_Rectangles.Boden.setBounds(0 - Tutorial_Rectangles.Brick, 590, 1280, 80);
			Tutorial_Rectangles.Boden2.setBounds(1280 - Tutorial_Rectangles.Brick, 590, 1280, 80);
			gui.bg.setColor(Color.GREEN);
			//gui.bg.drawRect(1280 - Tutorial_Rectangles.Brick, 590, 1280, 80);			
			//gui.bg.drawRect(0 - Tutorial_Rectangles.Brick, 590, 1280, 80);			
			//Ende vom Zeichnen des Bodens
			
			//Block1
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
			Tutorial_Rectangles.BrickReck3.setBounds(150 - Tutorial_Rectangles.Brick + 700, 240, 50, 60);
			
			//Wand1
			gui.bg.drawImage(LoadTutorial.Block, 150 - Tutorial_Rectangles.Brick + 1200, 550, null);
			gui.bg.drawImage(LoadTutorial.Block, 150 - Tutorial_Rectangles.Brick + 1200, 500, null);
			gui.bg.drawImage(LoadTutorial.Block, 150 - Tutorial_Rectangles.Brick + 1200, 450, null);
			gui.bg.drawImage(LoadTutorial.Block, 150 - Tutorial_Rectangles.Brick + 1200, 400, null);
			gui.bg.drawImage(LoadTutorial.Block, 150 - Tutorial_Rectangles.Brick + 1200, 350, null);
			gui.bg.drawImage(LoadTutorial.Block, 150 - Tutorial_Rectangles.Brick + 1200, 300, null);
			gui.bg.drawImage(LoadTutorial.Block, 150 - Tutorial_Rectangles.Brick + 1200, 250, null);
			gui.bg.drawImage(LoadTutorial.Block, 150 - Tutorial_Rectangles.Brick + 1200, 200, null);
			gui.bg.drawImage(LoadTutorial.Block, 150 - Tutorial_Rectangles.Brick + 1200, 150, null);
			
			Tutorial_Rectangles.WallBrick1.setBounds(150 - Tutorial_Rectangles.Brick + 1200,140, 50, 460);
			//gui.bg.setColor(Color.GREEN);
			//gui.bg.drawRect(150 - Tutorial_Rectangles.Brick + 1200,140, 50, 460);
			
			//Anfang vom Zeichnen des Characters
			if(!(SchlumpfSpriteLaufen.character == null)) {
				if(!(SchlumpfSpriteLaufen.y + SchlumpfSpriteLaufen.characterHöheFrame < SchlumpfSpriteLaufen.characterHöheFrame)){				
					int y = SchlumpfSpriteLaufen.y;
			        int x = SchlumpfSpriteLaufen.x;
			        int CharBreite = SchlumpfSpriteLaufen.characterBreiteFrame;
			        int CharHöhe = SchlumpfSpriteLaufen.characterHöheFrame;
			        
			        if(!(CharHöhe + y >= 513)) {
			    		//bg.drawRect(590, 480 - ySpace  - Strings.ChaY, 60, 120);
			    		gui.rect2.setBounds(590, 480 - gui.ySpace  - Strings.ChaY, 60, 120);
			        	gui.bg.drawImage(SchlumpfSpriteLaufen.character.getSubimage(x, y, CharBreite, CharHöhe), 550, 480  - gui.ySpace - Strings.ChaY, null);
			        }else{
			        	//bg.drawRect(590, 480 - ySpace  - Strings.ChaY, 60, 120);
			        	gui.rect2.setBounds(590, 480 - gui.ySpace  - Strings.ChaY, 60, 120);
			        	gui.bg.drawImage(SchlumpfSpriteLaufen.character.getSubimage(x, y - 384, CharBreite, CharHöhe), 550, 480  - gui.ySpace - Strings.ChaY, null);
			        }
				}
			} 
		
		
		//Anfang vom Zeichnen des Bodens
		gui.bg.drawImage(LoadTutorial.Boden, LoadTutorial.BodenAnzahl2, 580,null);

		gui.bg.drawImage(LoadTutorial.Boden, LoadTutorial.BodenBreiteMal1 - LoadTutorial.BodenAnzahl, 580,null);

		gui.bg.drawImage(LoadTutorial.Boden, LoadTutorial.BodenBreiteMal2 - LoadTutorial.BodenAnzahl, 580,null);

		gui.bg.drawImage(LoadTutorial.Boden, LoadTutorial.BodenBreiteMal3 - LoadTutorial.BodenAnzahl, 580,null);		
		
		}
		
		public static void BlockUpdater() {
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
			if(Tutorial_Rectangles.Boden.intersects(gui.rect2)) {				
				KollisionsUpdater.Boden();
			}
			
			//Erste Wand
			if(Tutorial_Rectangles.WallBrick1.intersects(gui.rect2)) {
				KollisionsUpdater.WallBrick();
			}			
															
			if(!(Tutorial_Rectangles.BrickReck1.intersects(gui.rect2))){
				if(!(Tutorial_Rectangles.BrickReck2.intersects(gui.rect2))){
					if(!(Tutorial_Rectangles.rect1.intersects(gui.rect2))){
						if(!(Tutorial_Rectangles.BrickReck3.intersects(gui.rect2))) {
							if(!(Tutorial_Rectangles.WallBrick1.intersects(gui.rect2))) {
									
								if(!(Tutorial_Rectangles.Boden.intersects(gui.rect2))) {
									if(!(Tutorial_Rectangles.Boden2.intersects(gui.rect2))) {
										
										//Strings.AnimationY = true;
									}
								}							
								Strings.ChaAufBlock = false;								
									
								KollisionsUpdater.NoK();
								
							}
						}
					}
				}
			}														
		}
}
