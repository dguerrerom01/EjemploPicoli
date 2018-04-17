package accion;

import java.util.Collection;
import java.util.Iterator;

import javax.swing.plaf.ColorUIResource;

import control.Game;
import modelo.Colores;
import pruebasUI.PruebaCola;
import vista.JLabelModel;

public class Seleccion {
	
	public Seleccion(PruebaCola pruebaCola) {
		super();
		Colores color=(Colores) pruebaCola.getCombo().getSelectedItem();
		pruebaCola.getGame().anadirCola(color);
		Collection<Colores> paraLaCola=pruebaCola.getGame().dameValoresCola();
		pruebaCola.getCola().removeAll();
		for (Iterator iterator = paraLaCola.iterator(); iterator.hasNext();) {
			Colores colores = (Colores) iterator.next();
			pruebaCola.getCola().add(new JLabelModel(colores.getColor()));
		}
		pruebaCola.revalidate();
	}

	
}
