package ObjectProject.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import ObjectProject.common.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Comment_Page extends JFrame {

	public static int TotalRate;
	private int Rate = 0;
	private int id = 1;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox comboBox;
	private JButton btnNewButton_1;
	private JButton btnNewButton;

	JTextArea textArea_1 = new JTextArea();
	private JTextArea textAreaComment;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comment_Page frame = new Comment_Page();
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

	public Comment_Page() {
		Star s=new Star();
		
		int i=1;
		int y=s.getId();
		
			if(i==1) {
				id=s.getId()+1;
							
				i--;
			}	
		
		
		
		setTitle("Online Bus Ticket System | Comment and Rate");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Comment_Page.class.getResource("/ObjectProject/resouces/Bus.png")));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Which Service", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		btnNewButton = new JButton("SEND");

		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setForeground(Color.BLACK);
		
		btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rate_Page info = new Rate_Page();
				info.main(null);
				dispose();
			}
		});

		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel = new JLabel("Add Comment");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(50)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNewButton_1, 0, 0, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
		);
		
		JLabel lblSelection = new JLabel("Selection:");
		lblSelection.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bus Company", "Bug & Problem", "Other"}));
		comboBox.setSelectedIndex(2);
		
		JLabel lblRate = new JLabel("Rate:");
		lblRate.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JRadioButton rdbtnStar1 = new JRadioButton("1 Star");
		rdbtnStar1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Rate = 1;
			}
		});
		rdbtnStar1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonGroup.add(rdbtnStar1);
		
		JRadioButton rdbtnStar2 = new JRadioButton("2 Star");
		rdbtnStar2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Rate = 2;
			}
		});
		rdbtnStar2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonGroup.add(rdbtnStar2);
		
		JRadioButton rdbtnStar3 = new JRadioButton("3 Star");
		rdbtnStar3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Rate = 3;
			}
		});
		rdbtnStar3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonGroup.add(rdbtnStar3);
		
		JRadioButton rdbtnStar4 = new JRadioButton("4 Star");
		rdbtnStar4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Rate = 4;
			}
		});
		rdbtnStar4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonGroup.add(rdbtnStar4);
		
		JRadioButton rdbtnStar5 = new JRadioButton("5 Star");
		rdbtnStar5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Rate = 5;
			}
		});
		rdbtnStar5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonGroup.add(rdbtnStar5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Star Reason", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(rdbtnStar5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(140))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(rdbtnStar4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(140))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(rdbtnStar3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(140))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(rdbtnStar2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(140))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(rdbtnStar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(140))
						.addComponent(lblRate, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(lblSelection, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(66))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSelection, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addComponent(lblRate, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(rdbtnStar1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnStar2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnStar3)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnStar4)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnStar5)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
		);
		

		textArea_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				textArea_1.getText();
			}
		});
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 20));
		scrollPane_1.setViewportView(textArea_1);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		
		 textAreaComment = new JTextArea();
		textAreaComment.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				textAreaComment.getText();
			}
		});
		textAreaComment.setFont(new Font("Monospaced", Font.PLAIN, 20));
		scrollPane.setViewportView(textAreaComment);
		contentPane.setLayout(gl_contentPane);	
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(Rate == 0) {
                    JOptionPane.showMessageDialog(null, "Please Select Star");
                    }
                else {
                	try {			
                        //Creating Connection Object
                        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myDatabase?autoReconnect=true&useSSL=false","root","ad01b926");
                        //Prepared Statement
                        PreparedStatement Pstatement=connection.prepareStatement("insert into comment values(?,?,?,?)");
                        //Specifying the values of it's parameter                
                        String comment=textAreaComment.getText();
                        String starres=textArea_1.getText();
                        Pstatement.setInt(1,id);
                        Pstatement.setInt(2,Rate);
                        Pstatement.setString(3,starres);
                        Pstatement.setString(4,comment);                 
                        Pstatement.executeUpdate();// databaseye bilgileri sokuyor.
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
   				TotalRate += Rate;
   				Final_Page info = new Final_Page();
   				info.main(null);
   				dispose();
                }
				 
			}
		});
		
			
		}



}
