package JavaBootcamp.MyList;

import java.util.ArrayList;

public class MyList {
    public static void main(String[] args){
        ArrayList<String>kelimeler= new ArrayList<String>();
        kelimeler.add("Kodluyoruz");
        kelimeler.add("C#");
        kelimeler.add("Java");
        kelimeler.add("programlama");

       for(int i=0; i<kelimeler.size() ;i++) {
           System.out.println(kelimeler.get(i));
       }

        if(kelimeler.subList(0,1).equals("C")){
            System.out.println(kelimeler);
        }



    }
}
