package clases;

public class auto extends vehiculo implements acciones{
	private int cantidadpuertas;
	public static int cantidad=0;
	public auto() {
		super();
		cantidad=cantidad+1;
	}
	public auto( String marca,String modelo,String matricula,double tanque,double consumo,int cantidadpuertas) {
		super(marca,modelo,matricula,tanque,consumo);
		this.cantidadpuertas=cantidadpuertas;
		cantidad=cantidad+1;
	}
	@Override
	public void estado() {
		System.out.println("El auto Marca :"+this.marca);
		System.out.println("Modelo :"+this.modelo);
		System.out.println("Matricula :"+this.matricula);
		System.out.println("Tanque :"+this.tanque+" litros");
		System.out.println("Puertas :"+this.cantidadpuertas);
		
	}
	@Override
	public void arrancar() {
		System.out.println("El auto marca "+this.marca+" modelo "+this.modelo+" matricula "+matricula+" se ha encendido");
	}
	@Override
	public void parar() {
		System.out.println("El auto marca "+this.marca+" modelo "+this.modelo+" matricula "+matricula+" se ha parado");
	}
	@Override
	public void recorrerciudada() {
		System.out.println("El auto Marca "+marca+" Modelo "+this.modelo+" Matricula "+this.matricula);
		System.out.println("Recorre la ciudad a, consume "+calculoconsumo.consumociudada(this.consumo)+" litros");
		this.tanque=this.tanque-calculoconsumo.consumociudada(this.consumo);
		System.out.println("Tanque :"+this.tanque+" litros");
	}
	@Override
	public void recorrerciudadb() {
		System.out.println("El auto Marca "+marca+" Modelo "+this.modelo+" Matricula "+this.matricula);
		System.out.println("Recorre la ciudad b, consume "+calculoconsumo.consumociudadb(this.consumo)+" litros");
		this.tanque=this.tanque-calculoconsumo.consumociudadb(this.consumo);
		System.out.println("Tanque :"+this.tanque+" litros");
	}
	@Override
	public void recorrerplaya() {
		System.out.println("El auto Marca "+marca+" Modelo "+this.modelo+" Matricula "+this.matricula);
		System.out.println("Recorre la playa, consume "+calculoconsumo.consumoplaya(this.consumo)+" litros");
		this.tanque=this.tanque-calculoconsumo.consumoplaya(this.consumo);
		System.out.println("Tanque :"+this.tanque+" litros");
	}
	
	
}
