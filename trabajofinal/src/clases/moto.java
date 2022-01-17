package clases;

public class moto extends vehiculo implements acciones{
	private String conduccion;
	public static int cantidad=0;
	public moto() {
		super();
		cantidad=cantidad+1;
	}
	public moto(String marca,String modelo,String matricula,double tanque,double consumo,String conduccion) {
		super(marca,modelo,matricula,tanque,consumo);
		this.conduccion=conduccion;
		cantidad=cantidad+1;
		
	}
	@Override
	public void arrancar() {
		System.out.println("La moto marca "+this.marca+" modelo "+this.modelo+" matricula "+matricula+" se ha encendido");
	}

	@Override
	public void parar() {
		System.out.println("La moto marca "+this.marca+" modelo "+this.modelo+" matricula "+matricula+" se ha parado");
		
	}

	@Override
	public void estado() {
		System.out.println("La moto Marca :"+marca);
		System.out.println("Modelo :"+this.modelo);
		System.out.println("Matricula :"+this.matricula);
		System.out.println("conduccion :"+this.conduccion);
		System.out.println("Tanque :"+this.tanque+" litros");
		
	}
	@Override
	public void recorrerciudada() {
		System.out.println("La moto Marca "+marca+" Modelo "+this.modelo+" Matricula "+this.matricula);
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
		this.tanque=this.tanque-calculoconsumo.consumociudada(this.consumo);
		System.out.println("Tanque :"+this.tanque+" litros");
	}

}
