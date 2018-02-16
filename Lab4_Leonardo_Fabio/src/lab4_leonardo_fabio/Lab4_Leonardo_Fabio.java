package lab4_leonardo_fabio;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_Leonardo_Fabio {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<SeresVivos> seresvivos = new ArrayList();
    private ArrayList<Ingeniero> ingenieros = new ArrayList();
    private ArrayList<MediosdeTransporte> mediosdeTransportes = new ArrayList();
    private ArrayList<Viajes> viajes = new ArrayList();

    public static void main(String[] args) {
        new Lab4_Leonardo_Fabio();
    }

    public Lab4_Leonardo_Fabio() {
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println(""
                    + "1. LogIn\n"
                    + "2. Registro\n"
                    + "3. Salir"
                    + "Ingrese que desea registrar: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    logIn();
                    break;
                case 2:
                    registro();
                    break;
                case 3:
                    System.exit(0);
                default:
            }
            System.out.println("Continua{s/n}: ");
            resp = sc.next().charAt(0);
        }

    }

    private void logIn() {
        System.out.println("Ingrese su correo: ");
        String correo = sc.next();
        System.out.println("Ingrese su contraseña: ");
        String contra = sc.next();
        for (int i = 0; i < ingenieros.size(); i++) {
            if ((ingenieros.get(i).getCorreo().equals(correo)) && (ingenieros.get(i).getContraseña().equals(contra))) {
                Ingeniero ing = ingenieros.get(i);
                int pos = i;
                menuIngeniero();
                break;
            }
        }

    }

    private void MenuMediosTransporte() {
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println(""
                    + "1. Crear Medios Transportes\n"
                    + "2. Modificar Medios Transportes\n"
                    + "3. Eliminar Medios Transporte\n"
                    + "4. Salir\n"
                    + "Ingrese que desea registrar: \n");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    boolean tanquelleno = true;
                    System.out.println("El tanque esta lleno? ");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    int t = sc.nextInt();
                    if (t == 1) {
                        tanquelleno = true;
                    } else if (t == 2) {
                        tanquelleno = false;
                    }
                    System.out.println("Ingrese distancia: ");
                    int distancia = sc.nextInt();
                    System.out.println("Ingrese altitud: ");
                    int altitud = sc.nextInt();
                    System.out.println("Desea crear un: ");
                    System.out.println("1. Aereo Normal");
                    System.out.println("2. Espacial");
                    int opcionmt = sc.nextInt();
                    switch (opcionmt) {
                        case 1:
                            String gasolina = "";
                            System.out.println("Elija Gasolina: ");
                            System.out.println("1. Super");
                            System.out.println("2. Regular");
                            System.out.println("3. Diesel");
                            int opciongaso = sc.nextInt();
                            switch (opciongaso) {
                                case 1:
                                    gasolina = "Super";
                                    break;
                                case 2:
                                    gasolina = "Regular";
                                    break;
                                case 3:
                                    gasolina = "Diesel";
                                    break;
                            }
                            System.out.println("Ingrese pais de Partida");
                            String paispartida = sc.next();
                            System.out.println("Ingrese pais de Llegada");
                            String paisllegada = sc.next();
                            System.out.println("Elija Transporte: ");
                            System.out.println("1. Helicoptero");
                            System.out.println("2. Avion Comercial");
                            int opcionaereo = sc.nextInt();
                            switch (opcionaereo) {
                                case 1:
                                    System.out.println("Ingrese Numero de Helices: ");
                                    int numhelices = sc.nextInt();
                                    System.out.println("Ingrese Numero de Patas: ");
                                    int numpatas = sc.nextInt();
                                    mediosdeTransportes.add(new Helicoptero(numhelices, numpatas, gasolina, paispartida, paisllegada, tanquelleno, distancia, altitud));
                                    break;
                                case 2:
                                    boolean pilotoauto = true;
                                    System.out.println("Ingrese Numero de Pasajeros: ");
                                    int numpasajeros = sc.nextInt();
                                    System.out.println("Ingrese si tiene piloto automatico: ");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    int opcionpilotoauto = sc.nextInt();
                                    if (opcionpilotoauto == 1) {
                                        pilotoauto = true;
                                    } else if (opcionpilotoauto == 2) {
                                        pilotoauto = false;
                                    }
                                    mediosdeTransportes.add(new AvionComercial(numpasajeros, pilotoauto, gasolina, paispartida, paisllegada, tanquelleno, distancia, altitud));
                                    break;
                                default:
                                    System.out.println("error");
                            }
                            break;
                        case 2:
                            String cambustible = "";
                            System.out.println("Elija Gasolina: ");
                            System.out.println("1. Quimico Solido");
                            System.out.println("2. Propolente Liquido");
                            int opcioncombus = sc.nextInt();
                            switch (opcioncombus) {
                                case 1:
                                    gasolina = "Quimico Solido";
                                    break;
                                case 2:
                                    gasolina = "Propolente Liquido";
                                    break;
                            }
                            System.out.println("Ingrese Planeta de Partida");
                            String planetapartida = sc.next();
                            System.out.println("Ingrese pais de Llegada");
                            String planetallegada = sc.next();
                            System.out.println("Elija Transporte: ");
                            System.out.println("1. Nave Espacial");
                            System.out.println("2. Cohete");
                            int opcionespacial = sc.nextInt();
                            switch (opcionespacial) {
                                case 1:
                                    System.out.println("Ingrese Numero de Propulsores: ");
                                    int numhelices = sc.nextInt();
                                    mediosdeTransportes.add(new NaveEspacial(numhelices, cambustible, planetapartida, planetallegada, tanquelleno, distancia, altitud));
                                    break;
                                case 2:
                                    System.out.println("Ingrese Numero de Cohete: ");
                                    int numcohetes = sc.nextInt();
                                    mediosdeTransportes.add(new NaveEspacial(numcohetes, cambustible, planetapartida, planetallegada, tanquelleno, distancia, altitud));
                                    break;
                                default:
                                    System.out.println("error");
                            }
                            break;
                    }
                case 2:
                    System.out.println("---Medios de Transporte---");
                    int contmedios = 1;
                    for (MediosdeTransporte mt : mediosdeTransportes) {
                        System.out.println(contmedios + ") " + mt);
                    }
                    System.out.println("Seleccione Medio de Transporte a Modificar: ");
                    int selec = sc.nextInt() - 1;

                    boolean tanquelleno2 = true;
                    System.out.println("El tanque esta lleno? ");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    int t2 = sc.nextInt();
                    if (t2 == 1) {
                        mediosdeTransportes.get(selec).setTanquelleno(true);
                    } else if (t2 == 2) {
                        mediosdeTransportes.get(selec).setTanquelleno(false);
                    }
                    System.out.println("Ingrese distancia: ");
                    mediosdeTransportes.get(selec).setDistancia(sc.nextInt());
                    System.out.println("Ingrese altitud: ");
                    mediosdeTransportes.get(selec).setAltitud(sc.nextInt());
                    if (mediosdeTransportes.get(selec) instanceof AereoNormal) {
                        System.out.println("Elija Gasolina: ");
                        System.out.println("1. Super");
                        System.out.println("2. Regular");
                        System.out.println("3. Diesel");
                        int opciongaso = sc.nextInt();
                        switch (opciongaso) {
                            case 1:
                                ((AereoNormal) mediosdeTransportes.get(selec)).setGasolina("Super");
                                break;
                            case 2:
                                ((AereoNormal) mediosdeTransportes.get(selec)).setGasolina("Regular");
                                break;
                            case 3:
                                ((AereoNormal) mediosdeTransportes.get(selec)).setGasolina("Disel");
                                break;
                        }
                        System.out.println("Ingrese pais de Partida");
                        ((AereoNormal) mediosdeTransportes.get(selec)).setPaispartida(sc.next());
                        System.out.println("Ingrese pais de Llegada");
                        ((AereoNormal) mediosdeTransportes.get(selec)).setPaisllegada(sc.next());
                        if (((AereoNormal) mediosdeTransportes.get(selec)) instanceof Helicoptero) {
                            System.out.println("Ingrese Numero de Helices: ");
                            ((Helicoptero) ((AereoNormal) mediosdeTransportes.get(selec))).setNumhelice(sc.nextInt());
                            System.out.println("Ingrese Numero de Patas: ");
                            ((Helicoptero) ((AereoNormal) mediosdeTransportes.get(selec))).setNumdepatas(sc.nextInt());
                        } else if (((AereoNormal) mediosdeTransportes.get(selec)) instanceof AvionComercial) {
                            boolean pilotoauto = true;
                            System.out.println("Ingrese Numero de Pasajeros: ");
                            ((AvionComercial) ((AereoNormal) mediosdeTransportes.get(selec))).setNumpasajeros(sc.nextInt());
                            System.out.println("Ingrese si tiene piloto automatico: ");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            int opcionpilotoauto = sc.nextInt();
                            if (opcionpilotoauto == 1) {
                                ((AvionComercial) ((AereoNormal) mediosdeTransportes.get(selec))).setPilotoauto(true);
                            } else if (opcionpilotoauto == 2) {
                                ((AvionComercial) ((AereoNormal) mediosdeTransportes.get(selec))).setPilotoauto(false);
                            }
                        }
                    } else if (mediosdeTransportes.get(selec) instanceof Espacial) {
                        System.out.println("Elija Gasolina: ");
                        System.out.println("1. Quimico Solido");
                        System.out.println("2. Propolente Liquido");
                        int opcioncombus = sc.nextInt();
                        switch (opcioncombus) {
                            case 1:
                                ((Espacial) mediosdeTransportes.get(selec)).setCombustiblle("Quimico Solido");
                                break;
                            case 2:
                                ((Espacial) mediosdeTransportes.get(selec)).setCombustiblle("Propolente Liquido");
                                break;
                        }
                        System.out.println("Ingrese planeta de Partida");
                        ((Espacial) mediosdeTransportes.get(selec)).setPlanetapartida(sc.next());
                        System.out.println("Ingrese planeta de Llegada");
                        ((Espacial) mediosdeTransportes.get(selec)).setPlanetallegada(sc.next());
                        if (((Espacial) mediosdeTransportes.get(selec)) instanceof NaveEspacial) {
                            System.out.println("Ingrese Numero de Propulsores: ");
                            ((NaveEspacial) ((Espacial) mediosdeTransportes.get(selec))).setNumpropulsores(sc.nextInt());
                        } else if (((Espacial) mediosdeTransportes.get(selec)) instanceof Cohete) {
                            System.out.println("Ingrese Numero de Separaciones: ");
                            ((Cohete) ((Espacial) mediosdeTransportes.get(selec))).setNumseparaciones(sc.nextInt());
                        }
                    }
                    break;
                case 3:
                    System.out.println("---Medios de Transporte---");
                    int cont = 1;
                    for (MediosdeTransporte mt : mediosdeTransportes) {
                        System.out.println(cont + ") " + mt);
                        cont++;
                    }
                    System.out.println("Elija que Medio de Transporte Eliminar: ");
                    int borrarpos = sc.nextInt();
                    mediosdeTransportes.remove(borrarpos);
                    break;
                case 4:
                    System.exit(0);
                default:

            }
            System.out.println("Continua{s/n}: ");
            resp = sc.next().charAt(0);
        }
    }

    private void menuIngeniero() {
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println(""
                    + "1. Medios Transportes\n"
                    + "2. Primates\n"
                    + "3. Datos Personales\n"
                    + "4. Salir\n"
                    + "Ingrese que desea registrar: \n");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    MenuMediosTransporte();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                default:
            }
            System.out.println("Continua{s/n}: ");
            resp = sc.next().charAt(0);
        }
    }

}
