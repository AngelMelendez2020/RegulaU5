package Regulau5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op;
        boolean s = true;
        List<Integer> numeros = new ArrayList();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String linea, lineas = "";
        //Estos numeros les colo que 325, 418, 128, 156 
        try {
            archivo = new File("C:\\Users\\angel\\Downloads\\pruebas tópicos\\numeros.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                lineas = linea;
            }
            String num[] = lineas.split(",");
            do {
                System.out.println("Que deseas hacer?");
                System.out.println("1. Metodo burbuja");
                System.out.println("2. Metodo Quicksort");
                System.out.println("3. Metodo Shellsort");
                System.out.println("4. Metodo Radix");
                System.out.println("5. Salir");
                op = leer.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Metodo burbuja");
                        System.out.println("Numeros desordenados");
                        for (int i = 0; i < num.length; i++) {
                            int elem = Integer.parseInt(num[i]);
                            System.out.print(elem + ",");
                            numeros.add(elem);
                        }
                        for (int i = 0; i < numeros.size() - 1; i++) {
                            for (int j = 0; j < numeros.size() - 1; j++) {
                                if (numeros.get(j) > numeros.get(j + 1)) {
                                    int auxiliar = numeros.get(j + 1);
                                    numeros.set(j + 1, numeros.get(j));
                                    numeros.set(j, auxiliar);
                                }
                            }
                        }
                        System.out.println("");
                        System.out.println("Numeros ordenado:");
                        for (int i = 0; i < numeros.size(); i++) {
                            System.out.print(numeros.get(i) + ", ");
                        }
                        numeros.clear();
                        System.out.println("");
                        break;
                    case 2:
                        int izq = 0;
                        System.out.println("Metodo quicksort");
                        System.out.println("Numeros desordenados");
                        for (int i = 0; i < num.length; i++) {
                            int elem = Integer.parseInt(num[i]);
                            System.out.print(elem + ",");
                            numeros.add(elem);
                        }
                        Quicksort(numeros, izq, numeros.size() - 1);
                        System.out.println("");
                        System.out.println("Numeros ordenado:");
                        for (int i = 0; i < numeros.size(); i++) {
                            System.out.print(numeros.get(i) + ", ");
                        }
                        numeros.clear();
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("Metodo shellsort");
                        System.out.println("Numeros desordenados");
                        for (int i = 0; i < num.length; i++) {
                            int elem = Integer.parseInt(num[i]);
                            System.out.print(elem + ",");
                            numeros.add(elem);
                        }
                        shellsort(numeros);
                        System.out.println("");
                        System.out.println("Numeros ordenado:");
                        for (int i = 0; i < numeros.size(); i++) {
                            System.out.print(numeros.get(i) + ", ");
                        }
                        numeros.clear();
                        System.out.println("");

                        break;
                    case 4:
                        List<String> numero = new ArrayList<String>();
                        List<String> cero = new ArrayList<String>();
                        List<String> uno = new ArrayList<String>();
                        List<String> dos = new ArrayList<String>();
                        List<String> tres = new ArrayList<String>();
                        List<String> cuatro = new ArrayList<String>();
                        List<String> cinco = new ArrayList<String>();
                        List<String> seis = new ArrayList<String>();
                        List<String> siete = new ArrayList<String>();
                        List<String> ocho = new ArrayList<String>();
                        List<String> nueve = new ArrayList<String>();
                        System.out.println("Metodo Radix");
                        System.out.println("Numeros desordenados");
                        int n = 0,
                         m = 2;
                        for (int i = 0; i < num.length; i++) {
                            numero.add(num[i]);
                            System.out.print(" |" + numero.get(i) + "| ");
                        }
                        System.out.println("");
                        do {
                            for (int i = 0; i < numero.size(); i++) {
                                String[] nume = numero.get(i).split("");
                                int opp = Integer.parseInt(nume[m]);
                                switch (opp) {
                                    case 0:
                                        cero.add(numero.get(i));
                                        break;
                                    case 1:
                                        uno.add(numero.get(i));
                                        break;
                                    case 2:
                                        dos.add(numero.get(i));
                                        break;
                                    case 3:
                                        tres.add(numero.get(i));
                                        break;
                                    case 4:
                                        cuatro.add(numero.get(i));
                                        break;
                                    case 5:
                                        cinco.add(numero.get(i));
                                        break;
                                    case 6:
                                        seis.add(numero.get(i));
                                        break;
                                    case 7:
                                        siete.add(numero.get(i));
                                        break;
                                    case 8:
                                        ocho.add(numero.get(i));
                                        break;
                                    case 9:
                                        nueve.add(numero.get(i));
                                        break;
                                }
                            }
                            int nuevo = 0;
                            for (int i = 0; i < cero.size(); i++) {
                                numero.set(nuevo, cero.get(i));
                                nuevo++;
                            }
                            for (int i = 0; i < uno.size(); i++) {
                                numero.set(nuevo, uno.get(i));
                                nuevo++;
                            }
                            for (int i = 0; i < dos.size(); i++) {
                                numero.set(nuevo, dos.get(i));
                                nuevo++;
                            }
                            for (int i = 0; i < tres.size(); i++) {
                                numero.set(nuevo, tres.get(i));
                                nuevo++;
                            }
                            for (int i = 0; i < cuatro.size(); i++) {
                                numero.set(nuevo, cuatro.get(i));
                                nuevo++;
                            }
                            for (int i = 0; i < cinco.size(); i++) {
                                numero.set(nuevo, cinco.get(i));
                                nuevo++;
                            }
                            for (int i = 0; i < seis.size(); i++) {
                                numero.set(nuevo, seis.get(i));
                                nuevo++;
                            }
                            for (int i = 0; i < siete.size(); i++) {
                                numero.set(nuevo, siete.get(i));
                                nuevo++;
                            }
                            for (int i = 0; i < ocho.size(); i++) {
                                numero.set(nuevo, ocho.get(i));
                                nuevo++;
                            }
                            for (int i = 0; i < nueve.size(); i++) {
                                numero.set(nuevo, nueve.get(i));
                                nuevo++;
                            }

                            System.out.println("");
                            for (int i = 0; i < numero.size(); i++) {
                                System.out.print(" |" + numero.get(i) + "| ");
                            }
                            cero.clear();
                            uno.clear();
                            dos.clear();
                            tres.clear();
                            cuatro.clear();
                            cinco.clear();
                            seis.clear();
                            siete.clear();
                            ocho.clear();
                            nueve.clear();
                            m--;
                            n++;
                        } while (n != 3);
                        numero.clear();
                        System.out.println("");
                        break;
                    case 5:
                        s = false;
                        break;
                }
            } while (s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void Quicksort(List<Integer> Lista, int primero, int ultimo) {
        int i, j, aux, pivote;
        i = primero;
        j = ultimo;
        pivote = Lista.get(primero);
        do {
            while (Lista.get(i) < pivote) {
                i++;
            }
            while (Lista.get(j) > pivote) {
                j--;
            }
            if (i <= j) {
                aux = Lista.get(i);
                Lista.set(i, Lista.get(j));
                Lista.set(j, aux);
                i++;
                j--;
            }
        } while (i <= j);
        if (j > primero) {
            Quicksort(Lista, primero, j);
        }
        if (ultimo > i) {
            Quicksort(Lista, i, ultimo);
        }
    }

    public static void shellsort(List<Integer> numero) {
        int div = numero.size() / 2, aux, salto, i;
        for (salto = div; salto != 0; salto /= 2) {
            boolean cambio = true;
            while (cambio) {
                cambio = false;
                for (i = salto; i < numero.size(); i++) {
                    if (numero.get(i - salto) > numero.get(i)) {
                        aux = numero.get(i);
                        numero.set(i, numero.get(i - salto));
                        numero.set(i - salto, aux);
                        cambio = true;
                    }
                }
            }
        }
    }
}
