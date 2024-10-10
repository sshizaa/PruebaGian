package Test;
import Modelo.Medico;
import Modelo.Paciente;

public class TestConsultorio1 {
	static Medico medico = new Medico("Daniel", "Lopez", "Clinico");
	static Paciente paciente1 = new Paciente("Jose", "Perez", 1.68, 76);
	static Paciente paciente2 = new Paciente("Jorge", "Fernandez", 1.8, 114);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Medico: " + medico.getNombre() + " " + medico.getApellido());
		System.out.println("Paciente " + paciente1.getNombre() + " " + paciente1.getApellido() + ": " + medico.CalcularIMC(paciente1) );
		System.out.println("Paciente " + paciente2.getNombre() + " " + paciente2.getApellido() + ": " + medico.CalcularIMC(paciente2) );
        
	}

}
