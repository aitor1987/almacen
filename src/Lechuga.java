import java.util.ArrayList;


public class Lechuga {


	private double eurosUnidad;

	private String tipoLechuga, procedencia, color;

	private ArrayList<Distribuidor> distribuidor;



	public void setTipoLechuga(String tipoLechuga){

	this.tipoLechuga = tipoLechuga;
	}

	public  String getTipoLechuga()
	{
	return tipoLechuga;
	}


	public  void setProcedencia(String procedencia){

	this.procedencia = procedencia;
	}

	public  String getProcedencia()
	{
	return procedencia;
	}


	public  void setColor(String color){

	this.color = color;
	}

	public  String getColor()
	{
	return color;
	}


	public  void setEurosUnidad (double eurosUnidad){

	this.eurosUnidad = eurosUnidad;
	}

	public  double getEurosUnidad()
	{
	return eurosUnidad;
	}


	public  void setDistribuidor (ArrayList<Distribuidor>  distribuidor){

	this.distribuidor = distribuidor;
	}

	public  ArrayList<Distribuidor> getDistribuidor()
	{
	return distribuidor;
	}
}