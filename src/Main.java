import java.io.*;
import java.util.*;

public class Main {

	public static void main (String args[]) {

		ArrayList <Distribuidor> arrayDistribuidor = new ArrayList <Distribuidor> ();

		try {

			BufferedReader br = new BufferedReader(new FileReader("distribuidores.txt"));

			String linea = br.readLine();


			String [] cs = null;



			while (linea != null) {


				Distribuidor distribuidor = new Distribuidor ();
				Direccion direccion = new Direccion ();
				Contacto contacto = new Contacto ();

				cs = linea.split(", ");




				distribuidor.setNombre(cs[0]);
				distribuidor.setCif(cscs[1]);


				direccion.setPoblacion(cs[2]);
				direccion.setCalle(cscs[3]);
				direccion.setNumero(Integer.parseInt(cs[4]));


				contacto.setDni(cs[5]);
				contacto.setNombre(cs[6]);
				contacto.setApellido(cs[7]);



				distribuidor.setDireccion(direccion);
				distribuidor.setPersonaContacto(contacto);


				arrayDistribuidor.add(distribuidor);

				linea = br.readLine();
			}

			for(int i=0; i<arrayDistribuidor.size(); i++) {

				System.out.println();
				System.out.println("      ------ DATOS DISTRIBUIDOR " + (i+1) + " ------ \n");

				System.out.println("Nombre Distribuidor: " + arrayDistribuidor.get(i).getNombre());
				System.out.println("C.I.F.: " + arrayDistribuidor.get(i).getCif());

				System.out.println("Dirección: ");

				System.out.println("   Poblacion: " + arrayDistribuidor.get(i).getDireccion().getCiudad());
				System.out.println("   Calle: " + arrayDistribuidor.get(i).getDireccion().getCalle());
				System.out.println("   Numero: " + arrayDistribuidor.get(i).getDireccion().getPiso());


				System.out.println("Contacto de Persona: ");
				System.out.println("   DNI: " + arrayDistribuidor.get(i).getPersonaContacto().getDni());
				System.out.println("   Nombre: " + arrayDistribuidor.get(i).getPersonaContacto().getNombre());
				System.out.println("   Apellido: " + arrayDistribuidor.get(i).getPersonaContacto().getApellido());

				System.out.println("--------------------------------");
				System.out.print("");
			}
			
		} catch(IOException e) {
			System.out.println("Error E/S: "+e);
		}

	}
}