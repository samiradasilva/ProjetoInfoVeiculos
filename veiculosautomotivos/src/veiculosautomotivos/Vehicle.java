package veiculosautomotivos;

public class Vehicle { // usa valor de retorno

	int passengers; // n�mero de passageiros;
	int fuelcap; // capacidade de armazenamento de combust�vel em gal�es;
	int mpg; // consumo de combust�vel em milhas por gal�o

	// exibe a autonomia 
	int range () {
		return mpg * fuelcap;
	}
}
