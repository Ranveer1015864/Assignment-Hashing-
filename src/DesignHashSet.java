
import java.util.*;


public class DesignHashSet {
    public static void main(String[] args) {

        HashSet<String> set=new HashSet<>();
        HashSet<String> set2=new HashSet<>();



        set.add("MS dhoni");
        set.add("Virat");
        set.add("Rohit");
        set.add("Surya");
        set.add("Gautam");


        System.out.println("------------------------------------------Players List*--------------------------------------");
        System.out.println();

        for(String x:set){
            System.out.println(" "+x+"|");
        }


        set.remove("Virat");



        System.out.println("----------------------------------Players List after Eliminating players--------------------------"+"\n");


        for(String x:set){
            System.out.println(" "+x+"|");
        }

        System.out.println("\n");


        System.out.println("Search for Virat");
        if(set.contains("Virat")) {
            System.out.println("Player Name found");
        }
        else{
            System.out.println("Player Not found"+"\n");
        }

        System.out.println("*****************************************************************************************************************"+"\n");
        System.out.println("Clone List"+"\n");

        //Normal clone
        System.out.println(set.clone());


        System.out.println();



        // Deep Clone concept

        System.out.println("-----------------------------------------------------------------------------------------------");

        System.out.println("                               +++++Deep_Clone Concept+++++");


        for(String j:set){
            set2.add(j);
        }

        set2.remove("Gautam");

        for(String x:set){
            System.out.println(" "+x+"|");
        }


        System.out.println();
        for( String m:set2)
        {
            System.out.println(" "+m+"|");
        }


        System.out.println();


        System.out.println("-----------------------------------------------------------------------------------------------");

        System.out.println("                               +++++Shallow clone Concept+++++");
        //Shallow clone Concept

        set2=set;

        for(String p:set){
            System.out.println(" "+p+"|");
        }

        System.out.println();

        set2.remove("Surya");


        for(String s:set){
            System.out.println(" "+s+"|");
        }

        System.out.println();

        for(String s:set2){
            System.out.println(" "+s+"|");
        }


        System.out.println();


        System.out.println("\n"+"*****************************************************************************************************************"+"\n");
        //Hashcode concept
        System.out.println("Hash Code ");

        String name="Rohit";

        System.out.println(name.hashCode());

    }
}
