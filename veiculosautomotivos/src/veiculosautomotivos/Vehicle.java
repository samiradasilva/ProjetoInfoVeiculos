package veiculosautomotivos;

public class Vehicle { // adiciona range a Vehicle

	int passengers; // n�mero de passageiros;
	int fuelcap; // capacidade de armazenamento de combust�vel em gal�es;
	int mpg; // consumo de combust�vel em milhas por gal�o

	// exibe a autonomia 
	void range () {
		System.out.println("Range is " + fuelcap * mpg);
	}
}
// Resultado no console: Minivan can carry 7. Range is 336
// Resultado no console: Sportcar can carry 2. Range is 336