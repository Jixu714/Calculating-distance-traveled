package trabajofinal;
import clases.*;
public class Test {
	public static void main(String[] args) {
		
		auto a2= new auto("Renauld","Kwid","aa234ss",100,0.065,5);
		auto a3= new auto("Volkswagen","Escarabajo","ab199aa",40,0.07,3);
		moto m1=new moto("Honda","XR105L","ww334as",12,0.31,"Postura Standar");
		moto m2= new moto("Yamaha","xv 125 virago 2000","ww123aa",9,0.03,"Postura de crucero");
		System.out.println("Cantidad de autos :"+auto.cantidad);
		System.out.println("Cantidad de motos :"+moto.cantidad);
		a2.estado();
		a3.estado();
		a2.arrancar();
		a3.arrancar();
		a2.recorrerplaya();
		a2.parar();
		a3.recorrerciudadb();
		a3.parar();
		m1.estado();
		m2.estado();
		m1.arrancar();
		m2.arrancar();
		m1.recorrerciudada();
		m1.parar();
		m2.recorrerplaya();
		m2.parar();
	}
	

}
