import java.io.IOException;

public class ejercicio1 {

	public static void main  (String args[])throws IOException{

		try {
			
			String msj = "Hola mundo";
			
			int msjFinal = Integer.parseInt(msj);
			
			System.out.println("Tu mensaje: " + msj);
		}catch(Exception e) {
			System.out.println("No se puede convertir un String a entero :D");

		}

	}
}





