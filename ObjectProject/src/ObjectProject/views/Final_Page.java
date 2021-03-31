package ObjectProject.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class Final_Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Final_Page frame = new Final_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Final_Page() {
		String Summery = Bus_Page.Secim;
		setIconImage(Toolkit.getDefaultToolkit().getImage(Final_Page.class.getResource("/ObjectProject/resouces/Bus.png")));
		setTitle("Summery Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Your Ticket");
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("New Ticket");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select_Page info = new Select_Page();
				info.main(null);
				dispose();
			}
		});
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JTextArea txtrClickForShow = new JTextArea();
		txtrClickForShow.setFont(new Font("Monospaced", Font.PLAIN, 30));
		txtrClickForShow.setText("Click For Show Summery");
		txtrClickForShow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtrClickForShow.setText("Your Ticket Summery\n" + Summery);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(156)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addGap(130))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(136)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
					.addGap(121))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrClickForShow, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
					.addGap(7))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(txtrClickForShow, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
					.addGap(26)
					.addComponent(btnNewButton)
					.addGap(12))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
