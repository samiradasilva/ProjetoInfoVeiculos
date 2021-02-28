package veiculosautomotivos;

public class TwoVehicles {

	public static void main(String[] args) {

		//classe que declara um objeto de tipo Vehicle (Veículo)
		Vehicle minivan = new Vehicle(0, 0, 0);
		Vehicle sportcar = new Vehicle(0, 0, 0);
		int range1, range2;

		// atribui valores a campos de minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// atribui valores a campos de sportcar
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;

		// calcula a autonomia presumindo um tanque cheio de gasolina
		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportcar.fuelcap * sportcar.mpg;

		System.out.println("Minivan can carry " + minivan.passengers + " with a range os " + range1);
		System.out.println("Sportcar can carry " + sportcar.passengers + " with a range os " + range2);

	}
}
// Resultado no console: Minivan can carry 7 with a range of 336
// Resultado no console: Sportcar can carry 2 with a range of 168