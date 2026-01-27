import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner aris = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("==================================================================================================================");

        System.out.println("  ____  _                           _     _       \n" +
                " | __ )(_) ___ _ ____   _____ _ __ (_) __| | ___  \n" +
                " |  _ \\| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\ \n" +
                " | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) |\n" +
                " |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/ \n" +
                "                                                  ");

        System.out.println("  ____       __             _             _                    _                 _           \n" +
                " |  _ \\ ___ / _|_   _  __ _(_) ___     __| | ___    __ _ _ __ (_)_ __ ___   __ _| | ___  ___ \n" +
                " | |_) / _ \\ |_| | | |/ _` | |/ _ \\   / _` |/ _ \\  / _` | '_ \\| | '_ ` _ \\ / _` | |/ _ \\/ __|\n" +
                " |  _ <  __/  _| |_| | (_| | | (_) | | (_| |  __/ | (_| | | | | | | | | | | (_| | |  __/\\__ \\\n" +
                " |_| \\_\\___|_|  \\__,_|\\__, |_|\\___/   \\__,_|\\___|  \\__,_|_| |_|_|_| |_| |_|\\__,_|_|\\___||___/\n" +
                "                      |___/                                                                  ");

        System.out.println("==================================================================================================================");
        //======================================================================================================
        //======================================================================================================

        Mascota Mascota1 = new Mascota("Lola", "Perro", 3, 5, 7);
        Mascota Mascota2 = new Mascota("Mika", "Gato", 2, 8, 4);
        Mascota Mascota3 = new Mascota("Copi", "Conejo", 1, 3, 9);

        //=================MENÚ======================================================================================================
        //=======================================================================================================================

        int menu;
        int contador = 1;

        do {

            System.out.println("=========================================================================");

            System.out.println("════ ∘◦❁◦∘ ════ MENU ════ ∘◦❁◦∘ ════");
            System.out.println("──── ∗ ⋅◈ DIA " + contador + " ◈⋅ ∗ ────");
            contador++;

            if (Mascota1.hambre>=10){
                System.out.println("xxx Alertea, "+ Mascota1.nombre + "Tiene mucha hambre xxx");
            } else if (Mascota2.hambre>=10) {
                System.out.println("xxx Alertea, "+ Mascota2.nombre + "Tiene mucha hambre xxx");
            } else if (Mascota3.hambre>=10) {
                System.out.println("xxx Alertea, "+ Mascota3.nombre + "Tiene mucha hambre xxx");
            }else{

            }

            System.out.println("1. Ver todas las mascotas");
            System.out.println("2. Alimentar una mascota");
            System.out.println("3. Jugar con una mascota");
            System.out.println("4. Hacer dormir una mascota");
            System.out.println("5. Celebrar cumpleaños de una mascota");
            System.out.println("6. Ver estado del refugio");
            System.out.println("7. Saludar");
            System.out.println("8. Salir");
            System.out.println();
            System.out.println("9. Adoptar");

            System.out.println("════════════════════════════════════════");
            System.out.println("=========================================================================");


            menu = aris.nextInt();
            int elección;

            switch (menu) {


                case 1:

                    System.out.println("============================MASCOTA 1====================================");

                    Mascota1.mostrarEstado();

                    System.out.println("=========================================================================");

                    System.out.println("============================MASCOTA 2====================================");

                    Mascota2.mostrarEstado();

                    System.out.println("=========================================================================");

                    System.out.println("============================MASCOTA 3====================================");

                    Mascota3.mostrarEstado();

                    System.out.println("=========================================================================");

                    break;

                case 2:

                    System.out.println("===========================¿A quién quieres alimentar?====================");
                    System.out.println();
                    System.out.println("1-" + Mascota1.nombre);
                    System.out.println("2-" + Mascota2.nombre);
                    System.out.println("3-" + Mascota3.nombre);
                    System.out.println();
                    System.out.println("=========================================================================");

                    elección = aris.nextInt();

                    switch (elección) {
                        case 1:
                            Mascota1.alimentar();


                            System.out.println();
                            System.out.println("============================Estado Actual================================");

                            Mascota1.mostrarEstado();

                            System.out.println("=========================================================================");

                            break;

                        case 2:
                            Mascota2.alimentar();

                            System.out.println();
                            System.out.println("============================Estado Actual================================");

                            Mascota2.mostrarEstado();

                            System.out.println("=========================================================================");
                            break;

                        case 3:
                            Mascota3.alimentar();

                            System.out.println();
                            System.out.println("============================Estado Actual================================");

                            Mascota3.mostrarEstado();

                            System.out.println("=========================================================================");
                            break;

                    }
                    break;

                case 3:
                    System.out.println("===========================¿Con quién quieres jugar?=====================");
                    System.out.println();
                    System.out.println("1-" + Mascota1.nombre);
                    System.out.println("2-" + Mascota2.nombre);
                    System.out.println("3-" + Mascota3.nombre);
                    System.out.println();
                    System.out.println("=========================================================================");
                    elección = aris.nextInt();

                    switch (elección) {
                        case 1:
                            Mascota1.jugar();


                            System.out.println();
                            System.out.println("============================Estado Actual================================");

                            Mascota1.mostrarEstado();

                            System.out.println("=========================================================================");

                            break;

                        case 2:
                            Mascota2.jugar();

                            System.out.println();
                            System.out.println("============================Estado Actual================================");

                            Mascota2.mostrarEstado();

                            System.out.println("=========================================================================");
                            break;

                        case 3:
                            Mascota3.jugar();

                            System.out.println();
                            System.out.println("============================Estado Actual================================");

                            Mascota3.mostrarEstado();

                            System.out.println("=========================================================================");
                            break;

                    }
                    break;

                case 4:
                    System.out.println("===========================¿Quién se va a dormir?========================");
                    System.out.println("1-" + Mascota1.nombre);
                    System.out.println("2-" + Mascota2.nombre);
                    System.out.println("3-" + Mascota3.nombre);
                    System.out.println("=========================================================================");
                    elección = aris.nextInt();

                    switch (elección) {
                        case 1:
                            Mascota1.dormir();


                            System.out.println();
                            System.out.println("============================Estado Actual================================");

                            Mascota1.mostrarEstado();

                            System.out.println("=========================================================================");

                            break;

                        case 2:
                            Mascota2.dormir();

                            System.out.println();
                            System.out.println("============================Estado Actual================================");

                            Mascota2.mostrarEstado();

                            System.out.println("=========================================================================");
                            break;

                        case 3:
                            Mascota3.dormir();

                            System.out.println();
                            System.out.println("============================Estado Actual================================");

                            Mascota3.mostrarEstado();

                            System.out.println("=========================================================================");
                            break;

                    }
                    break;

                case 5:
                    System.out.println("===========================¿Quién cumple años?===========================");
                    System.out.println("1-" + Mascota1.nombre);
                    System.out.println("2-" + Mascota2.nombre);
                    System.out.println("3-" + Mascota3.nombre);
                    System.out.println("=========================================================================");
                    elección = aris.nextInt();

                    switch (elección) {
                        case 1:
                            Mascota1.cumplirAnios();


                            System.out.println();
                            System.out.println("============================Estado Actual================================");

                            Mascota1.mostrarEstado();

                            System.out.println("=========================================================================");

                            break;

                        case 2:
                            Mascota2.cumplirAnios();

                            System.out.println();
                            System.out.println("============================Estado Actual================================");

                            Mascota2.mostrarEstado();

                            System.out.println("=========================================================================");
                            break;

                        case 3:
                            Mascota3.cumplirAnios();

                            System.out.println();
                            System.out.println("============================Estado Actual================================");

                            Mascota3.mostrarEstado();

                            System.out.println("=========================================================================");
                            break;


                    }

                case 6:

                    System.out.println("════ ∘◦❁◦∘ ════ ESTADO DEL REFUGIO ════ ∘◦❁◦∘ ════");
                    System.out.println();

                    System.out.println("════════ ══════════ ══════════ ══════════ ");
                    //********************ESTADO DE ANIMO*****************************
                    System.out.println("1- Estado de animo");
                    System.out.println();
                    if (Mascota1.estaTriste()) {
                        System.out.println(Mascota1.nombre + " :Está triste");
                    } else {
                        System.out.println(Mascota1.nombre + " :Está Feliz");
                    }
                    if (Mascota2.estaTriste()) {
                        System.out.println(Mascota2.nombre + " :Está triste");
                    } else {
                        System.out.println(Mascota2.nombre + " :Está Feliz");
                    }
                    if (Mascota3.estaTriste()) {
                        System.out.println(Mascota3.nombre + " :Está triste");
                    } else {
                        System.out.println(Mascota3.nombre + " :Está Feliz");
                    }
                    //********************************************************************
                    System.out.println();
                    System.out.println("════════ ══════════ ══════════ ══════════ ");
                    System.out.println();
                    System.out.println("════════ ══════════ ══════════ ══════════ ");

                    //********************Hambre*****************************
                    System.out.println("2- Hambre");
                    System.out.println();
                    if (Mascota1.tieneHambre()) {
                        System.out.println(Mascota1.nombre + " :Tiene hambre");
                    } else {
                        System.out.println(Mascota1.nombre + " :No tiene hambre");
                    }
                    if (Mascota2.tieneHambre()) {
                        System.out.println(Mascota2.nombre + " :Tiene hambre");
                    } else {
                        System.out.println(Mascota2.nombre + " :No tiene hambre");
                    }
                    if (Mascota3.tieneHambre()) {
                        System.out.println(Mascota3.nombre + " :Tiene hambre");
                    } else {
                        System.out.println(Mascota3.nombre + " :No tiene hambre");
                    }
                    //********************************************************************
                    System.out.println();
                    System.out.println("════════ ══════════ ══════════ ══════════ ");
                    System.out.println();
                    System.out.println("════════ ══════════ ══════════ ══════════ ");

                    //********************Edad promedio*****************************
                    System.out.println("3- Promedio de edad");
                    int promedioedad = (Mascota1.edad + Mascota2.edad + Mascota3.edad) / 3;
                    System.out.println();
                    System.out.println("┌──────────◦(●￣(ｴ)￣●)◦──────────┐");
                    System.out.println("       " + promedioedad);
                    System.out.println("└──────────◦(●￣(ｴ)￣●)◦──────────┘");
                    //********************************************************************
                    System.out.println();
                    System.out.println("════════ ══════════ ══════════ ══════════ ");
                    System.out.println();
                    System.out.println("════════ ══════════ ══════════ ══════════ ");
                    //*******************Felicidad promedio*****************************
                    System.out.println("4- Promedio de edad");
                    int promediofelicidad = (Mascota1.felicidad + Mascota2.felicidad + Mascota3.felicidad) / 3;
                    System.out.println();
                    System.out.println("┌──────────◦(●￣(ｴ)￣●)◦──────────┐");
                    System.out.println("      " + promediofelicidad);
                    System.out.println("└──────────◦(●￣(ｴ)￣●)◦──────────┘");
                    //********************************************************************

                case 7:
                    //*******************Saludar*****************************
                    System.out.println("===========================¿A quien saludas??===========================");
                    System.out.println("1-" + Mascota1.nombre);
                    System.out.println("2-" + Mascota2.nombre);
                    System.out.println("3-" + Mascota3.nombre);
                    System.out.println("=========================================================================");
                    elección = aris.nextInt();

                    switch (elección) {
                        case 1:
                            System.out.println();
                            System.out.println("============================================================");

                            System.out.println("┏━━━━━━•(<^u^>)•━━━━━━┓");
                            Mascota1.saludar();
                            System.out.println("┗━━━━━━•(<^u^>)•━━━━━━┛");

                            System.out.println("=========================================================================");

                            break;

                        case 2:
                            System.out.println();
                            System.out.println("============================================================");

                            System.out.println("┏━━━━━━•(=^●ω●^=)•━━━━━━┓");
                            Mascota2.saludar();
                            System.out.println("┗━━━━━━•(=^●ω●^=)•━━━━━━┛");

                            System.out.println("=========================================================================");
                            break;

                        case 3:
                            System.out.println();
                            System.out.println("============================================================");

                            System.out.println("┏━━━━━━•(^Y^)•━━━━━━┓");
                            Mascota3.saludar();
                            System.out.println("┗━━━━━━•(^Y^)•━━━━━━┛");

                            System.out.println("=========================================================================");

                            System.out.println("=========================================================================");
                            break;


                    }
                    //********************************************************************

                    //*******************Adoptar*****************************

                case 9:

                    System.out.println("===========================¿Quién cumple años?===========================");
                    System.out.println("1-" + Mascota1.nombre);
                    System.out.println("2-" + Mascota2.nombre);
                    System.out.println("3-" + Mascota3.nombre);
                    System.out.println("=========================================================================");
                    elección = aris.nextInt();

                    switch (elección) {
                        case 1:

                            if (Mascota1.nombre!="Fué adoptado/a"){

                                Mascota1.adoptar();
                                System.out.println("୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥ ⊂(・(ェ)・)⊃ ୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥");
                                System.out.println();
                                System.out.println(Mascota1.nombre + " ha sido adoptado/a");
                                System.out.println();
                                System.out.println("୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥ ⊂(・(ェ)・)⊃ ୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥");
                            }else{
                                System.out.println("୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥ ⊂(・(ェ)・)⊃ ୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥");
                                System.out.println();
                                System.out.println(Mascota1.nombre + " ya fué sido adoptado/a");
                                System.out.println();
                                System.out.println("୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥ ⊂(・(ェ)・)⊃ ୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥");
                            }




                            break;

                        case 2:
                            if (Mascota2.nombre!="Fué adoptado/a"){

                                Mascota2.adoptar();
                                System.out.println("୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥ ⊂(・(ェ)・)⊃ ୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥");
                                System.out.println();
                                System.out.println(Mascota2.nombre + " ha sido adoptado/a");
                                System.out.println();
                                System.out.println("୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥ ⊂(・(ェ)・)⊃ ୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥");
                            }else{
                                System.out.println("୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥ ⊂(・(ェ)・)⊃ ୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥");
                                System.out.println();
                                System.out.println(Mascota2.nombre + " ya fué sido adoptado/a");
                                System.out.println();
                                System.out.println("୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥ ⊂(・(ェ)・)⊃ ୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥");
                            }

                            break;

                        case 3:
                            if (Mascota3.nombre!="Fué adoptado/a"){

                                Mascota3.adoptar();
                                System.out.println("୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥ ⊂(・(ェ)・)⊃ ୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥");
                                System.out.println();
                                System.out.println(Mascota3.nombre + " ha sido adoptado/a");
                                System.out.println();
                                System.out.println("୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥ ⊂(・(ェ)・)⊃ ୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥");
                            }else{
                                System.out.println("୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥ ⊂(・(ェ)・)⊃ ୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥");
                                System.out.println();
                                System.out.println(Mascota3.nombre + " ya fué sido adoptado/a");
                                System.out.println();
                                System.out.println("୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥ ⊂(・(ェ)・)⊃ ୭̥⋆*｡୭̥⋆*｡୭̥⋆*｡୭̥");
                            }

                            break;

                    }


            }
        }while (!Objects.equals(menu, 8)) ;
        System.out.println("  _ _    _           _                _             _ \n" +
                " (_) |  | |         | |              | |           | |\n" +
                " | | |__| | __ _ ___| |_ __ _    ___ | |_ _ __ __ _| |\n" +
                " | |  __  |/ _` / __| __/ _` |  / _ \\| __| '__/ _` | |\n" +
                " | | |  | | (_| \\__ \\ || (_| | | (_) | |_| | | (_| |_|\n" +
                " |_|_|  |_|\\__,_|___/\\__\\__,_|  \\___/ \\__|_|  \\__,_(_)\n" +
                "                                                      \n" +
                "                                                      ");
    }
}
