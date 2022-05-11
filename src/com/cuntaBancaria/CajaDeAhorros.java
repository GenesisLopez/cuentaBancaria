package com.cuntaBancaria;

public class CajaDeAhorros extends Cuenta{
	
	
	Integer intentosDeExtraccion;
	
	public CajaDeAhorros(String nombreCuenta, Double plataEnCuenta, Integer intentosDeExtraccion) {
		super(nombreCuenta, plataEnCuenta);
		this.intentosDeExtraccion = intentosDeExtraccion;
	}

	@Override
	public Double extraccionDeDinero(Double extraer) {
		
		plataEnCuenta = plataEnCuenta - extraer;
		
		intentosDeExtraccion++;
		
		if(intentosDeExtraccion == 5) {
			
			plataEnCuenta = plataEnCuenta - 6;
			
		}
		
		return plataEnCuenta;
	}

	public Integer getIntentosDeExtraccion() {
		return intentosDeExtraccion;
	}

	public void setIntentosDeExtraccion(Integer intentosDeExtraccion) {
		this.intentosDeExtraccion = intentosDeExtraccion;
	}
	
	

}
