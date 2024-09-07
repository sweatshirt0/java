import javax.swing.*;

public class Login {
    public Login() {
	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();

	JLabel userlabel = new JLabel("Username: ");
	userlabel.setBounds(10, 20, 80, 25);
	JLabel passlabel = new JLabel("Password: ");

	JTextField userText = new JTextField();
	userText.setBounds(100, 20, 265, 25);

	JPasswordField passText = new JPasswordField();
	passText.setBounds(100, 50, 265, 25);
	
	frame.setSize(500, 500);
	frame.add(panel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	panel.setLayout(null);
	panel.add(userlabel);
	panel.add(passlabel);
	panel.add(userText);
	panel.add(passText);

	frame.setVisible(true);
	
    }
    
    public static void main(String[] args) {
	new Login();
    }
}
