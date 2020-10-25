package aula7;

public class Quadrado extends FormaGeometrica {

	private double lado;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void calcularArea() {
		double area = lado * lado;
		System.out.println("Area: "+ area);
	}
	
	public void calcularPerimetro() {
		double perim = lado * 4;
		System.out.println("Perimetro: "+perim);
	}
	
	public void imprimirMedidas() {
		System.out.println("Lado: "+this.lado);
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + "]";
	}
	
	
	
	
}
