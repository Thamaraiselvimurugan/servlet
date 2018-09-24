importjava.io.*;

importjava.awt.*;

importjava.applet.Applet;


publicclassWelcomeextends Applet {
	
	
publicvoidpaint(Graphics g) {

		intinset;
		
intrectWidth, rectHeight;

		g.setColor(Color.pink);

		g.fillRect(0,0,300,160);

		g.setColor(Color.green);

		inset = 0;
	
	rectWidth = 299;

		rectHeight = 159;

		while (rectWidth>= 0 &&rectHeight>= 0) {

			g.drawRect(inset, inset, rectWidth, rectHeight);
	
		inset += 15;
			
rectWidth -= 30;
		
	rectHeight -= 30;
	
	}

	}
} 

