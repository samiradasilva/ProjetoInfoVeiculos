package veiculosautomotivos;

public class RetMeth {

	public static void main(String[] args) {

		Vehicle minivan = new Vehicle(0, 0, 0);
		Vehicle sportcar = new Vehicle(0, 0, 0);

		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;

		// obtém as autonomias e atribui o valor retornado a uma variável
		int range1 = minivan.range();
		int range2 = sportcar.range();

		System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1 + " miles");

		System.out.println("Sportcar can carry " + sportcar.passengers + " with range of " + range2 + " miles");

	}

}
//Resultado no console: Minivan can carry 7 with a range of 336 miles
//Resultado no console: Sportcar can carry 2 with a range of 168 miles