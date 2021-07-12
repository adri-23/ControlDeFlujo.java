import java.util.Scanner;

public class ControDeFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if(condicion) si se cumple {//tengo mi condicion si se cumple la 
		 * condicion ejecuta la condicion
		 * 
		 *   codigo
		 *   coddigo
		 *   codigo
		 * }
		 * -------------------------------------------------------------
		 *  if(ccondicion) si se cumple {// evaluacion de la funcion si se
		 *  cumple se ejecuta codigo
		 *  	codigo
		 *  	codigo
		 *  	codigo
		 *  }
		 *  
		 *  else if(condicion) si se cumplr{
		 *  
		 *  }
		 *  "Si se cumple la condicion del else if se ejecuta"
		 *  else if(condicion) si se cumple {
		 *  	codigo
		 *  	codigo
		 *  	codigo
		 *  }
		 *   "si ninuna condicion se cumple ejecuta el else"
		 *   else {
		 *   
		 *   }
		 *   --------------------------------------------
		 *   
		 /*   se lee la edad del usuario por consola, si la edad
		     es mayor a 18, se uestra un mensaje al usiario
		     que puede votar, en caso contrario se mostrara un mensaje 
		     indicando que no puede votar
		    
		 */
		
	/*
	 Scanner leerEdad = new Scanner(System.in); // lee datos por consola
	System.out.println("Ingresa tu edad"); // ingresa tu edad
	int edad = leerEdad.nextInt();
	String mensaje = votar(edad);
	System.out.println(mensaje); 
	*/
	/*
	 escribir un programa que pida el nombre y la edad de un participante
	 si la edad es mayor o igual a 18 y menor o igual a 29, mostrar un mensaje 
	 que diga "felicidades + nombreIngresado, estas aceptado en el programa 
	 de generation Java Full Stack".
	 En caso de no cumplirse la condicion, mostrar un mensaje que diga "no
	 cumples los requisitos para el bootcamp Java Full Stack" 
	 */
	Scanner leerNombre = new Scanner(System.in);
	System.out.println("ingresa tu nombre");
	String nombre  = leerNombre.next();
	
	Scanner leerEdad = new Scanner(System.in);
	System.out.println("ingressa tu edad");
	int edad =  leerEdad.nextInt();
	String mensaje = felicidades(nombre,edad);
	System.out.println(mensaje);
	
	}
	public static String felicidades(String nombre,int edad) {
		String mensaje = "";
		if (edad >= 18 & edad<=29) {
			mensaje = "Felicidades "+nombre+ " cumples con los requisitos ";
		}else {
			mensaje = "no cumples con los requisitos";
		}
		return mensaje;
		
	/*este es de la votacion
	 * public static String votar(int edad) {
		
		String mensaje = "";
		if(edad >= 18) {
			mensaje =  "felicidades, puedes votar";
		} else {
			mensaje = "no puedes votar";
		}
		return mensaje;*/
	


  }

}


