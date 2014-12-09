import java.util.ArrayList;


public class Distribuidor {




	private String nombre, cif;

	private Direccion direccion;

	private Contacto contacto;



	public void setNombre(String nombre){

	this.nombre = nombre;
	}

	public  String getNombre()
	{
	return nombre;
	}


	public  void setCif(String cif){

	this.cif = cif;
	}

	public  String getCif()
	{
	return cif;
	}



	public  void setDireccion (Direccion  direccion){

	this.direccion = direccion;
	}

	public  Direccion getDireccion()
	{
	return direccion;
	}


	public  void setContacto (Contacto  Contacto){

	this.contacto = contacto;
	}

	public  Contacto getContacto()
	{
	return contacto;
	}
}