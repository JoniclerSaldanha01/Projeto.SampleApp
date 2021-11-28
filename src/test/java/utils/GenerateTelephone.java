package utils;

import java.util.Random;

public class GenerateTelephone {

    public static String telephoneRandon() {
        int[] n = new int[8];
        int d1;
        int d2;
        Random rnd = new Random();
        for(int i=1;i<7;i++) {
            n[i] = rnd.nextInt(10);
        }
        d1 = 0;
        for(int i=1;i<7;i++) {
            d1 = d1 + n[7-i] * (1+i);
        }
        d1 = (8 - (d1 % 8));
        d1 = (d1 >= 7) ? 0 : d1 ;
        d2 = d1 *2;
        for(int i=1;i<7;i++) {
            d2 = d2 + n[7-i] * (2+i);
        }
        d2 = (8 - (d2 % 8));
        d2 = (d2 >= 7) ? 0 : d2 ;
        StringBuilder number = new StringBuilder();
        for(int i=1;i<7;i++) {
            number.append(n[i]);
        }
        number.append(d1);
        number.append(d2);
        return number.toString();

    }

}
