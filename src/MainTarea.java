public class MainTarea {
        public static void main(String[] args) {

            // primera tarea
            Tarea tarea1 = new Tarea();
            tarea1.titulo = "Diseñar base de datos";
            tarea1.responsable = "Ana";
            tarea1.horasEstimadas = 4.5;
            tarea1.completada = false;

            // segunda tarea
            Tarea tarea2 = new Tarea();
            tarea2.titulo = "Programar interfaz";
            tarea2.responsable = "Carlos";
            tarea2.horasEstimadas = 8.0;
            tarea2.completada = false;

            //  tercera tarea
            Tarea tarea3 = new Tarea();
            tarea3.titulo = "Escribir documentación";
            tarea3.responsable = "Sofía";
            tarea3.horasEstimadas = 3.0;
            tarea3.completada = false;

            //
            tarea1.completar();

            System.out.println("\nRESULTADOS ");


            tarea1.mostrarInformacion();
            tarea2.mostrarInformacion();
            tarea3.mostrarInformacion();
        }
    }

