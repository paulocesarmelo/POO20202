package aula7;

public class Circulo extends FormaGeometrica{

	private double raio;
	
	@Override
	public void calcularArea() {
		double area = 3.14 * raio;
		System.out.println("Area: "+area);
	}

	@Override
	public void calcularPerimetro() {
		//TODO
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}
	

}
