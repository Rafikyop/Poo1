
public class Circulo {
	
	//Atributos
	private float radio;
	private float perimeter;
	private float area;
	
	//Metodos
	public void calcularArea() {
		area = (float) (Math.PI * this.radio * this.radio);
	}
	
	public void calcularPerimeter() {
		perimeter = (float) (Math.PI * 2 * this.radio);
	}

	//Getters and Setters
	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public float getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(float perimeter) {
		this.perimeter = perimeter;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}
	
	
}
