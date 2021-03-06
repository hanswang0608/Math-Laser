import java.awt.event.MouseEvent;
public abstract class GameState {
	protected GameStateManager gsm;
	
	public abstract void init();
	public abstract void update();
	public abstract void draw(java.awt.Graphics2D g);
	public abstract void keyPressed(int k);
	public abstract void keyReleased(int k);
	public abstract void mouseClicked(MouseEvent m);
	public abstract void mouseEntered(MouseEvent m);
	public abstract void mouseExited(MouseEvent m);
	public abstract void mousePressed(MouseEvent m);
	public abstract void mouseReleased(MouseEvent m);
	public abstract void mouseMoved(MouseEvent m);
}
