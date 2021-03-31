package ObjectProject.views;

import ObjectProject.common.*;

import ObjectProject.common.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Select_Page extends JFrame {

	public static String Secim2;
	public static String Secim1;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select_Page frame = new Select_Page();
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
	public Select_Page() {
		setTitle("Select Page");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Select_Page.class.getResource("/ObjectProject/resouces/Bus.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Destination");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel lblNewLabel_1 = new JLabel("Where To Where");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JComboBox Select1 = new JComboBox();
		Select1.setModel(new DefaultComboBoxModel(new String[] {"From", "Adana", "Ad\u0131yaman", "Afyon", "A\u011Fr\u0131", "Amasya", "Ankara", "Antalya", "Artvin", "Ayd\u0131n", "Bal\u0131kesir", "Bilecik", "Bing\u00F6l", "Bitlis", "Bolu", "Burdur", "Bursa", "\u00C7anakkale", "\u00C7ank\u0131r\u0131", "\u00C7orum", "Denizli", "Diyarbak\u0131r", "Edirne", "Elaz\u0131\u011F", "Erzincan", "Erzurum", "Eski\u015Fehir", "Gaziantep", "Giresun", "G\u00FCm\u00FC\u015Fhane", "Hakkari", "Hatay", "Isparta", "Mersin", "\u0130stanbul", "\u0130zmir", "Kars", "Kastamonu", "Kayseri", "K\u0131rklareli", "K\u0131r\u015Fehir", "Kocaeli", "Konya", "K\u00FCtahya", "Malatya", "Manisa", "Kahramanmara\u015F", "Mardin", "Mu\u011Fla", "Mu\u015F", "Nev\u015Fehir", "Ni\u011Fde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirda\u011F", "Tokat", "Trabzon", "Tunceli", "\u015Eanl\u0131urfa", "U\u015Fak", "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman", "K\u0131r\u0131kkale", "Batman", "\u015E\u0131rnak", "Bart\u0131n", "Ardahan", "I\u011Fd\u0131r", "Yalova", "Karab\u00FCk", "Kilis", "Osmaniye", "D\u00FCzce"}));
		Select1.setSelectedIndex(0);
		Select1.setEditable(true);
		Select1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	Secim1 = (String) Select1.getSelectedItem();
		    }
		});
		
		
		
		JComboBox Select2 = new JComboBox();
		Select2.setModel(new DefaultComboBoxModel(new String[] {"To", "Adana", "Ad\u0131yaman", "Afyon", "A\u011Fr\u0131", "Amasya", "Ankara", "Antalya", "Artvin", "Ayd\u0131n", "Bal\u0131kesir", "Bilecik", "Bing\u00F6l", "Bitlis", "Bolu", "Burdur", "Bursa", "\u00C7anakkale", "\u00C7ank\u0131r\u0131", "\u00C7orum", "Denizli", "Diyarbak\u0131r", "Edirne", "Elaz\u0131\u011F", "Erzincan", "Erzurum", "Eski\u015Fehir", "Gaziantep", "Giresun", "G\u00FCm\u00FC\u015Fhane", "Hakkari", "Hatay", "Isparta", "Mersin", "\u0130stanbul", "\u0130zmir", "Kars", "Kastamonu", "Kayseri", "K\u0131rklareli", "K\u0131r\u015Fehir", "Kocaeli", "Konya", "K\u00FCtahya", "Malatya", "Manisa", "Kahramanmara\u015F", "Mardin", "Mu\u011Fla", "Mu\u015F", "Nev\u015Fehir", "Ni\u011Fde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirda\u011F", "Tokat", "Trabzon", "Tunceli", "\u015Eanl\u0131urfa", "U\u015Fak", "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman", "K\u0131r\u0131kkale", "Batman", "\u015E\u0131rnak", "Bart\u0131n", "Ardahan", "I\u011Fd\u0131r", "Yalova", "Karab\u00FCk", "Kilis", "Osmaniye", "D\u00FCzce"}));
		Select2.setSelectedIndex(0);
		Select2.setEditable(true);
		Select2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	Secim2 = (String) Select2.getSelectedItem();
		    }
		});
		
		
		Write write = new Write(Secim1, Secim2);
		write.setSelect1((String) Select1.getSelectedItem());
		write.setSelect2((String) Select2.getSelectedItem());

		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_PageUser info = new Login_PageUser();
				info.main(null);
				dispose();
			}
		});
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		
		
		JButton btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Secim1 == "From" || Secim1 == null || Secim2 == null || Secim2 == "To") {
                    JOptionPane.showMessageDialog(null, "Please Select Destination");
                }else {
                Write write = new Write(Secim1, Secim2);
                write.setSelect1((String) Select1.getSelectedItem());
                write.setSelect2((String) Select2.getSelectedItem());
                JOptionPane.showMessageDialog(null, "Your location " + Select1.getSelectedItem() + " to " + Select2.getSelectedItem());
                Bus_Page info = new Bus_Page();
                info.main(null);
                dispose();}
			}
		});
		btnSend.setBackground(SystemColor.textHighlight);
		btnSend.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(243)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(257))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(203)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
					.addGap(173))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
							.addGap(282)
							.addComponent(btnSend, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(34)
							.addComponent(Select1, 0, 239, Short.MAX_VALUE)
							.addGap(108)
							.addComponent(Select2, 0, 221, Short.MAX_VALUE)))
					.addGap(47))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1)
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(Select2)
						.addComponent(Select1, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSend, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(47))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
