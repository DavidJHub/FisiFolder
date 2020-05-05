package model.data_structures;

public interface IMaxColaCP<T> extends Iterable<T> 
{
	/*
	 * Retorna n�mero de elementos presentes en la cola de prioridad.
	 */
	public int darNumElementos();

	/*
	 * Agrega un elemento a la cola de prioridad. Para comparar la prioridad de
	 * dos elementos T se debe usar el comparador "natural" de la clase T.
	 */
	public void agregar(T elemento);

	/*
	 * Saca/atiende el elemento m�ximo en la cola y lo retorna; null en caso de 
	 * cola vac�a.
	 */
	public T sacarMax();

	/*
	 * Obtener el elemento m�ximo (sin sacarlo de la Cola); null en caso de cola 
	 * vac�a.
	 */
	public T darMax();

	/*
	 * Retorna si la cola est� vac�o o no.
	 */
	public boolean esVacia();
}
