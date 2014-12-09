import java.io.*;
import java.util.*;

public class Main2 {

	public static void main (String args[]) {

		ArrayList <Cliente> arrayCliente = new ArrayList <Cliente> ();

		try {

			BufferedReader br = new BufferedReader(new FileReader("clientes.txt"));

			String linea = br.readLine();


			String [] cs = null;



			while (linea != null) {


				Cliente cliente = new Cliente ();
				Direccion direccion = new Direccion ();


				cs = linea.split(", ");




				cliente.setNombre(cs[0]);
				cliente.setApellidos(cs[1]);
				cliente.setDni(cs[2]);
				cliente.setNum_socio(Integer.parseInt(cs[3]));
				cliente.setDto(Integer.parseInt(cs[4]));

				direccion.setPoblacion(cs[2]);
				direccion.setCalle(cs[3]);
				direccion.setNumero(Integer.parseInt(cs[4]));


				cliente.setDireccion(direccion);



				arrayCliente.add(cliente);

				linea = br.readLine();
			}

			for(int i=0; i<arrayCliente.size(); i++) {

				System.out.println();
				System.out.println("      ------ DATOS DISTRIBUIDOR " + (i+1) + " ------ \n");

				System.out.println("Nombre Cliente: " + arrayCliente.get(i).getNombre());
				System.out.println("Apellidos Cliente: " + arrayCliente.get(i).getApellidos());
				System.out.println("Dni Cliente: " + arrayCliente.get(i).getDni());
				System.out.println("Numero de socio del Cliente: " + arrayCliente.get(i).getNum_socio());
				System.out.println("Descuento del Cliente: " + arrayCliente.get(i).getDto());


				System.out.println("Dirección: ");

				System.out.println("   Poblacion: " + arrayCliente.get(i).getDireccion().getPoblacion());
				System.out.println("   Calle: " + arrayCliente.get(i).getDireccion().getCalle());
				System.out.println("   Numero: " + arrayCliente.get(i).getDireccion().getNumero());


				System.out.println("--------------------------------");
				System.out.print("");
			}
			
		} catch(IOException e) {
			System.out.println("Error E/S: "+e);
		}
	}

}