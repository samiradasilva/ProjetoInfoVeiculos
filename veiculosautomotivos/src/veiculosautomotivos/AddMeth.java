package veiculosautomotivos;

public class AddMeth {

	public static void main(String[] args) {
		
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		
		// atribui valores a campos de minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		// atribui valores a campos de sportcar
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;

		System.out.print("Minivan can carry " + minivan.passengers + ". ");
		minivan.range(); // exibe a autonomia de minivan
		
		System.out.print("Sportcar can carry " + sportcar.passengers + ". ");
		sportcar.range(); // exibe a autonomia de sportcar
	}

}
