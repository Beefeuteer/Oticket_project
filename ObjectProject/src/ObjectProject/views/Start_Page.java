package ObjectProject.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Start_Page extends JFrame 
{

	private JPanel Start_Page_Content;
	private JButton btnStartButton;
	private JTextField txtOnlineBusTicket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try 
				{
					Start_Page frame = new Start_Page();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Start_Page() 
	{
		initComponents();
		createEvents();

	}

	private void initComponents() 
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(Start_Page.class.getResource("/ObjectProject/resouces/Bus.png")));
		setTitle("   Bus Ticket System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Start_Page_Content = new JPanel();
		Start_Page_Content.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Start_Page_Content);
		
		btnStartButton = new JButton("START");

		
		btnStartButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnStartButton.setForeground(Color.BLACK);
		btnStartButton.setBackground(SystemColor.textHighlight);
		
		JSeparator separator = new JSeparator();
		
		txtOnlineBusTicket = new JTextField();
		txtOnlineBusTicket.setForeground(Color.WHITE);
		txtOnlineBusTicket.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtOnlineBusTicket.setText("Online Bus Ticket System");
		txtOnlineBusTicket.setHorizontalAlignment(SwingConstants.CENTER);
		txtOnlineBusTicket.setBackground(Color.DARK_GRAY);
		txtOnlineBusTicket.setColumns(10);
		GroupLayout gl_Start_Page_Content = new GroupLayout(Start_Page_Content);
		gl_Start_Page_Content.setHorizontalGroup(
			gl_Start_Page_Content.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Start_Page_Content.createSequentialGroup()
					.addGap(142)
					.addComponent(btnStartButton, GroupLayout.PREFERRED_SIZE, 136, Short.MAX_VALUE)
					.addGap(146))
				.addComponent(separator, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				.addComponent(txtOnlineBusTicket, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
		);
		gl_Start_Page_Content.setVerticalGroup(
			gl_Start_Page_Content.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Start_Page_Content.createSequentialGroup()
					.addComponent(txtOnlineBusTicket, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnStartButton)
					.addGap(30))
		);
		Start_Page_Content.setLayout(gl_Start_Page_Content);
	}

	
	private void createEvents() 
	{

		btnStartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage info = new LoginPage();
				info.main(null);
				dispose();
			}
		});
	}
}
