package com.sena;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private Scanner sc = new Scanner(System.in);

    private Main() {
        System.out.println("Entre al contructor...");
    }

    public static void main(String[] args) {
        // Esto es un comentario de una sola linea

        /*
         * Esto es un comentario de
         * multiples lineas
         *
         * */

        final double PI = 3.14; //Constantes
        int num1 = 10;          //Variables

        ejemploStatic(); //Metodo Estatico
        Main mn = new Main(); //Instanciar la clase actual para llamar los metodos

        tiposDeDatos();

        /* Arrays */
        int[] numeros = { 1, 2, 3, 4, 5 };  //Array Con Datos predeterminados.
        int [] arrSuma = new int[10];       //Array de 10 posiciones vacias.
        arrSuma[1] = 10;                    //Asiganacion de Datos.

        /* Matrices */
        int [][] matrizNumerica = {{1,2,3},{4,5,6}};    //Matriz con datos predeterminados de 2 * 3
        int [][] matNumerica = new int[3][2];           //Matriz con datos predeterminados de 2 * 3
        matrizNumerica[0][1] = 15;                      //Asignacion de Datos.


        mn.ejemploCondicionales();
        mn.ejemploSwitch();
        mn.ejemploWhile();
        mn.ejemploDoWhile();
        mn.ejemploFor();
        mn.ejemploForEach();
        mn.ejemploRecursionFactiorial(5);   //Numero del factorial
        mn.ejemploTryCatch();
        mn.ejemploVector();
        mn.ejemploMatrices();
        mn.ejemploArrayList();

    }

    private static void tiposDeDatos (){
        //Tipos de Datos JAVA NO Soporta Tipos de Datos Sin Signo

        /* Datos Primitivos */
        byte    varByte     = 64;           // 1 byte       -   -128 to 127
        char    varChar     = 'F';          // 2 bytes      -   U+0000 to U+ffff (Unicode characters)
        short   varShort    = 1052;         // 2 bytes      -   -32,768 to 32,767
        int     varInt      = 1;            // 4 bytes      -   -2,147,483,648 to 2,147,483,647
        long    varLong     = 15987;        // 8 bytes      -   -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float   varFloat    = 3.8f;         // 4 bytes      -   +1.5 Χ 10-45 to +3.4 Χ 1038
        double  varDouble   = 3.4;          // 8 bytes      -   +5.0e-324 to +1.7e308
        boolean varBoolean  = true;         // True or false

        /* Datos Objetos */
        Object  varObject   = new Object(); // Tipo de Dato Object
        String  varString   = "Hola";       // Zero or more Unicode characters

        /*System.out.println(varByte+" - "+((Object) varByte).getClass().getName());
        System.out.println(varChar+" - "+((Object) varChar).getClass().getName());
        System.out.println(varShort+" - "+((Object) varShort).getClass().getName());
        System.out.println(varInt+" - "+((Object) varInt).getClass().getName());
        System.out.println(varLong+" - "+((Object) varLong).getClass().getName());
        System.out.println(varFloat+" - "+((Object) varFloat).getClass().getName());
        System.out.println(varDouble+" - "+((Object) varDouble).getClass().getName());
        System.out.println(varBoolean+" - "+((Object) varBoolean).getClass().getName());

        System.out.println(varObject+" - "+((Object) varObject).getClass().getName());
        System.out.println(varString+" - "+((Object) varString).getClass().getName());*/

    }

    private static void ejemploStatic(){
        System.out.println("Este es un metodo statico sus variables deben ser estaticas");
        // int num = sc.nextInt(); //SC NO ES STATICO...
    }

    private void ejemploCondicionales(){

        System.out.println("Ingrese su edad... ");
        int Edad = sc.nextInt();

        if (Edad > 18)
            System.out.println("Eres Mayor de Edad");
        System.out.println("Esto se imprime siempre...");

        if (Edad >= 0 && Edad <= 5) {
            System.out.println("Usted se encuentra en el ciclo de: "+"Primera Infancia");
        } else if (Edad >= 6 && Edad <= 11) {
            System.out.println("Usted se encuentra en el ciclo de: "+"Infancia");
        }else if (Edad >= 12 && Edad <= 18) {
            System.out.println("Usted se encuentra en el ciclo de: "+"Adolescencia");
        }else if (Edad >= 19 && Edad <= 26) {
            System.out.println("Usted se encuentra en el ciclo de: "+"Juventud");
        }else if (Edad >= 27 && Edad <= 59) {
            System.out.println("Usted se encuentra en el ciclo de: "+"Adultez");
        }else if (Edad >= 60 && Edad <= 120) {
            System.out.println("Usted se encuentra en el ciclo de: "+"Persona Mayor");
        }else{
            System.out.println("Su edad no corresponde a una valida o supera los 120 años: ");
        }
        
    }

    private void ejemploSwitch(){

        final String SUMA = "+";
        final String RESTA = "-";
        final String MULTIPLICACION = "*";
        final String DIVISION = "/";

        System.out.println("Ingrese un Numero ... ");
        int N1 = sc.nextInt();

        System.out.println("Ingrese otro Numero ... ");
        int N2 = sc.nextInt();

        System.out.println("Ingrese un operador ... ");
        String Operador = sc.nextLine();

        double Resultado = 0.0;

        switch (Operador){
            case SUMA:
                Resultado = N1+N2;
                //System.out.println("El resultado de la operacion es: "+Resultado);
                break;
            case RESTA:
                Resultado = N1-N2;
                //System.out.println("El resultado de la operacion es: "+Resultado);
                break;
            case MULTIPLICACION:
                Resultado = N1*N2;
                //System.out.println("El resultado de la operacion es: "+Resultado);
                break;
            case DIVISION:
                Resultado = (double) N1/N2;
                //System.out.println("El resultado de la operacion es: "+Resultado);
                break;
            default:
                System.out.println("Operador no valido....");
        }

        System.out.println("El resultado de la operacion es: "+Resultado);

    }

    private void ejemploWhile() {
        System.out.println("Ingrese un numero desde el que desea la cuenta regresiva...");
        int Num = sc.nextInt();

        while (Num > 0){
            System.out.print(Num+"-");
            Num--;
        }
        System.out.println(" ");
        System.out.println("Conteo Finalizado");
    }

    private void ejemploDoWhile() {
        System.out.println("Ingrese un numero desde el que desea la cuenta...");
        int Num = sc.nextInt();
        int numConteo = 0;

        do {
            System.out.print("0");
            numConteo++;
        }while (numConteo != Num);

        System.out.println("Conteo Finalizado");
    }

    private void ejemploFor() {
        System.out.println("Ingrese un numero para imprimir su tabla de multiplicar");
        int Num = sc.nextInt();
        System.out.println("");
        for (int i=1; i<=10; i++){
            System.out.println(Num+" * "+i+" = "+(Num*i));
        }
        System.out.println(" ");
        System.out.println("Tabla Finalizada");
    }

    private void ejemploForEach() {
        System.out.println("Mostrando los dias de la semana...");
        String [] arrDias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};

        for (String dia: arrDias ) {
            System.out.print(dia+" - ");
        }

        System.out.println(" ");
        System.out.println("Semana Finalizada");
    }

    private int ejemploRecursionFactiorial(int n) {
        if (n == 0) {
            return 1; //Valor Final
        } else {
            return n * ejemploRecursionFactiorial(n - 1); //recursive case
        }
    }


    private void ejemploTryCatch() {
        boolean DatoCorrecto = false;
        do {
            try {
                int Numero = 0;
                System.out.println("Ingrese un numero entero mayor de 0 y menor o igual a 10");
                Numero = Integer.parseInt(sc.nextLine());
                if(Numero > 0 && Numero <= 10){
                    DatoCorrecto = true;
                }else{
                    throw new Exception("El numero no esta comprendido entre 0 y 10");
                }
                System.out.println("El numero es: "+Numero);
            }catch (NumberFormatException NFE){
                System.err.println("El dato ingresado no es un numero... ");
            }catch (Exception Ex){
                System.err.println("Ha Ocurido Error: "+Ex.getMessage());
            }finally {
                System.err.println("Intentalo Nuevamente");
            }
        }while (DatoCorrecto == false);
    }

    private void ejemploVector() {

        System.out.println("Ingrese la cantidad de numeros a multiplicar");
        int CantidadNum = sc.nextInt();
        int vecNumeros [] = new int [CantidadNum];
        int vecResultado [] = new int [CantidadNum];

        System.out.println("Ingrese el numero a multiplicar");
        int NumMultiplo = sc.nextInt();

        /* Llenar vector */
        for (int a=0; a <= vecNumeros.length; a++){
            System.out.println("Ingrese el numero: "+(a+1));
            vecNumeros[a] = sc.nextInt();
            //vecResultado[a] = vecNumeros[a] * NumMultiplo;
        }

        /* Operar vector */
        for (int b=0; b <= vecResultado.length; b++){
            vecResultado[b] = vecNumeros[b] * NumMultiplo;
            //System.out.println(vecNumeros[b]+" * "+NumMultiplo+" es: "+vecResultado[b]);
        }

        /* Imprimir vector */
        for (int c=0; c <= vecResultado.length; c++){
            System.out.println(vecNumeros[c]+" * "+NumMultiplo+" es: "+vecResultado[c]);
        }

    }

    private void ejemploMatrices() {

        System.out.println("Ingrese la cantidad de columnas de la tabla de multiplicar");
        int CantidadColumnas = sc.nextInt();

        System.out.println("Ingrese la cantidad de filas de la tabla de multiplicar");
        int CantidadFilas = sc.nextInt();

        int matrizTabla [][] = new int [CantidadFilas][CantidadColumnas];


        /* Llenar Matriz */
        for (int Fil=0; Fil < CantidadFilas; Fil++){
            for (int Col=0; Col < CantidadColumnas; Col++) {
                matrizTabla[Fil][Col] = (Fil+1)*(Col+1);
            }
        }

        /* Imprimir vector */
        for (int Fil=0; Fil < CantidadFilas; Fil++){
            for (int Col=0; Col < CantidadColumnas; Col++) {
                System.out.print("|"+matrizTabla[Fil][Col]+"\t");
            }
            System.out.print("|\n");
        }

    }

    private void ejemploArrayList() {

        ArrayList <String> arrListNombres = new ArrayList <String>();
        String Nombre = "";

        System.out.println("Ingrese un nombre o Terminar para salir: ");
        Nombre = sc.nextLine();

        while (!Nombre.equalsIgnoreCase("Salir")){
            arrListNombres.add(Nombre);
            System.out.println("Ingrese un nombre o Terminar para salir: ");
            Nombre = sc.nextLine();
        }


        if(arrListNombres.size() > 0){
            System.out.println("El primer Elemento es: "+arrListNombres.get(0)); //Obtener un elemento
            System.out.println("El ultimo Elemento es: "+arrListNombres.get(arrListNombres.size()-1));
            arrListNombres.set(0,"MiNombre");           //Cambiar el dato de un elemento
            System.out.println(arrListNombres);         //Imprimir todo el vector
            arrListNombres.remove(0);            //Eliminar un elemento

            int i=1;
            for (String nombre : arrListNombres) {
                System.out.println(i+" => "+nombre); //Recorrer ArrayList
                i++;
            }

            Collections.sort(arrListNombres);           //Ordenar ArrayList
            System.out.println(arrListNombres);

        }else{
            System.out.println("Vector Vacio !!!");
        }

    }

}
