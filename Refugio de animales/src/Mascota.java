public class Mascota {
    public String nombre;
    public String tipo;
    public int edad;
    public int hambre;
    public int felicidad;

    //=======================================================================================================================
    //=======================================================================================================================

    public Mascota(String nombre, String tipo, int edad, int hambre, int felicidad) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.hambre = hambre;
        this.felicidad = felicidad;

    }

    //=================ALIMENTAR======================================================================================================
    //=======================================================================================================================

    public int alimentar(){

        if (hambre<3) {
            System.out.println("┌─────◦(●￣(ｴ)￣●)◦─────┐");
            System.out.println("  Aún no tiene hambre");
            System.out.println("└─────◦(●￣(ｴ)￣●)◦─────┘");
        } else if (hambre==0) {

            felicidad++;
            return felicidad;

        }else{
            hambre = hambre-3;

            System.out.println("════════════════════ ⋆★⋆ ════════════════════");
            System.out.println();
            System.out.println("    " + nombre + " ha sido alimentado/a");
            System.out.println();
            System.out.println("══════════════════════════════════════════════");
        }

        return hambre;

    }

    //==================JUGAR=====================================================================================================
    //=======================================================================================================================

    public int jugar(){

        if (felicidad==10){
            System.out.println("┌──────────◦(●￣(ｴ)￣●)◦──────────┐");
            System.out.println("  Felicidad maxima alcanzada");
            System.out.println("└──────────◦(●￣(ｴ)￣●)◦──────────┘");
        }else{
            felicidad++;
            return felicidad;
        }

        hambre++;

        System.out.println("════════════════════ ⋆★⋆ ════════════════════");
        System.out.println();
        System.out.println("    " + nombre + " ha jugado, ahora está mas feliz");
        System.out.println();
        System.out.println("══════════════════════════════════════════════");

        return hambre;
    }

    //==================DORMIR=====================================================================================================
    //=======================================================================================================================

    public int dormir(){


        if (hambre>0){
            hambre--;
            return hambre;
        }
        felicidad++;

        System.out.println("════════════════════ ⋆★⋆ ════════════════════");
        System.out.println();
        System.out.println("    " + nombre + " ha dormido");
        System.out.println();
        System.out.println("══════════════════════════════════════════════");

        return felicidad;

    }

    //=================CUMPLIR AÑOS======================================================================================================
    //=======================================================================================================================

    public int cumplirAnios(){

        edad++;

        System.out.println("════════════════════ ⋆★⋆ ════════════════════");
        System.out.println();
        System.out.println("¡Feliz cumpleaños! Tu amiguito ahora tiene: " + edad);
        System.out.println();
        System.out.println("══════════════════════════════════════════════");

        return edad;
    }

    //==================MOSTRAR ESTADO=====================================================================================================
    //=======================================================================================================================

    public void mostrarEstado(){
        System.out.println("-Nombre: " + nombre);
        System.out.println("-Tipo: " + tipo);
        System.out.println("-Edad: " + edad);
        System.out.println("-Hambre: " + hambre + "¿Tiene hambre?: " + tieneHambre());
        System.out.println("-Felicidad: " + felicidad + "¿Está triste?: " + estaTriste());
        estaEnfermo();
    }

    //====================TRISTEZA===================================================================================================
    //=======================================================================================================================

    public boolean estaTriste(){

        boolean tristeza=true;

        if (felicidad<3){
        return tristeza;
        }else{
            tristeza = false;
        }
        return tristeza;
    }

    //====================HAMBRE===================================================================================================
    //=======================================================================================================================

    public boolean tieneHambre(){

        boolean hambriento = true;

        if (hambre>7){
            return hambriento;
        }else{
            hambriento = false;
        }

        return hambriento;
    }

    //=======================Saludar================================================================================================
    //=======================================================================================================================

    public void saludar(){
        if (tipo =="Perro"){
            System.out.println("¡Guau!");
        } else if (tipo == "Gato") {
            System.out.println("¡Miau!");
        }else{
            System.out.println("¡Pyon!");
        }
    }

    //=================Enfermedad======================================================================================================
    //=======================================================================================================================

    public boolean estaEnfermo(){

        boolean enfermo = true;

        if (hambre<1&&felicidad<1){

            System.out.println("__∘__•__∘__•__∘__•__∘__•__∘__");
            System.out.println();
            System.out.println("Está enfermo/a");
            System.out.println();
            System.out.println("__∘__•__∘__•__∘__•__∘__•__∘__");

            return enfermo;
        }else{
            enfermo = false;

            System.out.println("__∘__•__∘__•__∘__•__∘__•__∘__");
            System.out.println();
            System.out.println("No está enfermo/a");
            System.out.println();
            System.out.println("__∘__•__∘__•__∘__•__∘__•__∘__");
        }

        return enfermo;
    }

    //=================Enfermedad======================================================================================================
    //=======================================================================================================================

    public void adoptar(){
        nombre="Fué adoptado/a";
        tipo="Fué adoptado/a";
        edad=0;
        hambre=0;
        felicidad=0;
    }


}




