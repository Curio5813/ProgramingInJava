package ExerciciosGeekUniversity;


public class Quadrado {
	private float lado;
	private float area;
	private float perimetro;
	
	public Quadrado(float lado) {
		this.lado = lado;
		this.calcularArea();
		this.calcularPerimetro();
	}
	
	public void calcularArea(){
		this.area = this.lado * this.lado;
	}
	public void calcularPerimetro() {
		this.perimetro = 4 * this.lado;
	}
	
	public void imprimir() {
		System.out.println("Lado: " + this.lado);
		System.out.println("Area: " + this.area);
		System.out.println("Perímetro: " + this.perimetro);

	}		
	
}
