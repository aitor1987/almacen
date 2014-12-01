import java.util.ArrayList;


public class Distribuidor {




	private String nombre, cif;

	private ArrayList<Direccion> direccion;

	private ArrayList<Contacto> contacto;



	public void setNombre(String nombre){

	this.nombre = nombre;
	}

	public  String getNombre()
	{
	return nombre;
	}


	public  void setPCif(String cif){

	this.cif = cif;
	}

	public  String getCif()
	{
	return cif;
	}



	public  void setDireccion (ArrayList<Direccion>  direccion){

	this.direccion = direccion;
	}

	public  ArrayList<Direccion> getDireccion()
	{
	return direccion;
	}


	public  void setContacto (ArrayList<Contacto>  Contacto){

	this.contacto = contacto;
	}

	public  ArrayList<Contacto> getContacto()
	{
	return contacto;
	}
}