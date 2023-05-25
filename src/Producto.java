/**
 * 
 * @author Jose Gálvez Gómez
 *
 */

public class Producto {

	private String nombre;
	private double precio;

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * Este método sirve para saber el precio final del producto, ya que existen
	 * varias condiciones, si el producto tiene un valor superior a 300 se
	 * incrementa su valor en el 16%, además se le tienen que sumar 10 euros de
	 * gastos de envio.
	 * 
	 * @return el precio final del producto
	 */
	
	public double getPrecioFinal(Producto producto) {

		double precioFinal = this.precio;

		if (precio > 300) {
			precioFinal += precio * 0.16;
		}

		precioFinal += 10;

		return precioFinal;
	}

}
