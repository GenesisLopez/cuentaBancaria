package com.cuntaBancaria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class cuentaBancariaTest {
	
	@Test
	public void queSePuedaExtraerDineroDeLaCuentaSueldo() {
		
		Cuenta cuenta = new CuentaSueldo("cuenta sueldo", 100.0);
		
		Double valorEsperado = 50.0;
		Double valorObtenido = cuenta.extraccionDeDinero(50.0);
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSeCobreUnCostoAdicionalAlExtraerDinero() {
		
		Cuenta cuenta = new CajaDeAhorros("Caja de ahorro", 100.0, 0);
		
		Double valorEsperado = 44.0;
		
		cuenta.extraccionDeDinero(10.0);
		cuenta.extraccionDeDinero(10.0);
		cuenta.extraccionDeDinero(10.0);
		cuenta.extraccionDeDinero(10.0);
	

		Double valorObtenido = cuenta.extraccionDeDinero(10.0);
		
		assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	public void hacerQueSePuedaExtraerMasDineroQueElQueTengoEnLaCuenta() {
		
		Cuenta cuenta = new CuentaCorriente("Cuenta corriente", 500.0, 200.0);
		
		Double valorEsperado = 0.0;
		Double valorObtenido = cuenta.extraccionDeDinero(600.0);
		
		assertEquals(valorEsperado, valorObtenido);
		
		
	}

	@Test
	public void chequearQueLaDeudaSeaLaCorrecta() {
		
		CuentaCorriente cuenta = new CuentaCorriente("Cuenta corriente", 500.0, 200.0);
		
		Double valorEsperado = 105.0;
		
		cuenta.extraccionDeDinero(600.0);
		
		Double valorObtenido = cuenta.getDeudaConElBanco();
		
		assertEquals(valorEsperado, valorObtenido);
		
		
	}
}
