package triangulo;

import java.util.Scanner;

public class Triangulo {

	String numero1;
	String numero2;
	String numero3;
	
	private String SonPositivos(int x, int y, int z){
		if(EsNegativo(x))
			return "EL 1er NUMERO INGRESADO NO ES POSITIVO";
		else if(EsNegativo(y))
			return "EL 2do NUMERO INGRESADO NO ES POSITIVO";
		else 
			return "EL 3er NUMERO INGRESADO NO ES POSITIVO";
	}
	
	private boolean EsNegativo(int numero){
		return numero <0;
	}
	
	private boolean ValidarTriangulo(int x, int y, int z){
		return ((x+y) <= z || (y+z) <= x || (x+z) <= y);
	}
	
	private boolean EsLetra(String numero){
		return tryParseInt(numero);
			
	}
	
	private boolean tryParseInt(String value) {  
	     try {  
	         Integer.parseInt(value);  
	         return true;  
	      } catch (NumberFormatException e) {  
	         return false;  
	      }  
	}
	
	private String Tipo(int x, int y, int z) {
		if(SonPositivos(x,y,z) == "" && ValidarTriangulo(x,y,z)) {
			if(x == y && y ==z)
				return "Equilatero";
			else if(x != y && y !=z && z!=x )
				return "Escaleno";
			else 
				return "Isosceles";
		}
		return "LOS LADOS INGRESARON NO FORMAN UN UN TRIANGULO";		
	}
	
	public static void main(String[] args) {
	
		Scanner entrada;
		entrada = new Scanner(System.in);
		Triangulo t = new Triangulo();
		
		System.out.print("Bienvenido...");
		System.out.print("Ingrese un numero: ");
		t.numero1 = entrada.nextLine();
		System.out.print("Ingrese otro numero: ");
		t.numero2 = entrada.nextLine();
		System.out.print("Ingrese el último numero: ");
		t.numero3 = entrada.nextLine();
		
		while(!t.EsLetra(t.numero1)){
			System.out.print("El 1er numero no es un numero");
			System.out.print("Vuelva a ingresar el numero: ");
			t.numero1 = entrada.nextLine();
		}
		
		while(!t.EsLetra(t.numero2)){
			System.out.print("El 2do numero no es un numero");
			System.out.print("Vuelva a ingresar el numero: ");
			t.numero2 = entrada.nextLine();
		}
		
		while(!t.EsLetra(t.numero3)){
			System.out.print("El 3er numero no es un numero");
			System.out.print("Vuelva a ingresar el numero: ");
			t.numero3 = entrada.nextLine();
		}
			
	}
}
