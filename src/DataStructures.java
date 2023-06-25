import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataStructures {
    public static void main(String[] args) {
        ArrayList<String> listaCumparaturi = new ArrayList<>();
        listaCumparaturi.add("oua");
        listaCumparaturi.add("lapte");
        listaCumparaturi.add("paine");
        listaCumparaturi.add("detergent");
        listaCumparaturi.set(1, "lapte vegetal");
        listaCumparaturi.remove(0);
        System.out.println(listaCumparaturi.get(1));
        for (String element : listaCumparaturi) {
            System.out.println(element);
        }
        System.out.println(listaCumparaturi.size());
        System.out.println(listaCumparaturi.contains("oua"));

        HashMap<Integer, String> hashMapList = new HashMap<>();
        hashMapList.put(1, "Luni");
        hashMapList.put(2, "Marti");
        hashMapList.put(3, "Miercuri");
        hashMapList.put(4,"Joi");
        hashMapList.put(5,"Vineri");
        hashMapList.remove(5);
        System.out.println(hashMapList.get(3));
        System.out.println(hashMapList.keySet());
        System.out.println(hashMapList.values());
        hashMapList.replace(1,"Luni-modificat");
        System.out.println(hashMapList.values());
        System.out.println(hashMapList.entrySet());

        //EX 2 PCT 4
       ArrayList<String> listaCursuri = new ArrayList<>();
        listaCursuri.add("Testare manuala");
        listaCursuri.add("Testare automata");
        listaCursuri.add("Front-end");
        listaCursuri.add("Java");
        System.out.println(listaCursuri.get(1));
        System.out.println(listaCursuri.size());
        for (String cursuri:listaCursuri){
            System.out.println(cursuri);
        }

        //ex2 pct 5
        HashMap<String, Boolean> examenStudent = new HashMap<>();
        examenStudent.put("Ioana",false);
        examenStudent.put("Lia", true);
        examenStudent.put("Vasile", false);
        examenStudent.put("Ana", true);
        examenStudent.put("Cristina", false);
        for (Map.Entry<String, Boolean> intrare: examenStudent.entrySet()){
            if (intrare.getValue() == true)
                System.out.println(intrare.getKey());
        }




    }

}
