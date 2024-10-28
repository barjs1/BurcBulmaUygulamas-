import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import java.awt.Button;
import javax.swing.JList;

public class burcBulucu extends JFrame {

	private JLabel label;
	private JComboBox<String> gunComboBox;
	private JComboBox<String> ayComboBox;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField gunIndex;
	private JTextField ayIndex;
	private String[][] burclar = {
            {"Koç", "Boğa", "İkizler", "Yengeç", "Aslan", "Başak", "Terazi", "Akrep", "Yay", "Oğlak", "Kova", "Balık"},
            {"Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"}
    };

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					burcBulucu burcGosterme = new burcBulucu();
			            burcGosterme.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the frame.
	 */
	public burcBulucu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 463);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Burç Öğrenme Uygulaması");
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 38));
		lblNewLabel.setBounds(10, 11, 475, 99);
		contentPane.add(lblNewLabel);
		
		gunIndex = new JTextField();
		gunIndex.setBounds(159, 133, 153, 28);
		contentPane.add(gunIndex);
		gunIndex.setColumns(10);
		
		ayIndex = new JTextField();
		ayIndex.setColumns(10);
		ayIndex.setBounds(159, 193, 153, 28);
		contentPane.add(ayIndex);
		
		JLabel lblNewLabel_1 = new JLabel("GÜN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblNewLabel_1.setBounds(10, 133, 129, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("AY");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblNewLabel_1_1.setBounds(10, 193, 129, 28);
		contentPane.add(lblNewLabel_1_1);
		
		Button button = new Button("öğren");
		button.setFont(new Font("Dialog", Font.BOLD, 20));
		button.setBounds(159, 254, 153, 48);
		contentPane.add(button);
		
		JLabel lblNewLabel_2 = new JLabel("Burcunuz");
		lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD, 37));
		lblNewLabel_2.setBounds(400, 107, 179, 77);
		contentPane.add(lblNewLabel_2);
		
		JLabel sonuc = new JLabel("");
		sonuc.setFont(new Font("Tahoma", Font.PLAIN, 45));
		sonuc.setBounds(420, 193, 205, 109);
		contentPane.add(sonuc);
	}
	public void BurcGosterme() {
        setTitle("Burç Gösterme");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label = new JLabel("Gün ve Ay seçin:");
        gunComboBox = new JComboBox<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"});
        ayComboBox = new JComboBox<>(new String[]{"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran",
                "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"});
        JButton button = new JButton("Burç Göster");
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(gunComboBox);
        panel.add(ayComboBox);
        panel.add(button);

        getContentPane().add(panel);

        button.addActionListener(e -> {
            int gunIndex = gunComboBox.getSelectedIndex();
            int ayIndex = ayComboBox.getSelectedIndex();
            String burc = bulBurc(gunIndex, ayIndex);
            JOptionPane.showMessageDialog(this, "Seçtiğiniz gün ve ayın burcu: " + burc);
        });
    }

        
        private String bulBurc(int gun, int ay) {
            if ((ay == 2 && gun >= 21) || (ay == 3 && gun <= 20)) {
                return burclar[0][0]; // Koç
            } else if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
                return burclar[0][1]; // Boğa
            } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
                return burclar[0][2]; // İkizler
            } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 21)) {
                return burclar[0][3]; // Yengeç
            } else if ((ay == 6 && gun >= 22) || (ay == 7 && gun <= 22)) {
                return burclar[0][4]; // Aslan
            } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
                return burclar[0][5]; // Başak
            } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
                return burclar[0][6]; // Terazi
            } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
                return burclar[0][7]; // Akrep
            } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
                return burclar[0][8]; // Yay
            } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
                return burclar[0][9]; // Oğlak
            } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 20)) {
                return burclar[0][10]; // Kova
            } else if ((ay == 1 && gun >= 21) || (ay == 2 && gun <= 20)) {
                return burclar[0][11]; // Balık
            } else {
                return "Geçersiz tarih";
            }
        }
}
