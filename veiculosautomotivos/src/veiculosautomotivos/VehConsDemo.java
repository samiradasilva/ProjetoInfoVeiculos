package veiculosautomotivos;

public class VehConsDemo {

	public static void main(String[] args) {

		// constrói veículos completos
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportcar = new Vehicle(2, 14, 12);
		double gallons;
		int dist = 252;

		gallons = minivan.fuelneeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

		gallons = sportcar.fuelneeded(dist);
		System.out.println("To go " + dist + " miles sportcar needs " + gallons + " gallons of fuel.");

	}

}
//Resultado no console: To go 252 miles minivan needs 12.0 gallons of fuel.
//Resultado no console: To go 252 miles sportcar needs 21.0 gallons of fuel.