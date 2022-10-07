package primerexamenparcial;
import java.util.*;

public class CalculoDepreciacionActivos {

	public static void main(String[] args) {

		Scanner es=new Scanner(System.in);
			int op;
		
		System.out.println("Por cual metodo desea que se realize la Depreciacion?\n");
		System.out.println("1.Metodo de Linea Recta\n2.Método de la suma de los dígitos por año");
		System.out.println("3.Método de las unidades producidas\n4.Método de reducción de saldo \n=");
		op=es.nextInt();

		

		
			switch(op) {
			case 1:
				System.out.println("Metodo de Linea Recta");
				System.out.println("-----------------------");
				System.out.println("Ingrese el Costo del Activo");
				double CostoActivo=es.nextDouble();
				System.out.println("Ahora la Vida Util de dicho Activo (Meses)");
				double VidaUtil=es.nextDouble();
				
				MetodoDeLineaRecta(CostoActivo, VidaUtil);
				break;
			case 2:
				System.out.println("Método de la suma de los dígitos por anio");
				MetodoDeLaSumaDeLosDigitosPorAnio();				
				break;
			case 3:
				System.out.println("Método de las unidades producidas");
				System.out.println("-----------------------");
				System.out.println("Ingrese el costo del Activo (En este caso Vehiculo) , Porfavor");
				double CostoActivo3=es.nextDouble();
				System.out.println("Ingrese el Valor del desecho");
				double ValordelDesecho3=es.nextDouble();
				System.out.println("Ingrese su Vida Util en Unidades (Kilometros) ");
				double Vidautilenunidades3=es.nextDouble();
				
				Metododelasunidadesproducidas( CostoActivo3, ValordelDesecho3, Vidautilenunidades3);
				
				break;
			case 4:
				System.out.println("Método de reducción de saldo");
				System.out.println("-----------------------");
				System.out.println("Ingrese el Costo del Activo");
				double CostoActivo4=es.nextDouble();
				System.out.println("Ahora la Vida Util de dicho Activo (Meses)");
				double VidaUtil4=es.nextDouble();
				System.out.println("Ingrese el Valor del Desecho");
				double ValordeDesecho4=es.nextDouble();
				
				MetododeReducciondeSaldo(CostoActivo4, VidaUtil4,ValordeDesecho4);


			}
		
				
				
			}//Fin del Main
		
	
	public static double MetodoDeLineaRecta(double CostoActivo,double VidaUtil) {
		
		
		double Cuotadeamortizacion=CostoActivo/VidaUtil;
		System.out.println("Si el costo del activo es"+ CostoActivo+" Este se divide entre la vida util que es "+VidaUtil);
		System.out.println("La depreciacion Mensual del Activo es de :"+ Cuotadeamortizacion);

		return Cuotadeamortizacion;
		
	}

	
	private static void MetodoDeLaSumaDeLosDigitosPorAnio() {
	
	System.out.println("Ni idea");

	}
	
	public static double Metododelasunidadesproducidas(double CostoActivo3, double ValordeDesecho3, double Vidautilenunidades3) {
		
		double Depreciacionanual3=(CostoActivo3-ValordeDesecho3) /Vidautilenunidades3;
		System.out.println("La depreciacion Anual de este activo (Vehiculo) es :"+ Depreciacionanual3);
		return Depreciacionanual3;
	}
	
	public static double MetododeReducciondeSaldo(double CostoActivo4,double VidaUtil4,double ValordeDesecho4) {
		double Cuotadeamortizacion4=CostoActivo4/VidaUtil4;
		Cuotadeamortizacion4=Cuotadeamortizacion4/100;
		Cuotadeamortizacion4=Cuotadeamortizacion4*2;
		
		System.out.println("La depreciacion Mensual del Activo es de :"+ Cuotadeamortizacion4 +"%");
		return Cuotadeamortizacion4;
		
		
	}
}






