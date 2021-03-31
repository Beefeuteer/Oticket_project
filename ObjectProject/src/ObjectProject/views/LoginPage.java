package ObjectProject.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class LoginPage {

	private JFrame frmLoginPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmLoginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginPage = new JFrame();
		frmLoginPage.setTitle("Login Page");
		frmLoginPage.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPage.class.getResource("/ObjectProject/resouces/Bus.png")));
		frmLoginPage.setBounds(100, 100, 450, 300);
		frmLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.setBackground(SystemColor.textHighlight);
		btnAdmin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new Login_PageAdmin();
            	Login_PageAdmin.main(null);
                frmLoginPage.setVisible(false);
            }
        });
		
		JButton btnNewButton_1 = new JButton("TECHNICAN");
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Login_PageTech();
                Login_PageTech.main(null);
                frmLoginPage.setVisible(false);
            }
        });
		
		JButton btnNewButton = new JButton("USER");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Login_PageUser();
                Login_PageUser.main(null);
                frmLoginPage.setVisible(false);
            }
        });
		
		JLabel lblPleaseSelectTo = new JLabel("Please select to login");
		lblPleaseSelectTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectTo.setFont(new Font("Tahoma", Font.BOLD, 32));
		GroupLayout groupLayout = new GroupLayout(frmLoginPage.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addComponent(lblPleaseSelectTo, GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
					.addGap(45))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addComponent(btnAdmin, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
					.addGap(29))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(lblPleaseSelectTo, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
					.addGap(88)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAdmin, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(42))
		);
		frmLoginPage.getContentPane().setLayout(groupLayout);
	}
}
