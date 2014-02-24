package nodos;

import java.util.Scanner;

public class main {

        public static void main(String[] args) {
            Scanner r = new Scanner (System.in);

            lista<String> list = new lista<>();
            list.mostrarLista(); //imprime lista vacia
            System.out.println("------- Lista normal");
            list.insertaFinal("1");
            list.insertaFinal("2");
            list.insertaFinal("3");
            list.insertaFinal("5");
            list.mostrarLista(); //inserta lista con los primeros datos
            System.out.println("------- Lista invertida");
            lista<String> list2;
            list2 = list.invertirLista(); //nueva lista 
            list2.mostrarLista(); //lista invertida
            System.out.println("------- Lista normal");
            list.mostrarLista(); //lista normal 
            System.out.println("------- Inserta antes");
            list.insertaAntesDeX("5", "4"); //antes del 5 insertará el 4
            list.mostrarLista(); //muestra la lista con el numero nuevo agregado
            System.out.println("------- Inserta despues");
            list.insertaDespuesDeX("5", "6"); //despues del 5 insertará el 6
            list.mostrarLista(); //muestra la lista con el nuevo valor
            System.out.println("-------- Lista dividida 1");
            /*el metodo dividir recibe como parametro un numero entero,
             * 1 para mostrar la primer parte de la lista y 2 
             * para la segunda parte. En caso de ser impar, el elemento extra se
             * muestra en la primer parte
             */
            list.dividir(1); //muestra la segunda mitad de la lista
            System.out.println("-------- Lista dividida 2");
            list.dividir(2); //muestra la primer mitad de la lista
            System.out.println("-------- Lista con elementos repetidos");
            list.insertaFinal("4");
            list.insertaInicio("5");
            list.insertaFinal("1");
            list.insertaInicio("3");
            list.mostrarLista();
            System.out.println("-------- Eliminar repetidos");
       //     list.eliminarDuplicados();
            list.mostrarLista();
        }
                 
}
