package com.cuntaBancaria;

public class CuentaSueldo extends Cuenta{
	

	public CuentaSueldo(String nombreCuenta, Double plataEnCuenta) {
		super(nombreCuenta, plataEnCuenta);
		
	}

	@Override
	public Double extraccionDeDinero(Double extraer) {
		
		plataEnCuenta = plataEnCuenta - extraer;
		
		Transacciones transaccion = new Transacciones("extraccion", extraer);
		
		transacciones.add(transaccion);
		
		
		return plataEnCuenta;
		
		
	}
	
	
	

}
