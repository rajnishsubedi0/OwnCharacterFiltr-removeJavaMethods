
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a = "{hel}lo= {brother} my n=ame is}{ raj{{}nis}h";
        for (int i=0;i<a.length();i++){
            char c=a.charAt(i);
            System.out.print(c);
        }
        System.out.println("");
        /*ArrayList<Dummy> arrayList=new ArrayList<>();
        arrayList.add(new Dummy("helo","brother"));
        arrayList.add(new Dummy("halo","me"));
        arrayList.add(new Dummy("olala","k"));
        arrayList.add(new Dummy("six","hola"));
        arrayList.add(new Dummy("aauch","ulala"));
        System.out.println(arrayList);*/

        HashMap hashMap=new HashMap();
        int integerGlobal=0;
        for (int i=0;i<a.length();i++){
            char c=a.charAt(i);
            String str=String.valueOf(c);
            if (str.contains("{") || str.contains("}")){
                continue;
            }
            else{

                hashMap.put(integerGlobal,str);
                integerGlobal++;
            }

        }
        System.out.println(hashMap);
        System.out.println("");
        String stringStartingManupulation=hashMap.values().toString();
        String dummy ="";

        for (int i=0;i<stringStartingManupulation.length();i++){

            char c=stringStartingManupulation.charAt(i);

            String string=String.valueOf(c);

            if (i+1<stringStartingManupulation.length() && String.valueOf("  ").contains(string+String.valueOf(stringStartingManupulation.charAt(i+1)))){
                dummy=dummy+" ";
                continue;

            }


             if (string.contains("[") || string.contains("]") || string.contains(",") || string.contains(" ") || string.contains("=") ){

            }
            else{
                dummy=dummy+string;
            }

        }


        System.out.println(dummy);

        ////////////////////////
        ArrayList<Dummy> arrayListForAddData =new ArrayList<>();
        String anotherDummy=dummy;
        String otherTest="";
        for (int i=0;i<anotherDummy.length();i++){
            otherTest=otherTest+anotherDummy.charAt(i);
            if (String.valueOf(anotherDummy.charAt(i)).contains(" ")){
                arrayListForAddData.add(new Dummy(otherTest));
                otherTest="";
            }
        }

        for (int i=0;i<arrayListForAddData.size();i++) {
            System.out.println(arrayListForAddData.get(i).getA());
        }

    }
}