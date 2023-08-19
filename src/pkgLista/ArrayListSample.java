package pkgLista;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class ArrayListSample {
    public void ejemplo1 () {
        List<String> taskList = new ArrayList<>();
        taskList.add("Sacar al perro");
        taskList.add("Ir de compras");
        taskList.add("Hacer la cama");
        taskList.add("Ir a votar");

        //Iterar, Iterato o Iteracion
        int pos=0;
        for (String item : taskList){
            System.out.println(pos+ "Tarea: "+item);
            pos++;
        }

      /*String primerElemento = taskList.get(0);
        System.out.println("primer elemento ="+primerElemento);

        System.out.println("Elminia pos 0");
        taskList.remove(0);
        primerElemento = taskList.get(0);
        System.out.println("primer elemento ="+primerElemento);*/



    }

    public void ejercicio1(){
        //Hacer una Lista de numeros con los valores:
        //1000,2000,3000,4000
        //hacer una iteracion y mostrar la suma de esos numeros

        List<Short> listanumerica = new ArrayList<>();
        listanumerica.add((short)1000);
        listanumerica.add((short)2000);
        listanumerica.add((short)3000);
        listanumerica.add((short)4000);



int suma =0;
        for (Short n: listanumerica){
            suma = suma + n;

        }
        System.out.println("El total es: " + suma);
    }

    public void ListaTareas (){

        List<ClsTasklist> tl = new ArrayList<>();
        ClsTasklist tarea = new ClsTasklist();

        tarea.setTaskName("Ir a votar");
        tarea.setTaskDescription("Escuela, mesa 5");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTasklist();

        tarea.setTaskName("Sacar al chucho");
        tarea.setTaskDescription("Llevar a firulais al parque");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTasklist();

        tarea.setTaskName("Hacer la cama");
        tarea.setTaskDescription("Me regaña mi mama");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTasklist();

        for (ClsTasklist item : tl) {
            System.out.println("Tarea: "+item.getTaskName());
            System.out.println("Descripcion: "+item.getTaskDescription());
        }


    }

}
