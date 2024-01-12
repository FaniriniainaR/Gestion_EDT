package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JScrollPane;

public class App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelEdt = new JPanel();
		//panelEdt.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlightText);
		panel.setBounds(0, -25, 291, 549);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnGrerLedt = new JButton("Gérer l'edt");
		btnGrerLedt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelEdt.setVisible(true);
				
			}
		});
		btnGrerLedt.setBounds(80, 115, 117, 27);
		panel.add(btnGrerLedt);
		
		JButton btnListProf = new JButton("List Prof");
		btnListProf.setBounds(80, 178, 117, 27);
		panel.add(btnListProf);
		
		
		panelEdt.setBounds(288, 12, 789, 524);
		contentPane.add(panelEdt);
		panelEdt.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(24, 76, 187, 26);
		panelEdt.add(comboBox);
		
		JLabel lblGestionDemploiDu = new JLabel("GESTION D'EMPLOI DU TEMPS");
		lblGestionDemploiDu.setBounds(237, 12, 258, 17);
		panelEdt.add(lblGestionDemploiDu);
		
		JLabel lblClasse = new JLabel("Classe:");
		lblClasse.setBounds(24, 58, 60, 17);
		panelEdt.add(lblClasse);
		
		JButton btnOk = new JButton("Voir edt");
		btnOk.setBounds(237, 76, 105, 27);
		panelEdt.add(btnOk);
		
		JPanel panelTableauEdt = new JPanel();
		panelTableauEdt.setBounds(0, 114, 736, 373);
		panelEdt.add(panelTableauEdt);
		panelTableauEdt.setLayout(null);
		
		JLabel lblJjmmaaaa = new JLabel("JJ/mm/aaaa");
		lblJjmmaaaa.setBounds(247, 17, 83, 17);
		panelTableauEdt.add(lblJjmmaaaa);
		
		JButton buttonPre = new JButton("<");
		buttonPre.setBackground(SystemColor.text);
		buttonPre.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 14));
		buttonPre.setBounds(198, 12, 41, 27);
		panelTableauEdt.add(buttonPre);
		
		JButton buttonNext = new JButton(">");
		buttonNext.setBackground(SystemColor.text);
		buttonNext.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 14));
		buttonNext.setBounds(325, 12, 41, 27);
		panelTableauEdt.add(buttonNext);
		
		String[] columnNames = {"Lundi", "Mardi", "Mercredie", "Jeudi", "Vendredie", "Samedi"};
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
		
		JLabel lblAjouter = new JLabel("Ajouter");
		lblAjouter.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 14));
		lblAjouter.setForeground(new Color(0, 139, 139));
		lblAjouter.setBounds(42, 321, 60, 17);
		panelTableauEdt.add(lblAjouter);
		
		
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setBounds(-88, 22, 675, 48);
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Ahona", null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Lundi", "Mardi", "Mercredie", "Jeudi", "Vendredie", "Samedi"
			}
		));
		table.setRowHeight(0, 101);
		table.setRowHeight(2, 101);// Set height of the third row
		table.revalidate();
		table.repaint();

		panelTableauEdt.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(23, 66, 589, 242);
		panelTableauEdt.add(scrollPane);
		
		JLabel lblModifier = new JLabel("Modifier");
		lblModifier.setForeground(new Color(0, 100, 0));
		lblModifier.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 14));
		lblModifier.setBounds(417, 321, 60, 17);
		panelTableauEdt.add(lblModifier);
		
		JLabel lblSupprimer = new JLabel("Supprimer");
		lblSupprimer.setForeground(new Color(128, 0, 0));
		lblSupprimer.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 14));
		lblSupprimer.setBounds(529, 321, 83, 17);
		panelTableauEdt.add(lblSupprimer);
	}
}
