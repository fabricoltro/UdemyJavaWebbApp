package modulo1;

import java.util.Date;

public class AK_MainTest {

	public static void main(String[] args) {
	
		AK_Empleado empleado1 = new AK_Empleado(15155, "Rodrigo");
		
		AK_Empleado empleado2 = new AK_Empleado(40404.5, "Federico");
		
		System.out.println("empleado 1 = " + empleado1);
		System.out.println("empleado 2 = " + empleado2);
		
		var fecha = new Date();
		
		AK_Cliente cliente = new AK_Cliente(fecha, true, "Jorge", 23, 'M', "Rivadavia 15" ) ;
				
		System.out.println("nuevo cliente : "+ cliente );
		
	}
	

}
