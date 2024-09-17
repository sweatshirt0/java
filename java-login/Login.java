import javax.swing.*;
import java.awt.event.*;

public class Login implements ActionListener {

    
    /*public Login() {
	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();

	JLabel userlabel = new JLabel("Username: ");
	userlabel.setBounds(10, 20, 80, 25);
	JLabel passlabel = new JLabel("Password: ");
	passlabel.setBounds(10, 50, 80, 25);

	JTextField userText = new JTextField();
	userText.setBounds(100, 20, 265, 25);

	JPasswordField passText = new JPasswordField();
	passText.setBounds(100, 50, 265, 25);

	JButton loginbutton = new JButton();
	loginbutton.setBounds(10, 80, 80, 25);
	loginbutton.addActionListener(new Login());
	
	frame.setSize(500, 500);
	frame.add(panel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	panel.setLayout(null);
	panel.add(userlabel);
	panel.add(passlabel);
	panel.add(userText);
	panel.add(passText);
	panel.add(loginbutton);

	frame.setVisible(true);
	
	}*/
    
    public static void main(String[] args) {
	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();

	JLabel userlabel = new JLabel("Username: ");
	userlabel.setBounds(10, 20, 80, 25);
	JLabel passlabel = new JLabel("Password: ");
	passlabel.setBounds(10, 50, 80, 25);

	JTextField userText = new JTextField();
	userText.setBounds(100, 20, 265, 25);

	JPasswordField passText = new JPasswordField();
	passText.setBounds(100, 50, 265, 25);

	JButton loginbutton = new JButton("Login");
	loginbutton.setBounds(10, 80, 80, 25);
	loginbutton.addActionListener(new Login());
	
	frame.setSize(500, 500);
	frame.add(panel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	panel.setLayout(null);
	panel.add(userlabel);
	panel.add(passlabel);
	panel.add(userText);
	panel.add(passText);
	panel.add(loginbutton);

	frame.setVisible(true);
	
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
	System.out.println("Button Clicked.");
    }
}
