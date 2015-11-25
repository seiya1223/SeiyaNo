package seiyatest.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.part.ViewPart;

public class NewView extends ViewPart {

	private Label label;
	
	public NewView(){
		super();
	}
	
	@Override
	 public void createPartControl(Composite parent) {
        label = new Label(parent, 0);
        label.setText("Hello World");
    }
	
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		label.setFocus();
	}

}
