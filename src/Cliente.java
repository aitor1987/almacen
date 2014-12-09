import java.util.ArrayList;


public class Cliente {


	private int num_socio, dto;

	private String nombre, apellidos, dni;

	private Direccion direccion;



	public void setNombre(String nombre){

	this.nombre = nombre;
	}

	public  String getNombre()
	{
	return nombre;
	}


	public  void setApellidos(String apellidos){

	this.apellidos = apellidos;
	}

	public  String getApellidos()
	{
	return apellidos;
	}


	public  void setDni(String dni){

	this.dni = dni;
	}

	public  String getDni()
	{
	return dni;
	}


	public  void setNum_socio (int num_socio){

	this.num_socio = num_socio;
	}

	public  int getNum_socio()
	{
	return num_socio;
	}


	public  void setDto (int dto){

	this.dto = dto;
	}

	public  int getDto()
	{
	return dto;
	}

	public  void setDireccion (Direccion  direccion){

	this.direccion = direccion;
	}

	public  Direccion getDireccion()
	{
	return direccion;
	}
}