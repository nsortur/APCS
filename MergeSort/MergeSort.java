import java.util.*;
import java.io.*;
public class MergeSort{
    public static void main(String[]args) throws Exception{
        //Divide array in half
        //Divide the subarrays in half until you have single elements
        Scanner scan = new Scanner(new BufferedReader(new FileReader("nums.txt")));
        ArrayList<Integer> bull = new ArrayList<Integer>();

        while(scan.hasNext()){
            bull.add(scan.nextInt());
        }
        merge(bull);

        for(int i:bull){
            System.out.println(i);
        }
    }

    public static List<Integer> merge(List<Integer> L){
        int size = L.size();

        List<Integer> a;
        List<Integer> b;

        a = merge(L.subList(0,L.size()/2));
        b = merge(L.subList(L.size()/2,L.size()));
        while(L.size() != 1){

            for(int i = 0; i < a.size(); i++){
                if(a.get(i) < b.get(i)){
                    //do the thing
                }

            }
        }
        return L;
    }
}