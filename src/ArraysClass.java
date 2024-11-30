import java.util.ArrayList;

public class ArraysClass {
    public static void main(String[] args) {
        int[] arratIntegers = new int[5];
        for(int i=0;i<5;i++)
            arratIntegers[i]=i;//no more use, non-dynamic
        arratIntegers[3]=arratIntegers[4];//manual operations
        arratIntegers[4]=0;
        for(int i=0;i<5;i++)
            System.out.println(arratIntegers[i]);//output will show the memory loss due to unwanted value or index
        //printing also have to be done manualy using loop, less flexi, visual hinderance

        ArrayList<Integer> arrMod = new ArrayList<>();
        arrMod.add(3);//no index specified, added to the first available index
        arrMod.add(1,5);
        arrMod.add(2,3);
        arrMod.add(3,10);
        arrMod.add(4,21);

        arrMod.set(2,21);
        arrMod.set(4,3);

        arrMod.remove(4);

        //more arrlist operation description
        System.out.println(arrMod);


    }
}
