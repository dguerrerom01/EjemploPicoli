package control;

import java.util.Collection;

import modelo.Colores;
import modelo.Datos;

public class Game {

	Datos data;

	public Game() {
		super();
		data=new Datos();
	}

	public Datos getData() {
		return data;
	}
	
	public void anadirCola(Colores color){
		data.getCola().encolar(color);
	}

	public Collection<Colores> dameValoresCola() {		
		return data.getCola().getCollectionCola();
	}

}
