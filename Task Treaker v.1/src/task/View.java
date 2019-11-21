package task;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class View {
	public static void main(String[] args) {
		Display display = new Display ();
		Shell shell = new Shell (display);
		shell.setText("GraphicalClient");
		GridLayout gridLayout = new GridLayout();
		/*gridLayout.marginLeft = 10;
	    gridLayout.marginRight = 5;*/
	    gridLayout.numColumns  = 2;       
	    shell.setSize(600, 500);
	    //shell.setLayout(gridLayout);
	/*Label file= new Label(shell,SWT.NONE);
	file.setText("Файл:");    
	file.setLayoutData(new GridData(SWT.END,SWT.CENTER,false,false));*/
		
		
		
		
		
		
		
		
		
		
		
		
		shell.pack ();
	    shell.open ();

	    while (!shell.isDisposed ()) {
	        if (!display.readAndDispatch ()) 
	            display.sleep ();
	    }
	    display.dispose ();
	}
	}

	

