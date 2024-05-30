import javax.swing.JFrame;

public class OyunCercevesi extends JFrame{
	OyunCercevesi(){
		this.add(new OyunPaneli());
		this.setTitle("Yılan Oyunu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
