package com.cuntaBancaria;



public class Transacciones {

	private String Motivo;
	private Double Monto;
	
	
	public Transacciones(String motivo, Double monto) {
		super();
		Motivo = motivo;
		Monto = monto;
	}


	public String getMotivo() {
		return Motivo;
	}


	public void setMotivo(String motivo) {
		Motivo = motivo;
	}


	public Double getMonto() {
		return Monto;
	}


	public void setMonto(Double monto) {
		Monto = monto;
	}
	
	
	
	
	
	
}
