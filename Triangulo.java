package pckTriangulo;

import java.util.Scanner;

public class Triangulo {

	String numero1;
	String numero2;
	String numero3;
	
	
	private int convertirAEntero(String numero){
		return  Integer.parseInt(numero);
	}
	
	private boolean EsNegativo(String numero){
		
		if ( convertirAEntero(numero) <= 0){
			System.out.println("EL NUMERO INGRESADO NO ES POSITIVO");
			return true;
		}
		return false;
	}	
	
	
	private boolean NoEsLetra(String numero){
		if( tryParseInt(numero)){
			return true;
		}
		System.out.println("EL NUMERO INGRESADO NO ES UN NUMERO");
		return false;
			
	}
	
	private boolean tryParseInt(String value) {  
	     try {  
	    	 convertirAEntero(value);  
	         return true;  
	      } catch (NumberFormatException e) {  
	         return false;  
	      }  
	}
	
	private boolean esTriangulo(int x, int y, int z){
		return ((x+y) > z && (y+z) > x && (x+z) > y);
	}
	
	private void Tipo(String x, String y, String z) {
		int x1,y1,z1;
		x1 = convertirAEntero(x);
		y1 = convertirAEntero(y);
		z1 = convertirAEntero(z);
		
		if(esTriangulo(x1,y1,z1)) {
			if(x1 == y1 && y1 ==z1)
				System.out.println("Equilatero");
			else if(x1 != y1 && y1 !=z1 && z1!=x1 )
				System.out.println ("Escaleno");
			else 
				System.out.println( "Isosceles");
		}
		else{
			System.out.println("LOS LADOS INGRESARON NO FORMAN UN  TRIANGULO");
		}
	}
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		boolean esCorrecto = false;
		String continuar = "";
		
		Triangulo t = new Triangulo();
		
		while(! continuar.equals("0")){
			System.out.println("Bienvenido...");
			System.out.print("Ingrese el primer numero: ");
			t.numero1 = entrada.nextLine();
			
			while(! esCorrecto){
				if (t.NoEsLetra(t.numero1)) {
					if(! t.EsNegativo(t.numero1)){
						esCorrecto = true;					
					}				
				}			
				if(! esCorrecto){
					System.out.print("Vuelva a ingresar el numero: ");
					t.numero1 = entrada.nextLine();
				}			
			}
			
			System.out.print("Ingrese el segundo numero: ");
			t.numero2 = entrada.nextLine();
			
			esCorrecto = false;
			
			while(! esCorrecto){
				if (t.NoEsLetra(t.numero2)) {
					if(! t.EsNegativo(t.numero2)){
						esCorrecto = true;					
					}				
				}			
				if(! esCorrecto){
					System.out.print("Vuelva a ingresar el numero: ");
					t.numero2 = entrada.nextLine();
				}			
			}
			
			System.out.print("Ingrese el tercer numero: ");
			t.numero3 = entrada.nextLine();
	
			esCorrecto = false;
			
			while(! esCorrecto){
				if (t.NoEsLetra(t.numero3)) {
					if(! t.EsNegativo(t.numero3)){
						esCorrecto = true;					
					}				
				}			
				if(! esCorrecto){
					System.out.print("Vuelva a ingresar el numero: ");
					t.numero3 = entrada.nextLine();
				}			
			}
			
			t.Tipo(t.numero1, t.numero2, t.numero3);
			
			System.out.print("Si quiere reingresar los datos, presionar cualquier letra o 0 para salir: ");
			continuar = entrada.nextLine();
		}	
		
	}
}
