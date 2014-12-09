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
				distribuidor.setCif(cs[1]);


				direccion.setPoblacion(cs[2]);
				direccion.setCalle(cs[3]);
				direccion.setNumero(Integer.parseInt(cs[4]));


				contacto.setDni(cs[5]);
				contacto.setNombre(cs[6]);
				contacto.setApellido(cs[7]);



				distribuidor.setDireccion(direccion);
				distribuidor.setContacto(contacto);


				arrayDistribuidor.add(distribuidor);

				linea = br.readLine();
			}

			for(int i=0; i<arrayDistribuidor.size(); i++) {

				System.out.println();
				System.out.println("      ------ DATOS DISTRIBUIDOR " + (i+1) + " ------ \n");

				System.out.println("Nombre Distribuidor: " + arrayDistribuidor.get(i).getNombre());
				System.out.println("C.I.F.: " + arrayDistribuidor.get(i).getCif());

				System.out.println("Dirección: ");

				System.out.println("   Poblacion: " + arrayDistribuidor.get(i).getDireccion().getPoblacion());
				System.out.println("   Calle: " + arrayDistribuidor.get(i).getDireccion().getCalle());
				System.out.println("   Numero: " + arrayDistribuidor.get(i).getDireccion().getNumero());


				System.out.println("Contacto de Persona: ");
				System.out.println("   DNI: " + arrayDistribuidor.get(i).getContacto().getDni());
				System.out.println("   Nombre: " + arrayDistribuidor.get(i).getContacto().getNombre());
				System.out.println("   Apellido: " + arrayDistribuidor.get(i).getContacto().getApellido());

				System.out.println("--------------------------------");
				System.out.print("");
			}
			
		} catch(IOException e) {
			System.out.println("Error E/S: "+e);
		}



		Scanner sc = new Scanner (System.in);

		System.out.println();

		// Manzanas

		ArrayList <Manzana> arrayManzana = new ArrayList <Manzana> ();

		System.out.println("      ------ MANZANAS ------ \n");
		System.out.println("A continuación, introduciremos dos manzanas.");


			for (int m=1; m<=2; m++) {

			Manzana manzana = new Manzana ();
			// Para enviar el nombre del distribuidor
			Distribuidor distribuidor = new Distribuidor();

			System.out.print("Introduce el tipo de manzana: ");
			manzana.setTipoManzana(sc.next());

			System.out.print("Procedencia: ");
			manzana.setProcedencia(sc.next());

			System.out.print("Color: ");
			manzana.setColor(sc.next());

			System.out.print("Introduce el precio por kilo: ");
			manzana.setEurosKilo(sc.nextDouble());

			System.out.print("Introduce el distribuidor de la manzana: ");
			//manzana.setDistribuidor(sc.next());
			String distribuidorm = sc.next();
			distribuidor.setNombre(distribuidorm);

					for(int q=0; q<arrayDistribuidor.size(); q++) {

				// Si el nombre del distribuidor introducido coincide con uno del arraylist (distribuidores.txt)
				if (distribuidorm.equalsIgnoreCase(arrayDistribuidor.get(q).getNombre())) {

					//le asignamos el valor del distribuidor al objeto manzana
					manzana.setDistribuidor(arrayDistribuidor.get(q));
				}
			}

			// Añadimos el objeto "manzana" al ArrayList "arrayManzana"
			arrayManzana.add(manzana);

			System.out.println();
		}

		for(int mm=0; mm<arrayManzana.size(); mm++) {

			System.out.println();
			System.out.println("      ------ DATOS MANZANA " + (mm+1) +" Y DISTRIBUIDOR ------ \n");

			System.out.println("Tipo de manzana: "+arrayManzana.get(mm).getTipoManzana() );
            System.out.println("Procedencia: "+arrayManzana.get(mm).getProcedencia());
            System.out.println("Color : "+arrayManzana.get(mm).getColor() );
            System.out.println("Euros Kilo: "+arrayManzana.get(mm).getEurosKilo());

            System.out.println();


                      // // Manzana.java (Distribuidor) -- Distribuidor.java (Nombre)
			System.out.println("Nombre Distribuidor: " + arrayManzana.get(mm).getDistribuidor().getNombre());
			System.out.println("C.I.F.: " + arrayManzana.get(mm).getDistribuidor().getCif());

			System.out.println("Dirección: ");


			System.out.println("   Poblacion: " + arrayManzana.get(mm).getDistribuidor().getDireccion().getPoblacion());
			System.out.println("   Calle: " + arrayManzana.get(mm).getDistribuidor().getDireccion().getCalle());
			System.out.println("   Numero: " + arrayManzana.get(mm).getDistribuidor().getDireccion().getNumero());



			System.out.println("Contacto de Persona: ");
			// Manzana.java (Distribuidor) -- Distribuidor.java (Nombre, PersonaContacto) -- Contacto.java (Dni)
			System.out.println("   DNI: " + arrayManzana.get(mm).getDistribuidor().getPersonaContacto().getDni());
			System.out.println("   Nombre: " + arrayManzana.get(mm).getDistribuidor().getPersonaContacto().getNombre());
			System.out.println("   Apellido: " + arrayManzana.get(mm).getDistribuidor().getPersonaContacto().getApellido());

			System.out.println("--------------------------------");
			System.out.print("");
		}


			// Lechuga

		ArrayList <Lechuga> arrayLechuga = new ArrayList <Lechuga> ();

		System.out.println("\n      ------ LECHUGA ------ \n");
		System.out.println("A continuación, introduciremos una lechuga.");

		for (int l=0; l<1; l++) {

			Lechuga lechuga = new Lechuga ();
			// Para enviar el nombre del distribuidor
			Distribuidor distribuidor = new Distribuidor();

			System.out.print("Introduce el tipo de Lechuga: ");
			lechuga.setTipoLechuga(sc.next());

			System.out.print("Procedencia: ");
			lechuga.setProcedencia(sc.next());

			System.out.print("Color: ");
			lechuga.setColor(sc.next());

			System.out.print("Introduce el precio por unidad: ");
			lechuga.setEurosUnidad(sc.nextDouble());

			System.out.print("Introduce el distribuidor de la Lechuga: ");
			String distribuidorl = sc.next();
			distribuidor.setNombre(distribuidorl);

			for (int q=0; q<arrayDistribuidor.size(); q++) {

				if (distribuidorl.equalsIgnoreCase(arrayDistribuidor.get(q).getNombre())) {

					lechuga.setDistribuidor(arrayDistribuidor.get(q));
				}
			}

			arrayLechuga.add(lechuga);

			System.out.println();
		}

		for(int ll=0; ll<arrayLechuga.size(); ll++) {

			System.out.println();
			System.out.println("      ------ DATOS LECHUGA " + (ll+1) +" Y DISTRIBUIDOR ------ \n");

			System.out.println("Tipo de lechuga: "+arrayLechuga.get(ll).getTipoLechuga() );
            System.out.println("Procedencia: "+arrayLechuga.get(ll).getProcedencia());
            System.out.println("Color : "+arrayLechuga.get(ll).getColor() );
            System.out.println("Euros Unidad: "+arrayLechuga.get(ll).getEurosUnidad());

            System.out.println();


                    // Lechuga.java (Distribuidor) -- Distribuidor.java (Nombre)
			System.out.println("Nombre Distribuidor: " + arrayLechuga.get(ll).getDistribuidor().getNombre());
			System.out.println("C.I.F.: " + arrayLechuga.get(ll).getDistribuidor().getCif());

			System.out.println("Dirección: ");

			System.out.println("   Poblacion: " + arrayLechuga.get(ll).getDistribuidor().getDireccion().getPoblacion());
			System.out.println("   Calle: " + arrayLechuga.get(ll).getDistribuidor().getDireccion().getCalle());
			System.out.println("   Numero: " + arrayLechuga.get(ll).getDistribuidor().getDireccion().getNumero());


			System.out.println("Contacto de Persona: ");
			// Lechuga.java (Distribuidor) -- Distribuidor.java (Nombre, PersonaContacto) -- Contacto.java (Dni)
			System.out.println("   DNI: " + arrayLechuga.get(ll).getDistribuidor().getPersonaContacto().getDni());
			System.out.println("   Nombre: " + arrayLechuga.get(ll).getDistribuidor().getPersonaContacto().getNombre());
			System.out.println("   Apellido: " + arrayLechuga.get(ll).getDistribuidor().getPersonaContacto().getApellido());

			System.out.println("--------------------------------");
			System.out.print("");
		}



			// Leche

		ArrayList <Leche> arrayLeche = new ArrayList <Leche> ();

		System.out.println("\n      ------ LECHES ------ \n");
		System.out.println("A continuación, introduciremos dos leches.");

		for (int le=0; le<2; le++) {

			Leche leche = new Leche ();
			// Para enviar el nombre del distribuidor
			Distribuidor distribuidor = new Distribuidor ();

			System.out.print("Introduce el tipo de Leche: ");
			leche.setTipo(sc.next());

			System.out.print("Procedencia: ");
			leche.setProcedencia(sc.next());

			System.out.print("Introduce el precio por litro: ");
			leche.setEurosLitro(sc.nextDouble());

			System.out.print("Introduce el distribuidor de la Leche: ");
			String distribuidorle = sc.next();
			distribuidor.setNombre(distribuidorle);

			for (int q=0; q<arrayDistribuidor.size(); q++) {

				if (distribuidorle.equalsIgnoreCase(arrayDistribuidor.get(q).getNombre())) {

					leche.setDistribuidor(arrayDistribuidor.get(q));
				}
			}

			arrayLeche.add(leche);

			System.out.println();
		}

		for (int lee=0; lee<arrayLeche.size(); lee++) {

			System.out.println();
			System.out.println("      ------ DATOS LECHE " + (lee+1) +" Y DISTRIBUIDOR ------ \n");

			System.out.println("Tipo de leche: "+arrayLeche.get(lee).getTipo() );
            System.out.println("Procedencia: "+arrayLeche.get(lee).getProcedencia());
            System.out.println("Euros Unidad: "+arrayLeche.get(lee).getEurosLitro());

            System.out.println();

            // Leche.java (Distribuidor) -- Distribuidor.java (Nombre)
			System.out.println("Nombre Distribuidor: " + arrayLeche.get(lee).getDistribuidor().getNombre());
			System.out.println("C.I.F.: " + arrayLeche.get(lee).getDistribuidor().getCif());

			System.out.println("Dirección: ");


			System.out.println("   Poblacion: " + arrayLeche.get(lee).getDistribuidor().getDireccion().getPoblacion());
			System.out.println("   Calle: " + arrayLeche.get(lee).getDistribuidor().getDireccion().getCalle());
			System.out.println("   Numero: " + arrayLeche.get(lee).getDistribuidor().getDireccion().getNumero());


			System.out.println("Contacto de Persona: ");
			// Leche.java (Distribuidor) -- Distribuidor.java (Nombre, PersonaContacto) -- Contacto.java (Dni)
			System.out.println("   DNI: " + arrayLeche.get(lee).getDistribuidor().getPersonaContacto().getDni());
			System.out.println("   Nombre: " + arrayLeche.get(lee).getDistribuidor().getPersonaContacto().getNombre());
			System.out.println("   Apellido: " + arrayLeche.get(lee).getDistribuidor().getPersonaContacto().getApellido());

			System.out.println("--------------------------------");
			System.out.print("");
		}



	}
}