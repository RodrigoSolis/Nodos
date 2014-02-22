package nodos;

import java.util.Scanner;

public class main {

        public static void main(String[] args) {
            Scanner r = new Scanner (System.in);

            lista<String> list = new lista<>();
            list.mostrarLista();
            System.out.println("------- Lista normal");
            list.insertaFinal("1");
            list.insertaFinal("2");
            list.insertaFinal("3");
            list.insertaFinal("5");
           // list.insertaFinal("3");
            list.mostrarLista();
            System.out.println("------- Lista invertida");
            lista<String> list2;
            list2 = list.invertirLista();
            list2.mostrarLista();
            System.out.println("------- Lista normal");
            list.mostrarLista();
            System.out.println("------- Inserta antes");
            
        //    list.insertaDespuesDeX("1", "2");
        //    list.insertaDespuesDeX("4", "5");
            list.insertaAntesDeX("10", "4");
            list.mostrarLista();
       //     list.borrarLista();
           // list.mostrarLista();
    //        System.out.println("-------");
      //      list.borrarNodo("1");
      //      list.mostrarLista();
      //      System.out.println("----jj---");
          //  list.editarNodo("1", "10");
          //  list.mostrarLista();
            
        }
                 
}
