package pacman.graphique.engine;

import javax.swing.JFrame;


/**
 * @author Horatiu Cirstea, Vincent Thomas
 *
 * interface graphique avec son controller et son afficheur
 *
 */
public class GraphicalInterface  {

	/**
	 * le Panel pour l'afficheur
	 */
	public static DrawingPanel panel;
	
	/**
	 * la construction de l'interface graphique: JFrame avec panel pour le game
	 * 
	 * @param gamePainter l'afficheur a utiliser dans le moteur
	 * @param gameController l'afficheur a utiliser dans le moteur
	 * 
	 */
	@SuppressWarnings("static-access")
	public GraphicalInterface(GamePainter gamePainter, GameController gameController){
		JFrame f=new JFrame("Projet M1 Informatique - Pacman");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// attacher le panel contenant l'afficheur du game
		this.panel=new DrawingPanel(gamePainter);
		f.setContentPane(this.panel);
		
		// attacher controller au panel du game
		this.panel.addKeyListener(gameController);	
		
		f.pack();
		f.setVisible(true);
		f.getContentPane().setFocusable(true);
		f.getContentPane().requestFocus();
	}
	
	/**
	 * mise a jour du dessin
	 */
	@SuppressWarnings("static-access")
	public void paint() {
		this.panel.drawGame();
	}
	
}
