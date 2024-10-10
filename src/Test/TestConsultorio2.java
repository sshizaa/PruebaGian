package Test;

import Modelo.Medico;
import Modelo.Paciente;

public class TestConsultorio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TestConsultorio1.paciente1.setEstatura(1.68f);
		TestConsultorio1.paciente2.setEstatura(1.88f);
		
		System.out.println("Medico: " + TestConsultorio1.medico.getNombre() + " " + TestConsultorio1.medico.getApellido());
		System.out.println("Paciente " + TestConsultorio1.paciente1.getNombre() + " " + TestConsultorio1.paciente1.getApellido() + ": " + TestConsultorio1.medico.CalcularIMC(TestConsultorio1.paciente1) );
		System.out.println("Paciente " + TestConsultorio1.paciente2.getNombre() + " " + TestConsultorio1.paciente2.getApellido() + ": " + TestConsultorio1.medico.CalcularIMC(TestConsultorio1.paciente2) );

	}

}
