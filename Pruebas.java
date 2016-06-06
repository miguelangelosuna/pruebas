import java.util.Calendar;


public class Pruebas {
	
	
	
	
	
	
public static void main(String[] argumentos){
	
	Calendar otraHora = obtenerOtraHora();
	Calendar horaActual = obtenerHoraActual();
	
	
	if(otraHora.equals(horaActual)){
		System.out.println("Son iguales");
	}else if (otraHora.before(horaActual)){
		System.out.println("Otra hora es menor que la actual");
	}else{
		System.out.println("Otra hora es mayor que la actual");
	}
	
			
			
	System.out.println("La hora actual es:" + horaActual.getTime() + " la otra hora es: " + otraHora.getTime());
}

private static Calendar obtenerHoraActual(){
	
	Calendar calendar = Calendar.getInstance();
	return calendar;
}

private static Calendar obtenerOtraHora(){
	
	Calendar calendar = Calendar.getInstance();
	calendar.set(2013, 10, 8);
	
	return calendar;
}
}