package pruebasUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import accion.Seleccion;
import control.Game;
import vista.Cola;
import vista.JLabelModel;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import modelo.Colores;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class PruebaCola extends JFrame {

	private Game game;
	private JPanel contentPane;
	private JComboBox combo;
	private PruebaCola yo = this;

	public JComboBox getCombo() {
		return combo;
	}

	public Cola getCola() {
		return cola;
	}

	private Cola cola;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaCola frame = new PruebaCola();
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
	public PruebaCola() {
		game=new Game();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 653);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		cola = new Cola();
		cola.setBounds(83, 13, 135, 450);
		contentPane.add(cola);
		cola.setLayout(new BoxLayout(cola, BoxLayout.Y_AXIS));

		combo = new JComboBox();
		combo.setModel(new DefaultComboBoxModel(Colores.values()));
		combo.setBounds(88, 504, 130, 22);
		contentPane.add(combo);

		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// problema le estoy pasando el this que e sun actionlistener
				new Seleccion(yo);
			}
		});
		btnOk.setBounds(98, 539, 97, 25);
		contentPane.add(btnOk);
	}

	public Game getGame() {
		return game;
	}
	
	
}
