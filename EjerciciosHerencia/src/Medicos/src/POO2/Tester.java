package POO2;

public class Tester {
    public static void main(String[] args) {
        Medico medico = new Medico();
        CentroSalud centroSalud = new CentroSalud();
        MedicoCentroSalud mcs = new MedicoCentroSalud();
        MedicoAsistenciaDomiciliaria mad = new MedicoAsistenciaDomiciliaria();
        Lector sc = new Lector();

        //Array de medicos

        Medico medicos[] = new Medico[25];
        //
        boolean fin = false;


        //System.out.println(medico.generadorNombres());
        while (!fin) {

            System.out.println("Que operación desea realizar");
            System.out.println("Nuevo medico, mostrar medico, medico asistencia domiciliaria");
            String seleccion = sc.nextLine();

            switch (seleccion.toLowerCase()) {

                case "nuevo medico":
                    System.out.println("¿Cuantos medicos desea crear?");
                    int numero = sc.nextInt();

                    for (int i = 0; i < numero; i++) {
                        medicos[i] = new Medico(medico.generarNombres(), medico.generarEdad(), (char) medico.generarSexo(), medico.generarHoras(), 11.0);

                    }
                    System.out.println("Médicos generado/s con éxito");

                    break;

                case "mostrar medico":
                    for (int i = 0; i < medicos.length; i++) {
                        if (medicos[i] != null) {
                            System.out.println(medicos[i]);
                        } else if (medicos[i] == null && i == 0) {
                            System.out.println("SIn informacion");
                        }
                    }
                    break;

                case "medico asistencia domiciliaria":


                    System.out.println("Introduzca la distancia en km");
                    double km = sc.nextDouble();
                    mad.setKmVisitas(km);


                    for (int i = 0; i < medicos.length; i++) {
                        if (medicos[i] != null) {
                            System.out.println(medicos[i]);
                        }
                    }
                case "calcular salario":

                    break;

                case "centro salud":

                  mcs = new MedicoCentroSalud(mcs.generarIdentificador(),mcs.generaNombres(),mcs.generaNombres(),mcs.generarCodPostal());

                    System.out.println(mcs);
                    break;
                case "salir":
                    fin = true;

                    break;
                default:
                    System.out.println("Operación no válida");
            }

        }
    }
}
