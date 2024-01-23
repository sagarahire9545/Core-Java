/**
 * 
 */
package awt_learning;

import java.awt.*;

public class FirstApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame fr=new Frame("My first app");
		fr.setVisible(true);
		fr.setSize(300,300);
		
		Button b=new Button("Ok");
		b.setVisible(true);
		fr.add(b);
		
		
	}

}
