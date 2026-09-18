package mx.edu.utng;
public class RepasoArreglos2{

	public static void main(String[] args) {
		String[] nombres[] = new String[7][3];
		nombres[0][0] = "Jonathan Venancio";
		nombres[0][1] = "Aguilar Hernandez";
		nombres[0][2] = "18";

		nombres[1][0] = "José Emmanuel";
		nombres[1][1] = "Arredondo Escalante";
		nombres[1][2] = "22";

		nombres[2][0] = "Yaneli";
		nombres[2][1] = "Sánchez Cárdenas";
		nombres[2][2] = "19";
		
		System.out.println("Nombres");
		System.out.println(nombres[0][0]);
		System.out.println(nombres[1][0]);
		System.out.println(nombres[2][0]);

		System.out.println("");
				
		System.out.println("Apellidos");
		System.out.println(nombres[0][1]);
		System.out.println(nombres[1][1]);
		System.out.println(nombres[2][1]);

		
	}
	
}