package com.cuntaBancaria;

public class CuentaCorriente extends Cuenta{
	
	
	Double montoDescubierto;
	Double deudaConElBanco;
	
	public CuentaCorriente(String nombreCuenta, Double plataEnCuenta, Double montoDescubierto) {
		super(nombreCuenta, plataEnCuenta);
		this.montoDescubierto = montoDescubierto;
		this.deudaConElBanco = 0.0;
	}

	@Override
	public Double extraccionDeDinero(Double extraer) {
		
		
		if(plataEnCuenta > extraer) {
			
			plataEnCuenta = plataEnCuenta - extraer;
			
		}
		
		if(plataEnCuenta + montoDescubierto > extraer) {
			
			Double plataQueMePrestaElBanco = extraer - plataEnCuenta;
			
			plataEnCuenta =  plataEnCuenta + plataQueMePrestaElBanco - extraer;
			
			deudaConElBanco = plataQueMePrestaElBanco + (plataQueMePrestaElBanco * 5/100);
		}
		
		
		
		
		return plataEnCuenta;
	}

	public Double getDeudaConElBanco() {
		return deudaConElBanco;
	}

	public void setDeudaConElBanco(Double deudaConElBanco) {
		this.deudaConElBanco = deudaConElBanco;
	}

}
