package util;

public class ConverterMoeda {
	
	public static double IOF = 0.06;

	public static double calculaConversao(double d, double q) {
		return (d * q) + (d * q * IOF);
	}
	
}
