import javax.swing.JOptionPane;

public class App7 {
        private int eleccion;
        private int menu_terrestre;
        private int menu_aereo;
        private int opcion_cuzco;
        private int opcion_juliaca;
        private int opcion_arequipa;
        private int opcion_tacna;
        private int opcion_chimbote;
        private int opcion_ayacucho;
        private int pasajes;
        private double costo_final;

        public void forma_viaje() {
                // tipo de viaje

                eleccion = Integer.parseInt(JOptionPane.showInputDialog(
                                "¿De que forma va a viajar? \n" +
                                                "Opción 1: Terrestre \n" +
                                                "Opción 2: Aéreo \n" +
                                                "Eliga su opción"));

        }

        // menu

        public void despliegue_menu() {
                if (eleccion == 1) {
                        menu_terrestre = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Destinos disponibles en transporte terrestre \n" +
                                                        "Opción 1: Cuzco \n" +
                                                        "Opción 2: Juliaca \n" +
                                                        "Opción 3: Arequipa \n" +
                                                        "Eliga su opción"));
                        switch (menu_terrestre) {
                                case 1:
                                        opcion_cuzco = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Empresas de transporte disponibles para Cuzco \n" +
                                                                        "Opción 1: El Emperador \n" +
                                                                        "Opción 2: Las Flores \n" +
                                                                        "Eliga su opción"));
                                        switch (opcion_cuzco) {
                                                case 1:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 45;
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Lo que tiene que pagar por sus " + pasajes
                                                                                        + " pasajes es: S/."
                                                                                        + costo_final);

                                                        break;
                                                case 2:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 65;
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Lo que tiene que pagar por sus " + pasajes
                                                                                        + " pasajes es: S/."
                                                                                        + costo_final);

                                                        break;
                                                default:
                                                        JOptionPane.showMessageDialog(null,
                                                                        "La opción ingresada es incorrecta");
                                                        break;
                                        }

                                        break;
                                case 2:
                                        opcion_juliaca = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Empresas de transporte disponibles para Juliaca \n" +
                                                                        "Opción 1: Movil Bus \n" +
                                                                        "Opción 2: Civa \n" +
                                                                        "Eliga su opción"));
                                        switch (opcion_juliaca) {
                                                case 1:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 105;
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Lo que tiene que pagar por sus " + pasajes
                                                                                        + " pasajes es: S/."
                                                                                        + costo_final);

                                                        break;
                                                case 2:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 95;
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Lo que tiene que pagar por sus " + pasajes
                                                                                        + " pasajes es: S/."
                                                                                        + costo_final);

                                                        break;
                                                default:
                                                        JOptionPane.showMessageDialog(null,
                                                                        "La opción ingresada es incorrecta");
                                                        break;
                                        }

                                        break;
                                case 3:
                                        opcion_arequipa = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Empresas de transporte disponibles para Arequipa \n" +
                                                                        "Opción 1: Soyuz \n" +
                                                                        "Opción 2: Perú Bus \n" +
                                                                        "Eliga su opción"));
                                        switch (opcion_arequipa) {
                                                case 1:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 35;
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Lo que tiene que pagar por sus " + pasajes
                                                                                        + " pasajes es: S/."
                                                                                        + costo_final);

                                                        break;
                                                case 2:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 85;
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Lo que tiene que pagar por sus " + pasajes
                                                                                        + " pasajes es: S/."
                                                                                        + costo_final);

                                                        break;
                                                default:
                                                        JOptionPane.showMessageDialog(null,
                                                                        "La opción ingresada es incorrecta");
                                                        break;
                                        }

                                        break;

                                default:
                                        JOptionPane.showMessageDialog(null, "La opción ingresada es incorrecta");
                                        break;
                        }

                } else if (eleccion == 2) {
                        menu_aereo = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Destinos disponibles en transporte aéreo \n" +
                                                        "Opción 1: Tacna \n" +
                                                        "Opción 2: Chimbote \n" +
                                                        "Opción 3: Ayacucho \n" +
                                                        "Eliga su opción"));
                        switch (menu_aereo) {
                                case 1:
                                        opcion_tacna = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Aerolineas disponibles para Tacna \n" +
                                                                        "Opción 1: Avianca \n" +
                                                                        "Opción 2: LATAM Airlines \n" +
                                                                        "Eliga su opción"));
                                        switch (opcion_tacna) {
                                                case 1:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 150;
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Lo que tiene que pagar por sus " + pasajes
                                                                                        + " pasajes es: S/."
                                                                                        + costo_final);

                                                        break;
                                                case 2:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 215;
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Lo que tiene que pagar por sus " + pasajes
                                                                                        + " pasajes es: S/."
                                                                                        + costo_final);

                                                        break;
                                                default:
                                                        JOptionPane.showMessageDialog(null,
                                                                        "La opción ingresada es incorrecta");
                                                        break;
                                        }

                                        break;
                                case 2:
                                        opcion_chimbote = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Aerolineas disponibles para Chimbote \n" +
                                                                        "Opción 1: Iberia \n" +
                                                                        "Opción 2: Sky Airline \n" +
                                                                        "Eliga su opción"));
                                        switch (opcion_chimbote) {
                                                case 1:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 145;
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Lo que tiene que pagar por sus " + pasajes
                                                                                        + " pasajes es: S/."
                                                                                        + costo_final);

                                                        break;
                                                case 2:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 265;
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Lo que tiene que pagar por sus " + pasajes
                                                                                        + " pasajes es: S/."
                                                                                        + costo_final);

                                                        break;
                                                default:
                                                        JOptionPane.showMessageDialog(null,
                                                                        "La opción ingresada es incorrecta");
                                                        break;
                                        }

                                        break;
                                case 3:
                                        opcion_ayacucho = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Aerolineas disponibles para Ayacucho \n" +
                                                                        "Opción 1: Copa Airlines \n" +
                                                                        "Opción 2: Peruvian Airlines \n" +
                                                                        "Eliga su opción"));
                                        switch (opcion_ayacucho) {
                                                case 1:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 175;
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Lo que tiene que pagar por sus " + pasajes
                                                                                        + " pasajes es: S/."
                                                                                        + costo_final);

                                                        break;
                                                case 2:
                                                        pasajes = Integer.parseInt(
                                                                        JOptionPane.showInputDialog(
                                                                                        "Ingrese la cantidad de pasajes que va a comprar"));
                                                        costo_final = pasajes * 195;
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Lo que tiene que pagar por sus " + pasajes
                                                                                        + " pasajes es: S/."
                                                                                        + costo_final);

                                                        break;
                                                default:
                                                        JOptionPane.showMessageDialog(null,
                                                                        "La opción ingresada es incorrecta");
                                                        break;
                                        }

                                        break;

                                default:
                                        JOptionPane.showMessageDialog(null, "La opción ingresada es incorrecta");
                                        break;
                        }

                } else {
                        JOptionPane.showMessageDialog(null, "La opción ingresada es incorrecta");

                }
        }

}
