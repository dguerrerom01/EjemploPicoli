package vistaReferencia;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Font;

public class EscenarioBagGlobal extends JPanel {
	private JPanel cola;
	private JPanel pilaUno;
	private JPanel pilaDos;
	private JPanel lista;
	private JLabel lblMonedas;

	/**
	 * Create the panel.
	 */
	public EscenarioBagGlobal() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Monedas en Casa");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 10;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		lblMonedas = new JLabel(" ");
		lblMonedas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblMonedas = new GridBagConstraints();
		gbc_lblMonedas.anchor = GridBagConstraints.WEST;
		gbc_lblMonedas.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonedas.gridx = 11;
		gbc_lblMonedas.gridy = 1;
		add(lblMonedas, gbc_lblMonedas);
		
		cola = new JPanel();
		GridBagConstraints gbc_cola = new GridBagConstraints();
		gbc_cola.gridwidth = 2;
		gbc_cola.insets = new Insets(0, 0, 5, 5);
		gbc_cola.fill = GridBagConstraints.BOTH;
		gbc_cola.gridx = 1;
		gbc_cola.gridy = 3;
		add(cola, gbc_cola);
		cola.setLayout(new BoxLayout(cola, BoxLayout.Y_AXIS));
		
		pilaUno = new JPanel();
		GridBagConstraints gbc_pilaUno = new GridBagConstraints();
		gbc_pilaUno.gridwidth = 2;
		gbc_pilaUno.insets = new Insets(0, 0, 5, 5);
		gbc_pilaUno.fill = GridBagConstraints.BOTH;
		gbc_pilaUno.gridx = 4;
		gbc_pilaUno.gridy = 3;
		add(pilaUno, gbc_pilaUno);
		pilaUno.setLayout(new BoxLayout(pilaUno, BoxLayout.Y_AXIS));
		
		pilaDos = new JPanel();
		GridBagConstraints gbc_pilaDos = new GridBagConstraints();
		gbc_pilaDos.gridwidth = 2;
		gbc_pilaDos.insets = new Insets(0, 0, 5, 5);
		gbc_pilaDos.fill = GridBagConstraints.BOTH;
		gbc_pilaDos.gridx = 7;
		gbc_pilaDos.gridy = 3;
		add(pilaDos, gbc_pilaDos);
		pilaDos.setLayout(new BoxLayout(pilaDos, BoxLayout.Y_AXIS));
		
		lista = new JPanel();
		GridBagConstraints gbc_lista = new GridBagConstraints();
		gbc_lista.gridwidth = 2;
		gbc_lista.insets = new Insets(0, 0, 5, 5);
		gbc_lista.fill = GridBagConstraints.BOTH;
		gbc_lista.gridx = 10;
		gbc_lista.gridy = 3;
		add(lista, gbc_lista);
		lista.setLayout(new GridLayout(5, 5, 0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("Cola");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.gridwidth = 3;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 5;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Pila");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.gridwidth = 2;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 4;
		gbc_lblNewLabel_6.gridy = 5;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Pila");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.gridwidth = 2;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 7;
		gbc_lblNewLabel_7.gridy = 5;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Lista");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_8.gridwidth = 4;
		gbc_lblNewLabel_8.gridx = 10;
		gbc_lblNewLabel_8.gridy = 5;
		add(lblNewLabel_8, gbc_lblNewLabel_8);

	}

	public JPanel getCola() {
		return cola;
	}

	public void setCola(JPanel cola) {
		this.cola = cola;
	}

	public JPanel getPilaUno() {
		return pilaUno;
	}

	public void setPilaUno(JPanel pilaUno) {
		this.pilaUno = pilaUno;
	}

	public JPanel getPilaDos() {
		return pilaDos;
	}

	public void setPilaDos(JPanel pilaDos) {
		this.pilaDos = pilaDos;
	}

	public JPanel getLista() {
		return lista;
	}

	public void setLista(JPanel lista) {
		this.lista = lista;
	}

	public JLabel getLblMonedas() {
		return lblMonedas;
	}

	public void setLblMonedas(JLabel lblMonedas) {
		this.lblMonedas = lblMonedas;
	}

}
