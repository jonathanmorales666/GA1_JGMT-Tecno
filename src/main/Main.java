package main;

import hospital.modelo.Consulta;
import hospital.modelo.Medicamento;
import hospital.modelo.Medico;
import hospital.modelo.Paciente;
import hospital.modelo.Receta;
import hospital.modelo.Sala;

public class Main {

    public static void main(String[] args) {

        // --- Sala ---
        Sala sala = new Sala(101, "Consulta General", 10);
        System.out.println(sala);
        System.out.println("Disponible: " + sala.verificarDisponibilidad());

        System.out.println("---------------------------");

        // --- Médico ---
        Medico medico = new Medico("Carlos López", "1234567890101", "55551234",
                                   "COL-5890", "Medicina General", sala);
        medico.identificarse();
        medico.diagnosticar();

        System.out.println("---------------------------");

        // --- Paciente ---
        Paciente paciente = new Paciente("Ana García", "9876543210101", "55559876",
                                         "Historial limpio", "O+");
        paciente.identificarse();
        paciente.describirSintomas();

        System.out.println("---------------------------");

        // --- Medicamento ---
        Medicamento med1 = new Medicamento("Paracetamol", "500mg cada 8h", 15.50);
        Medicamento med2 = new Medicamento("Amoxicilina",  "250mg cada 12h", 32.00);
        System.out.println(med1.obtenerInfo());
        System.out.println(med2.obtenerInfo());

        System.out.println("---------------------------");

        // --- Receta ---
        Receta receta = new Receta("13/04/2026", "Tomar con agua y alimentos");
        receta.agregarMedicamento(med1);
        receta.agregarMedicamento(med2);
        receta.imprimirReceta();

        System.out.println("---------------------------");

        // --- Consulta ---
        Consulta consulta = new Consulta("13/04/2026", "10:30", 250.00, medico, paciente);
        consulta.setReceta(receta);
        consulta.generarRecibo();
    }
}