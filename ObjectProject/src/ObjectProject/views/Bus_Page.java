package ObjectProject.views;
import ObjectProject.common.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class Bus_Page extends JFrame {

	private  boolean DY = false;
	private  boolean SLC = false;
	public static String Secim;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bus_Page frame = new Bus_Page();
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
	public Bus_Page() {
		
		Edit_Bus edit=new Edit_Bus();	
		
		String Select1 = Select_Page.Secim1;
		String Select2 = Select_Page.Secim2;
		Buses bus = new Buses(Select1, Select2);
		setTitle("Bus | Read Comment | Read Rate | Page");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Bus_Page.class.getResource("/ObjectProject/resouces/Bus.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
					.addGap(0))
		);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		tabbedPane.addTab("Page 1", null, panel, null);
		
		JRadioButton radioButton_9 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_9);
		if(edit.Take("9")==" ") {
		    radioButton_9.setText(bus.toString());
		}
		else {
		    radioButton_9.setText(edit.Take("9"));
		}
		radioButton_9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(radioButton_9.isSelected())
					Secim = radioButton_9.getText();
		    }
		});
		
		JRadioButton radioButton_10 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_10);
		if(edit.Take("10")==" ") {
		    radioButton_10.setText(bus.toString());
		}
		else {
		    radioButton_10.setText(edit.Take("10"));
		}
		radioButton_10.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(radioButton_10.isSelected())
					Secim = radioButton_10.getText();
		    }
		});
		
		JRadioButton radioButton_11 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_11);
		if(edit.Take("11")==" ") {
		    radioButton_11.setText(bus.toString());
		}
		else {
		    radioButton_11.setText(edit.Take("11"));
		}
		radioButton_11.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(radioButton_11.isSelected())
					Secim = radioButton_11.getText();
		    }
		});
		
		JRadioButton radioButton_12 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_12);
		if(edit.Take("12")==" ") {
		    radioButton_12.setText(bus.toString());
		}
		else {
		    radioButton_12.setText(edit.Take("12"));
		}
		radioButton_12.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(radioButton_12.isSelected())
					Secim = radioButton_12.getText();
		    }
		});
		
		JRadioButton radioButton_13 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_13);
		if(edit.Take("13")==" ") {
		    radioButton_13.setText(bus.toString());
		}
		else {
		    radioButton_13.setText(edit.Take("13"));
		}
		radioButton_13.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(radioButton_13.isSelected())
					Secim = radioButton_13.getText();
		    }
		});
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(radioButton_10, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
						.addComponent(radioButton_11, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
						.addComponent(radioButton_12, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
						.addComponent(radioButton_13, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
						.addComponent(radioButton_9, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
					.addGap(19))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addComponent(radioButton_9, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(radioButton_10, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(radioButton_11, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(radioButton_12, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(radioButton_13, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(41))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Page 2", null, panel_1, null);
		
		JRadioButton radioButton_4 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_4);
		if(edit.Take("4")==" ") {
		    radioButton_4.setText(bus.toString());
		}
		else {
		    radioButton_4.setText(edit.Take("4"));
		}
		radioButton_9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(radioButton_4.isSelected())
					Secim = radioButton_4.getText();
		    }
		});
		
		JRadioButton radioButton_5 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_5);
		if(edit.Take("5")==" ") {
		    radioButton_5.setText(bus.toString());
		}
		else {
		    radioButton_5.setText(edit.Take("5"));
		}
		radioButton_5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(radioButton_5.isSelected())
					Secim = radioButton_5.getText();
		    }
		});
		
		JRadioButton radioButton_6 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_6);
		if(edit.Take("6")==" ") {
		    radioButton_6.setText(bus.toString());
		}
		else {
		    radioButton_6.setText(edit.Take("6"));
		}
		radioButton_6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(radioButton_6.isSelected())
					Secim = radioButton_6.getText();
		    }
		});
		
		JRadioButton radioButton_7 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_7);
		if(edit.Take("7")==" ") {
		    radioButton_7.setText(bus.toString());
		}
		else {
		    radioButton_7.setText(edit.Take("7"));
		}
		radioButton_7.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(radioButton_7.isSelected())
					Secim = radioButton_7.getText();
		    }
		});
		
		JRadioButton radioButton_8 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_8);
		if(edit.Take("8")==" ") {
		    radioButton_8.setText(bus.toString());
		}
		else {
		    radioButton_8.setText(edit.Take("8"));
		}
		radioButton_8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(radioButton_8.isSelected())
					Secim = radioButton_8.getText();
		    }
		});
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(radioButton_4, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
						.addComponent(radioButton_5, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
						.addComponent(radioButton_6, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
						.addComponent(radioButton_7, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
						.addComponent(radioButton_8, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
					.addGap(19))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(16)
					.addComponent(radioButton_4, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(radioButton_5, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(radioButton_6, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(radioButton_7, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(radioButton_8, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(42))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setToolTipText("");
		tabbedPane.addTab("Page 3", null, panel_2, null);
		
		JRadioButton radioButton_0 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_0);
		if(edit.Take("14")==" ") {
		    radioButton_0.setText(bus.toString());
		}
		else {
		    radioButton_0.setText(edit.Take("14"));
		}
		radioButton_0.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(radioButton_0.isSelected())
					Secim = radioButton_0.getText();
		    }
		});
		
		JRadioButton radioButton = new JRadioButton("New radio button");
		buttonGroup.add(radioButton);
		if(edit.Take("15")==" ") {
		    radioButton.setText(bus.toString());
		}
		else {
		    radioButton.setText(edit.Take("15"));
		}
		radioButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(radioButton.isSelected())
					Secim = radioButton.getText();
		    }
		});
		
		
		JRadioButton radioButton_1 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_1);
		if(edit.Take("1")==" ") {
		    radioButton_1.setText(bus.toString());
		}
		else {
		    radioButton_1.setText(edit.Take("1"));
		}
		radioButton_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(radioButton_1.isSelected())
					Secim = radioButton_1.getText();
		    }
		});
		
		
		JRadioButton radioButton_2 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_2);
		if(edit.Take("2")==" ") {
		    radioButton_2.setText(bus.toString());
		}
		else {
		    radioButton_2.setText(edit.Take("2"));
		}
		radioButton_2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(radioButton_2.isSelected())
					Secim = radioButton_2.getText();
		    }
		});
		
		
		JRadioButton radioButton_3 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton_3);
		if(edit.Take("3")==" ") {
		    radioButton_3.setText(bus.toString());
		}
		else {
		    radioButton_3.setText(edit.Take("3"));
		}
		radioButton_3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(radioButton_3.isSelected())
					Secim = radioButton_3.getText();
		    }
		});
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(radioButton_0, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
							.addGap(19))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(radioButton, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
							.addGap(19))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(radioButton_1, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
							.addGap(19))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(radioButton_2, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
							.addGap(19))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(radioButton_3, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
							.addGap(19))))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(19)
					.addComponent(radioButton_0, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(radioButton, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(radioButton_1, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(radioButton_2, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(radioButton_3, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(39))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				DY = true;
			}
		});
		tabbedPane.addTab("Buy", null, panel_3, null);
		
		JLabel Summery = new JLabel("New label");
		Summery.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Summery.setText("CLICK FOR SUMMERY");
		Summery.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Summery.setText(Secim + " (Every Click Refresh)");
			}
		});
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Accept Licanse");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected())
					SLC = true;
				else
					SLC = false;
		    }
		});
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select_Page info = new Select_Page();
				info.main(null);
				dispose();
			}
		});
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SLC == false) {
					JOptionPane.showMessageDialog(null, "Please Accept Licanse");}
				else {
				Payment_Page info = new Payment_Page();
				info.main(null);
				dispose();}
			}
		});
		btnBuy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBuy.setBackground(SystemColor.textHighlight);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addComponent(rdbtnNewRadioButton_1, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
									.addGap(324))
								.addComponent(Summery, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(18)
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
							.addGap(159)
							.addComponent(btnBuy, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(5)
					.addComponent(Summery, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuy, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Comments", null, panel_4, null);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JTextArea textArea = new JTextArea();
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Star n=new Star();
				Comment m=new Comment();
				for(int i=n.getId();i>0;i--) {
					textArea.setText(m.Take("i"));
					System.out.print("\n");
				}
			}
		});
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		scrollPane.setViewportView(textArea);
		panel_4.setLayout(gl_panel_4);
		contentPane.setLayout(gl_contentPane);
		
			
		}
	}
