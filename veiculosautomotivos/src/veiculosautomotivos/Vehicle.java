package veiculosautomotivos;

public class Vehicle { // usa valor de retorno

	int passengers; // n�mero de passageiros;
	int fuelcap; // capacidade de armazenamento de combust�vel em gal�es;
	int mpg; // consumo de combust�vel em milhas por gal�o

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

	// Calcula o combust�vel necess�rio p/ cobrir uma determinada dist�ncia
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}
