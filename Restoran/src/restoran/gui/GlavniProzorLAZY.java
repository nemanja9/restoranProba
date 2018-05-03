package restoran.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;


import restoran.gui.kontroler.GUIKontroler;

public class GlavniProzorLAZY extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton button;
	private JButton button_1;
	private JLabel lblPoruceno;
	public JTextArea textArea;
	private JScrollPane scrollPane;
	private JButton btnRacun;

	

	/**
	 * Create the frame.
	 */
	public GlavniProzorLAZY() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getTabbedPane(), BorderLayout.CENTER);
	}

	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.addTab("Pocetna strana", null, getPanel(), null);
			tabbedPane.addTab("Meni", null, getPanel_1(), null);
			tabbedPane.addTab("Moje porudzbine", null, getPanel_2(), null);
			tabbedPane.addTab("Pomoc", null, getPanel_3(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getButton());
			panel_1.add(getButton_1());
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.add(getLblPoruceno());
			panel_2.add(getScrollPane());
			panel_2.add(getButton_2_1());
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
		}
		return panel_3;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Hrana");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.prikaziHranaProzor();
					
				}
			});
			button.setBounds(130, 42, 247, 119);
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("Pice");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.prikaziPicaProzor();
				}
			});
			button_1.setBounds(130, 224, 247, 119);
		}
		return button_1;
	}
	private JLabel getLblPoruceno() {
		if (lblPoruceno == null) {
			lblPoruceno = new JLabel("Poruceno:\r\n");
			lblPoruceno.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblPoruceno.setBounds(25, 13, 135, 32);
		}
		return lblPoruceno;
	}
	public  JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(25, 88, 278, 197);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	
	private JButton getButton_2_1() {
		if (btnRacun == null) {
			btnRacun = new JButton("RACUN");
			btnRacun.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.racunTextArea();
				}
			});
			btnRacun.setBounds(403, 152, 105, 58);
		}
		return btnRacun;
	}
}
