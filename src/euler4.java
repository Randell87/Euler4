import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class euler4 {
    public static void main(String[] args) {
        //перебор всех произведений и добавление их в массив
        ArrayList<Integer> nums = new ArrayList<>();
        for (int z = 999; z>100; z--){
            for (int x = 999; x>100; x--){
                nums.add(z*x);
            }
        }
        System.out.println("всего получилось чисел :" + nums.size());
        ArrayList<Integer> poly = new ArrayList<>();
        for (Integer i : nums) {
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            int f = 0;
            //System.out.println(i);
            a = i/100000;
            //System.out.println(a);
            b = (i-(a*100000))/10000;
            //System.out.println(b);
            c = (i-(a*100000)-(b*10000))/1000;
            //System.out.println(c);
            d = (i-(a*100000)-(b*10000)-(c*1000))/100;
            //System.out.println(d);
            e = (i-(a*100000)-(b*10000)-(c*1000)-(d*100))/10;
            // System.out.println(e);
            f = i-(a*100000)-(b*10000)-(c*1000)-(d*100)-(e*10);
            //System.out.println(f);
            if((a==f)&(b==e)&(c==d)){
                poly.add(i);
            }
        }
        System.out.println(Collections.max(poly));


    }
}
