import java.util.ArrayList;


public class Manzana {


	private double eurosKilo;

	private String tipoManzana, procedencia, color;

	private ArrayList<Distribuidor> distribuidor;



	public void setTipoManzana(String tipoManzana){

	this.tipoManzana = tipoManzana;
	}

	public  String getTipoManzana()
	{
	return tipoManzana;
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


	public  void setEurosKilo (double eurosKilo){

	this.eurosKilo = eurosKilo;
	}

	public  double getEurosKilo()
	{
	return eurosKilo;
	}


	public  void setDistribuidor (ArrayList<Distribuidor>  distribuidor){

	this.distribuidor = distribuidor;
	}

	public  ArrayList<Distribuidor> getDistribuidor()
	{
	return distribuidor;
	}
}