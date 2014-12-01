import java.util.ArrayList;


public class Leche {


	private double eurosLitro;

	private String tipo, procedencia;

	private ArrayList<Distribuidor> distribuidor;



	public void setTipo(String tipo){

	this.tipo = tipo;
	}

	public  String getTipo()
	{
	return tipo;
	}


	public  void setProcedencia(String procedencia){

	this.procedencia = procedencia;
	}

	public  String getProcedencia()
	{
	return procedencia;
	}



	public  void setEurosULitro (double eurosLitro){

	this.eurosLitro = eurosLitro;
	}

	public  double getEurosLitro()
	{
	return eurosLitro;
	}


	public  void setDistribuidor (ArrayList<Distribuidor>  distribuidor){

	this.distribuidor = distribuidor;
	}

	public  ArrayList<Distribuidor> getDistribuidor()
	{
	return distribuidor;
	}
}