
package array;

import java.util.*;

public class Array {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        int desicion=1,total,u;
        ArrayList <String> nombre = new ArrayList();
        ArrayList <Integer> salario = new ArrayList();
        ArrayList <Integer> dias = new ArrayList();
        ArrayList <Integer> totall = new ArrayList();
        while(continuar){
            System.out.println("Ingrese el nombre");
            nombre.add(leer.next());
            System.out.println("ingrese salario por dia");
            salario.add(leer.nextInt());
            System.out.println("ingrese dias trabajados");
            dias.add(leer.nextInt());
            System.out.println("desea continuar ingresando");
            desicion = leer.nextInt();
            if(desicion==0){
               continuar =false;
            }
        }
        
        for(u=0; u<nombre.size(); u++){
            total=(salario.get(u)*dias.get(u));
            totall.add(total);
            System.out.println(nombre.get(u)+"\t"+salario.get(u)+"\t"+dias.get(u)+"\t"+totall.get(u));
        }


        
    }
    
}
