package veiculosautomotivos;

public class VehicleDemo {

	public static void main(String[] args) {

		Vehicle minivan = new Vehicle(); //classe que declara um objeto de tipo Vehicle (Veículo)
		int range;

		// atribui valores a campos de minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// calcula a autonomia presumindo um tanque cheio de gasolina
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passengers + " with a range os " + range);

	}
}
//Resultado no console: Minivan can carry 7 with a range of 336