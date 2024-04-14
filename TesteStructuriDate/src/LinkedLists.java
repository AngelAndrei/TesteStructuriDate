import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {


        //mai bune la adaugat si sters elemente din liste foarte mari
        //slabe la cautat valori

        LinkedList<String> lista = new LinkedList<>();
        lista.push("A"); //adauga elemente in lista
        lista.push("b");
        lista.push("c");
        lista.push("d");
        lista.push("e");
        //lista.pop(); //sterge ultimul element
        lista.add(4,"E"); //adaugam un element
        lista.remove("e"); //stergem un element
        System.out.println(lista.indexOf("A"));//gasim index ul unui element
        System.out.println(lista);

        lista.peekFirst();//adauga head

        lista.peekLast();//adauga tail
        lista.addFirst("0");//adauga ca prim element
        lista.addLast("Z");//adauga ultim


    }
}
