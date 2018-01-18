import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Button extends JFrame {
	private JButton ok;
	private JButton cancel;
	
	public Button() {
		super("JButton Demo");
		setLayout(new FlowLayout());
		
		ok = new JButton("OK");
		add(ok);
		
		cancel = new JButton("Cancel");
		add(cancel, BorderLayout.CENTER);
		
		newClass handler = new newClass();
		ok.addActionListener(handler);
		cancel.addActionListener(handler);
		
	}
	
	private class newClass implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, String.format("You clicked %s button", event.getActionCommand()));
		}
		
	}

}
