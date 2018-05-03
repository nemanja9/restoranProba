package restoran.gui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KonobarovPrikaz extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnSto;
	private JButton btnSto_1;
	private JButton btnSto_2;
	private JButton btnSto_3;
	private JButton btnSto_4;
	private JButton btnSto_5;
	private JLabel lblUkupanRacun;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel lblX;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KonobarovPrikaz frame = new KonobarovPrikaz();
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
	public KonobarovPrikaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnSto());
		contentPane.add(getBtnSto_1());
		contentPane.add(getBtnSto_2());
		contentPane.add(getBtnSto_3());
		contentPane.add(getBtnSto_4());
		contentPane.add(getBtnSto_5());
		contentPane.add(getLblUkupanRacun());
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
		contentPane.add(getLabel_3());
		contentPane.add(getLabel_4());
		contentPane.add(getLblX());
		contentPane.add(getLabel_5());
		contentPane.add(getLabel_6());
		contentPane.add(getLabel_7());
		contentPane.add(getLabel_8());
		contentPane.add(getLabel_9());
	}
	private JButton getBtnSto() {
		if (btnSto == null) {
			btnSto = new JButton("Sto 1");
			btnSto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				
				}
			});
			btnSto.setBounds(12, 26, 178, 111);
		}
		return btnSto;
	}
	private JButton getBtnSto_1() {
		if (btnSto_1 == null) {
			btnSto_1 = new JButton("Sto 2");
			btnSto_1.setBounds(332, 26, 178, 111);
		}
		return btnSto_1;
	}
	private JButton getBtnSto_2() {
		if (btnSto_2 == null) {
			btnSto_2 = new JButton("Sto 3");
			btnSto_2.setBounds(12, 192, 178, 111);
		}
		return btnSto_2;
	}
	private JButton getBtnSto_3() {
		if (btnSto_3 == null) {
			btnSto_3 = new JButton("Sto 4");
			btnSto_3.setBounds(332, 192, 178, 111);
		}
		return btnSto_3;
	}
	private JButton getBtnSto_4() {
		if (btnSto_4 == null) {
			btnSto_4 = new JButton("Sto 5");
			btnSto_4.setBounds(12, 361, 178, 111);
		}
		return btnSto_4;
	}
	private JButton getBtnSto_5() {
		if (btnSto_5 == null) {
			btnSto_5 = new JButton("Sto 6");
			btnSto_5.setBounds(332, 361, 178, 111);
		}
		return btnSto_5;
	}
	private JLabel getLblUkupanRacun() {
		if (lblUkupanRacun == null) {
			lblUkupanRacun = new JLabel("Ukupan racun:");
			lblUkupanRacun.setBounds(22, 146, 130, 16);
		}
		return lblUkupanRacun;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Ukupan racun:");
			label.setBounds(342, 146, 130, 16);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Ukupan racun:");
			label_1.setBounds(342, 316, 130, 16);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Ukupan racun:");
			label_2.setBounds(22, 316, 130, 16);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Ukupan racun:");
			label_3.setBounds(342, 485, 130, 16);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Ukupan racun:");
			label_4.setBounds(22, 485, 130, 16);
		}
		return label_4;
	}
	private JLabel getLblX() {
		if (lblX == null) {
			lblX = new JLabel("X");
			lblX.setHorizontalAlignment(SwingConstants.CENTER);
			lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblX.setBounds(134, 137, 56, 33);
		}
		return lblX;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("X");
			label_5.setHorizontalAlignment(SwingConstants.CENTER);
			label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
			label_5.setBounds(454, 137, 56, 33);
		}
		return label_5;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("X");
			label_6.setHorizontalAlignment(SwingConstants.CENTER);
			label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
			label_6.setBounds(454, 304, 56, 33);
		}
		return label_6;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("X");
			label_7.setHorizontalAlignment(SwingConstants.CENTER);
			label_7.setFont(new Font("Tahoma", Font.BOLD, 15));
			label_7.setBounds(134, 304, 56, 33);
		}
		return label_7;
	}
	private JLabel getLabel_8() {
		if (label_8 == null) {
			label_8 = new JLabel("X");
			label_8.setHorizontalAlignment(SwingConstants.CENTER);
			label_8.setFont(new Font("Tahoma", Font.BOLD, 15));
			label_8.setBounds(454, 474, 56, 33);
		}
		return label_8;
	}
	private JLabel getLabel_9() {
		if (label_9 == null) {
			label_9 = new JLabel("X");
			label_9.setHorizontalAlignment(SwingConstants.CENTER);
			label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
			label_9.setBounds(134, 474, 56, 33);
		}
		return label_9;
	}
}
