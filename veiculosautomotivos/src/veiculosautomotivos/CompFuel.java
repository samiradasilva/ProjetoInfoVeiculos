package veiculosautomotivos;

public class CompFuel {

	public static void main(String[] args) {

		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		double gallons;
		int dist = 252;

		// atribui valores a campos de minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// atribui valores a campos de sportcar
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;

		gallons = minivan.fuelneeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

		gallons = sportcar.fuelneeded(dist);
		System.out.println("To go " + dist + " miles sportcar needs " + gallons + " gallons of fuel.");
	}

}
//Resultado no console: To go 252 miles minivan needs 12.0 gallons of fuel.
//Resultado no console: To go 252 miles sportcar needs 21.0 gallons of fuel.