package ObjectProject.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Login_PageAdmin extends JFrame {

	JFrame frmLoginAdmin;
	private JPasswordField passwordField;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_PageAdmin window = new Login_PageAdmin();
					window.frmLoginAdmin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_PageAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginAdmin = new JFrame();
		frmLoginAdmin.setTitle("Login Admin");
		frmLoginAdmin.setIconImage(Toolkit.getDefaultToolkit().getImage(Login_PageAdmin.class.getResource("/ObjectProject/resouces/Bus.png")));
		frmLoginAdmin.setBounds(100, 100, 450, 300);
		frmLoginAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea txtrId = new JTextArea();
		
		passwordField = new JPasswordField();
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JSeparator separator = new JSeparator();
		
		JLabel lblAdminPage = new JLabel("Admin Login Page");
		lblAdminPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminPage.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDatabase?autoReconnect=true&useSSL=false","root","ad01b926");
					java.sql.Statement stmt = con.createStatement();
					String sql = "select * from admininfo where USERNAME='" + txtrId.getText() + "'and PASSWRD='" + passwordField.getText().toString() + "'";
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login Succesfully...");
						AdminMenu info = new AdminMenu();
						info.main(null);
						frmLoginAdmin.setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
					con.close();
					}
				}
				catch(Exception e) {
					System.out.print(e);
					}
			}
		});
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	LoginPage info =new LoginPage();
                info.main(null);
                frmLoginAdmin.setVisible(false);
            }
        });
		GroupLayout groupLayout = new GroupLayout(frmLoginAdmin.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNewLabel)
					.addGap(76)
					.addComponent(txtrId, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
					.addGap(180))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
					.addGap(180))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
					.addGap(96)
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
					.addGap(54))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(109)
					.addComponent(lblAdminPage, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
					.addGap(120))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAdminPage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(48)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrId, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(25))
		);
		frmLoginAdmin.getContentPane().setLayout(groupLayout);
	}
}
