import java.util.*;
public class HashTables {

    public static void main(String[] args) {
        //Hashtable- o structura de date care retine chei unice si valori(integer,string)
        //fiecare cheie/valoare este o intrare
        //se adauga elemente rapid,poti sa stergi usor valori
        //nu e ideala pentru seturi mici,dar e ideala pentru seturi largi de date
        //mai putine coliziuni,mai mare eficienta


        Hashtable<Integer, String> table = new Hashtable<>(10);
        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");
        //table.remove(777);
        for(Integer key: table.keySet()){
            System.out.println(key.hashCode()+"\t" + "\t"+table.get(key));
        }


    }

}
