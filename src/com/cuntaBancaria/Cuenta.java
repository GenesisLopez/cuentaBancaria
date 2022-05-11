package com.cuntaBancaria;

import java.util.ArrayList;

public abstract class Cuenta {
	
	protected String nombreCuenta;
	protected Double plataEnCuenta;
	protected ArrayList<Transacciones> transacciones;
	
	
	public Cuenta(String nombreCuenta, Double plataEnCuenta) {
		super();
		this.nombreCuenta = nombreCuenta;
		this.plataEnCuenta = plataEnCuenta;
		this.transacciones = new ArrayList<>(); 
	}
	
	public abstract Double extraccionDeDinero(Double extraer);
	
	

	public String getNombreCuenta() {
		return nombreCuenta;
	}

	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}

	public Double getPlataEnCuenta() {
		return plataEnCuenta;
	}

	public void setPlataEnCuenta(Double plataEnCuenta) {
		this.plataEnCuenta = plataEnCuenta;
	}

	
	
}
