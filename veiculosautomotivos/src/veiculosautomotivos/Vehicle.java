package veiculosautomotivos;

public class Vehicle { // adiciona range a Vehicle

	int passengers; // número de passageiros;
	int fuelcap; // capacidade de armazenamento de combustível em galões;
	int mpg; // consumo de combustível em milhas por galão

	// exibe a autonomia 
	void range () {
		System.out.println("Range is " + fuelcap * mpg);
	}
}
// Resultado no console: Minivan can carry 7. Range is 336
// Resultado no console: Sportcar can carry 2. Range is 336