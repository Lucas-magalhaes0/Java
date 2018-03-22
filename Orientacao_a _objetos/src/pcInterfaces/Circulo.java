package pcInterfaces;

public class Circulo implements AreaCalculavel {
	private double radius;

	public Circulo(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculaArea() {
		
		return radius * radius * Math.PI;
	}

}
