import java.util.ArrayList;

public class ArrayLists {
            //arraylists
    //orice marime,pot fi schimbate DUPA compilare
    //poti adauga sau scoate elemente DUPA compilare
    //la liste foarte mari,e mai usor sa adaugi sau sa stergi elemente cu linkedlist;

    public static void main(String[] args) {
        ArrayList<String> mancare = new ArrayList<>();

        mancare.add("Pizza");
        mancare.add("Burger");
        mancare.add("Paine");
        mancare.add("Kebab");
        mancare.add("Paste");


        mancare.set(0,"sushi"); // updateaza o valoare(valoarea 0) cu o noua valoare(sushi)

        mancare.remove(2); //sterge valoarea din index si reface array ul,nu o sa arate null
        mancare.clear(); //sterge tot ce ai in arraylist
        for(int i=0;i<mancare.size();i++){

            System.out.println(mancare.get(i));
        }
    }
}

