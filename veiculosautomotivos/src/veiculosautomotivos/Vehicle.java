package veiculosautomotivos;

public class Vehicle { // usa valor de retorno

	int passengers; // número de passageiros;
	int fuelcap; // capacidade de armazenamento de combustível em galões;
	int mpg; // consumo de combustível em milhas por galão

	// exibe a autonomia 
	int range () {
		return mpg * fuelcap;
	}
}
