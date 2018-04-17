package vistaReferencia;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import utiles.Constantes;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.GridLayout;
import java.util.Collection;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UICoPiLi extends JFrame {

	private JPanel contentPane;
	protected JButton btnSeleccionColor;
	protected JButton btnPedirColor;
	private JButton btnBarajarPilas;
	private JButton btnBorrarColor;
	private EscenarioBagGlobal centro;
	private JLabel labelMensaje;
	private JLabel lblMensaje;

	public void actualizarPanel(JPanel panel, Collection<JComponent> component) {
		limpiarPanel(panel);
		rellenarPanel(panel, component);
	}

	// Métodos de gestión de la UI
	public void anotarMonedas(int monedas) {
		assert monedas > 0 && monedas <= Constantes.CANTIDAD_MAX_MONEDAS;
		getLblMonedas().setText(String.valueOf(monedas));
	}

	private void limpiarPanel(JPanel panel) {
		panel.removeAll();

	}

	private void rellenarPanel(JPanel panel, Collection<JComponent> component) {
		for (JComponent jComponent : component) {
			panel.add(jComponent);
		}
	}

	public void establecerMensaje(String string){
		lblMensaje.setText(string);
	}
	

	/**
	 * Create the frame.
	 */
	public UICoPiLi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1023, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblJuegoPilascolaslistas = new JLabel("Juego Pilas-Colas-Listas");
		lblJuegoPilascolaslistas.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblJuegoPilascolaslistas.setHorizontalAlignment(SwingConstants.CENTER);
		lblJuegoPilascolaslistas.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lblJuegoPilascolaslistas, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 4, 0, 0));

		btnSeleccionColor = new JButton("Seleccion Color");
		
		btnSeleccionColor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnSeleccionColor);

		btnPedirColor = new JButton("Pedir Color (x5)");
		
		btnPedirColor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnPedirColor);

		btnBarajarPilas = new JButton("Barajar Pilas (x3)");
		btnBarajarPilas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnBarajarPilas);

		btnBorrarColor = new JButton("BorrarColor (x2)");
		btnBorrarColor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnBorrarColor);

		labelMensaje = new JLabel("mensaje");
		panel.add(labelMensaje);

		lblMensaje = new JLabel("");
		panel.add(lblMensaje);

		centro = new EscenarioBagGlobal();
		contentPane.add(centro, BorderLayout.CENTER);
	}

	public JPanel getCola() {
		return centro.getCola();
	}

	public void setCola(JPanel cola) {
		centro.setCola(cola);
	}

	public JPanel getPilaUno() {
		return centro.getPilaUno();
	}

	public JPanel getPilaDos() {
		return centro.getPilaDos();
	}

	public JPanel getLista() {
		return centro.getLista();
	}

	public JLabel getLblMonedas() {
		return centro.getLblMonedas();
	}

	public EscenarioBagGlobal getCentro() {
		return centro;
	}

	public JButton getBtnBarajarPilas() {
		return btnBarajarPilas;
	}

	public JButton getBtnBorrarColor() {
		return btnBorrarColor;
	}
}
