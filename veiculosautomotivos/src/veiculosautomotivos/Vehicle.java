package veiculosautomotivos;

public class Vehicle { // usa valor de retorno

	int passengers; // número de passageiros;
	int fuelcap; // capacidade de armazenamento de combustível em galões;
	int mpg; // consumo de combustível em milhas por galão

	// construtor para Vehicle
	Vehicle(int p, int f, int m){
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	// retorna a autonomia
	int range() {
		return mpg * fuelcap;
	}

	// Calcula o combustível necessário p/ cobrir uma determinada distância
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}
