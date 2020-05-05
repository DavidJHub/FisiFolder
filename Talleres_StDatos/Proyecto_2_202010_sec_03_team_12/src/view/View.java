package view;

import model.logic.Modelo;

public class View 
{
	/**
	 * Metodo constructor
	 */
	public View()
	{

	}

	public void bienvenida()
	{
		System.out.println(".---.  _                                _    .-. \n"     
				+": .; ::_;                              :_;   : :      \n"
				+":   .'.-. .--. ,-.,-..-..-. .--. ,-.,-..-. .-' : .--. \n"
				+": .; :: :' '_.': ,. :: `; :' '_.': ,. :: :' .; :' .; :\n"
				+":___.':_;`.__.':_;:_;`.__.'`.__.':_;:_;:_;`.__.'`.__.'\n");
		System.out.println("");
	}

	public void printMenu()
	{
		System.out.println("MENU DEL USUARIO");
		System.out.println("1. Cargar datos");
		System.out.println("2.  (1A) Obtener los M comparendos con mayor gravedad.");
		System.out.println("3.  (2A) Buscar los comparendos por mes y d�a de la semana.");
		System.out.println("4.  (3A) Buscar los comparendos que tienen una fecha-hora en un rango y que son de una localidad dada.");
		System.out.println("5.  (1B) Buscar los M comparendos m�s cercanos a la estaci�n de polic�a.");
		System.out.println("6.  (2B) Buscar los comparendos por medio de detecci�n, clase de veh�culo, tipo de servicio y localidad. ");
		System.out.println("7.  (3B) Buscar los comparendos que tienen una latitud en un rango dado y que involucraron un tipo de veh�culo particular.");
		System.out.println("8.  (1C) Visualizar Datos en una Tabla ASCII");
		System.out.println("9.  (2C) El costo de los tiempos de espera hoy en d�a (cola)");
		System.out.println("10. (3C) El costo de los tiempos de espera usando el nuevo sistema");
		System.out.println("11. SALIR");
		System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
	}

	public void printMessage(String mensaje) 
	{
		System.out.println(mensaje);
	}		

	public void printModelo(Modelo modelo)
	{
		// TODO implementar
	}
	
	public void printMenuTipoVeiculo()
	{
		System.out.println("INDIQUE QUE TIPO DE VEICULO QUIERE CONSULTAR:");
		System.out.println(" 1.Automovil");
		System.out.println(" 2.Bicicleta");
		System.out.println(" 3.Bus");
		System.out.println(" 4.Buseta");
		System.out.println(" 5.Camioneta");
		System.out.println(" 6.Campero");
		System.out.println(" 7.Motocicleta");
	}
	
	public void printMenuMedioDeteccion()
	{
		System.out.println("INDIQUE QUE MEDIO DE DETECCION QUIERE CONSULTAR:");
		System.out.println(" 1.Lapiz");
		System.out.println(" 2.DEAP");
	}
	
	public void printMenuTipoServicio()
	{
		System.out.println("INDIQUE QUE TIPO DE SERVICIO QUIERE CONSULTAR:");
		System.out.println(" 1.P�blico");
		System.out.println(" 2.Oficial");
		System.out.println(" 3.Particular");
	}
	
	public void printMenuLocalidad()
	{
		System.out.println("INDIQUE QUE LOCALIDAD QUIERE CONSULTAR:");
		System.out.println(" 1.PUENTE ARANDA");
		System.out.println(" 2.FONTIBON");
		System.out.println(" 3.ENGATIVA");
		System.out.println(" 4.SUBA");
		System.out.println(" 5.USME");
		System.out.println(" 6.CIUDAD BOLIVAR");
		System.out.println(" 7.USAQUEN");
		System.out.println(" 8.BOSA");
		System.out.println(" 9.SAN CRISTOBAL");
		System.out.println(" 10.KENNEDY");
		System.out.println(" 11.CHAPINERO");
		System.out.println(" 12.MARTIRES");
		System.out.println(" 13.BARRIOS UNIDOS");
		System.out.println(" 14.TUNJUELITO");
		System.out.println(" 15.SANTA FE");
		System.out.println(" 16.ANTONIO NARI�O");
	}
}
