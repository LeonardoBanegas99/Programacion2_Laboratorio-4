package lab4_leonardo_fabio;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_Leonardo_Fabio {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<SeresVivos> seresvivos = new ArrayList();
    private ArrayList<Ingeniero> ingenieros = new ArrayList();
    private ArrayList<MediosdeTransporte> mediosdeTransportes = new ArrayList();

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
        for (int i = 0; i < Cline.getEmpresas().size(); i++) {
            if ((Cline.getEmpresas().get(i).getCorreo().equals(correo)) && (Cline.getEmpresas().get(i).getContra().equals(contra))) {
                Empresa ad = ((Empresa) Cline.getEmpresas().get(i));
                int pos = i;
                logInEmpresas(ad, i);
                break;
            }
        }
        for (int i = 0; i < Cline.getPersonas().size(); i++) {
            if ((Cline.getPersonas().get(i).getCorreo().equals(correo))) {
                if (((Administrador) Cline.getPersonas().get(i)).getContrasena().equals(contra)) {
                    Administrador ad = ((Administrador) Cline.getPersonas().get(i));
                    int pos = i;
                    logInAdministrador(ad, pos);
                    break;
                }
                if (((Freelance) Cline.getPersonas().get(i)).getContrasena().equals(contra)) {
                    Freelance fl = ((Freelance) Cline.getPersonas().get(i));
                    int pos = i;
                    logInFreelance(fl, pos);
                    break;
                }
            }
        }

    }

}
