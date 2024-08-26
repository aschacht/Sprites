package flatLand.trainingGround.Sprites;

import Box.Box.Box;
import Box.Box.Observer;

public class ObserverPrompt implements Observer {

	
	
	private Box box;



	public ObserverPrompt(Box box) {
		this.box = box;
		}
	
	
	
	@Override
	public void notify(String string) {
		box.notify(string);
	}

}
