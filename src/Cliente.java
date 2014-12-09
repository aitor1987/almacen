import java.util.ArrayList;


public class Cliente {


	private double num_socio, dto;

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


	public  void setNum_socio (double num_socio){

	this.num_socio = num_socio;
	}

	public  double getNum_socio()
	{
	return num_socio;
	}


	public  void setDto (double dto){

	this.dto = dto;
	}

	public  double getDto()
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