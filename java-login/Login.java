import javax.swing.*;

public class Login {
    public Login() {
	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	frame.setSize(500, 500);
	frame.add(panel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }
    
    public static void main(String[] args) {
	new Login();
    }
}
