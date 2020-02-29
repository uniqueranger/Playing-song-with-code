import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;


public class FirstApplet extends Applet{

	AudioClip clip=null;
	public FirstApplet()
	{
		Button btn= new Button("change color");
		btn.setBounds(50, 50, 100, 20);
		add(btn);
		btn.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent arg0) {
						setBackground(Color.red);
						
					}
					
				});
		
	}
	public void init()
	{
		AppletContext context= getAppletContext();
		try {
			URL url = new URL(getCodeBase()+"/Chain Sanu Ik Pal Chain - Shivai Vyas (DJJOhAL.Com).wav");
			clip=context.getAudioClip(url);
		}
		catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}
	public void start()
	{
		clip.play();
	}
	public void destroy()
	{
		clip=null;
	}
	public void stop()
	{
		clip.stop();
	}
}
