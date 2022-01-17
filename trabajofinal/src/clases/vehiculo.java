package clases;

public abstract class vehiculo {
	protected String marca;
	protected String modelo;
	protected String matricula;
	protected double tanque;
	protected double consumo;
	
	public vehiculo() {
		
	}
	public vehiculo(String marca, String modelo,String matricula,double tanque, double consumo) {
		this.marca=marca;
		this.modelo=modelo;
		this.matricula=matricula;
		this.tanque=tanque;
		this.consumo=consumo;
	}
	public abstract void estado();
}
