package ObjectProject.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Addbus extends JFrame {

	private JPanel contentPane;
	private JTextField txtCompname;
	private JTextField saat;
	private JTextField dakika;
	private JTextField gun;
	private JTextField ay;
	private JTextField yil;
	private JTextField price;
	private JTextField txtid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addbus frame = new Addbus();
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
	public Addbus() {
		setTitle("Add bus");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Addbus.class.getResource("/ObjectProject/resouces/Bus.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox txtbaslangýc = new JComboBox();
		txtbaslangýc.setModel(new DefaultComboBoxModel(new String[] {"Adana", "Ad\u0131yaman", "Afyon", "A\u011Fr\u0131", "Amasya", "Ankara", "Antalya", "Artvin", "Ayd\u0131n", "Bal\u0131kesir", "Bilecik", "Bing\u00F6l", "Bitlis", "Bolu", "Burdur", "Bursa", "\u00C7anakkale", "\u00C7ank\u0131r\u0131", "\u00C7orum", "Denizli", "Diyarbak\u0131r", "Edirne", "Elaz\u0131\u011F", "Erzincan", "Erzurum", "Eski\u015Fehir", "Gaziantep", "Giresun", "G\u00FCm\u00FC\u015Fhane", "Hakkari", "Hatay", "Isparta", "Mersin", "\u0130stanbul", "\u0130zmir", "Kars", "Kastamonu", "Kayseri", "K\u0131rklareli", "K\u0131r\u015Fehir", "Kocaeli", "Konya", "K\u00FCtahya", "Malatya", "Manisa", "Kahramanmara\u015F", "Mardin", "Mu\u011Fla", "Mu\u015F", "Nev\u015Fehir", "Ni\u011Fde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirda\u011F", "Tokat", "Trabzon", "Tunceli", "\u015Eanl\u0131urfa", "U\u015Fak", "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman", "K\u0131r\u0131kkale", "Batman", "\u015E\u0131rnak", "Bart\u0131n", "Ardahan", "I\u011Fd\u0131r", "Yalova", "Karab\u00FCk", "Kilis", "Osmaniye", "D\u00FCzce"}));
		txtbaslangýc.setSelectedIndex(1);
		txtbaslangýc.setBounds(101, 114, 111, 37);
		contentPane.add(txtbaslangýc);
		
		JComboBox txtvarýs = new JComboBox();
		txtvarýs.setModel(new DefaultComboBoxModel(new String[] {"Adana", "Ad\u0131yaman", "Afyon", "A\u011Fr\u0131", "Amasya", "Ankara", "Antalya", "Artvin", "Ayd\u0131n", "Bal\u0131kesir", "Bilecik", "Bing\u00F6l", "Bitlis", "Bolu", "Burdur", "Bursa", "\u00C7anakkale", "\u00C7ank\u0131r\u0131", "\u00C7orum", "Denizli", "Diyarbak\u0131r", "Edirne", "Elaz\u0131\u011F", "Erzincan", "Erzurum", "Eski\u015Fehir", "Gaziantep", "Giresun", "G\u00FCm\u00FC\u015Fhane", "Hakkari", "Hatay", "Isparta", "Mersin", "\u0130stanbul", "\u0130zmir", "Kars", "Kastamonu", "Kayseri", "K\u0131rklareli", "K\u0131r\u015Fehir", "Kocaeli", "Konya", "K\u00FCtahya", "Malatya", "Manisa", "Kahramanmara\u015F", "Mardin", "Mu\u011Fla", "Mu\u015F", "Nev\u015Fehir", "Ni\u011Fde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirda\u011F", "Tokat", "Trabzon", "Tunceli", "\u015Eanl\u0131urfa", "U\u015Fak", "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman", "K\u0131r\u0131kkale", "Batman", "\u015E\u0131rnak", "Bart\u0131n", "Ardahan", "I\u011Fd\u0131r", "Yalova", "Karab\u00FCk", "Kilis", "Osmaniye", "D\u00FCzce"}));
		txtvarýs.setSelectedIndex(2);
		txtvarýs.setBounds(101, 64, 111, 37);
		contentPane.add(txtvarýs);
		
		JLabel lblNewLabel = new JLabel("From:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(38, 67, 53, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("    To:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(21, 120, 70, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Company name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 11, 138, 26);
		contentPane.add(lblNewLabel_2);
		
		txtCompname = new JTextField();
		txtCompname.setBounds(158, 16, 156, 20);
		contentPane.add(txtCompname);
		txtCompname.setColumns(10);
		
		saat = new JTextField();
		saat.setBounds(101, 174, 23, 20);
		contentPane.add(saat);
		saat.setColumns(10);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTime.setBounds(38, 171, 53, 23);
		contentPane.add(lblTime);
		
		JLabel label = new JLabel(":");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(134, 177, 5, 14);
		contentPane.add(label);
		
		dakika = new JTextField();
		dakika.setBounds(149, 174, 23, 20);
		contentPane.add(dakika);
		dakika.setColumns(10);
		
		gun = new JTextField();
		gun.setBounds(210, 174, 23, 20);
		contentPane.add(gun);
		gun.setColumns(10);
		
		ay = new JTextField();
		ay.setBounds(254, 174, 23, 20);
		contentPane.add(ay);
		ay.setColumns(10);
		
		yil = new JTextField();
		yil.setBounds(298, 174, 53, 20);
		contentPane.add(yil);
		yil.setColumns(10);
		
		JLabel label_1 = new JLabel(".");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(242, 180, 12, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel(".");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_2.setBounds(288, 177, 12, 14);
		contentPane.add(label_2);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrice.setBounds(38, 222, 53, 14);
		contentPane.add(lblPrice);
		
		price = new JTextField();
		price.setBounds(97, 221, 45, 20);
		contentPane.add(price);
		price.setColumns(10);
		
		JButton btnConfrm = new JButton("CONFIRM");
		btnConfrm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    //Creating Connection Object
                    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myDatabase?autoReconnect=true&useSSL=false","root","ad01b926");
                    //Prepared Statement
                    PreparedStatement Pstatement=connection.prepareStatement("insert into bus values(?,?,?,?,?,?,?,?,?,?)");
                    //Specifying the values of it's parameter
                    Pstatement.setString(1,txtid.getText());
                    Pstatement.setString(2,txtCompname.getText());
                    Pstatement.setString(3,txtvarýs.getSelectedItem().toString());
                    Pstatement.setString(4,txtbaslangýc.getSelectedItem().toString());
                    Pstatement.setString(5,saat.getText());
                    Pstatement.setString(6,dakika.getText());
                    Pstatement.setString(7,gun.getText());
                    Pstatement.setString(8,ay.getText());
                    Pstatement.setString(9,yil.getText());
                    Pstatement.setString(10,price.getText());
                    
                    //Checking for the Password match
                        Pstatement.executeUpdate();
                        JOptionPane.showMessageDialog(null,"You added bus");


                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
			}
		});
		btnConfrm.setBackground(SystemColor.textHighlight);
		btnConfrm.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConfrm.setBounds(314, 220, 89, 23);
		contentPane.add(btnConfrm);
		
		JLabel lblNewLabel_3 = new JLabel("ID:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(170, 222, 31, 14);
		contentPane.add(lblNewLabel_3);
		
		txtid = new JTextField();
		txtid.setBounds(199, 221, 36, 20);
		contentPane.add(txtid);
		txtid.setColumns(10);
	}
}
