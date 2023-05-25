public class Aplicacion {

	/**
	 * @metodo En este método calculamos el factorial de un número, dicho número se
	 *         lo pasamos por parámetro.
	 * @param numero (int)
	 * @return devuelve el resultado del factorial.
	 */

	public int calcularFactorial(int numero) {
		int resultadoFactorial = numero;

		for (int i = numero - 1; i >= 1; i--) {

			resultadoFactorial = resultadoFactorial * i;
		}

		return resultadoFactorial;
	}

}
