package com.carlocappellini;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        getGreatestCommonDivisor(25, 15);

    }


    public static int getGreatestCommonDivisor(int first, int second) {



//        ------ WITH RECURSION
//        if(first == 0 || second == 0 ){
//
//            return first + second;
//        }
//
//        return getGreatestCommonDivisor(second, first % second);
//    }


        //----------WHILE LOOP
//        while (first != 0 && second != 0) {
//            int gD = second;
//            second = first % second;
//            first = gD;
//
//        }
//        System.out.println(first + second);
//        return first + second;
//
//
//    }


        /////WITH FOR LOOP
//        int greatest=-1;
//        if(first<10||second<10){
//            return greatest;
//        }
//        for(int i=1;i<=first;i++)
//        {
//            if(first%i==0&&second%i==0)
//                greatest=i;
//        }
//        return greatest;
//    }

        if( (first < 10) || (second < 10) ){
            return -1;
        }
        int num=0;


        for(int i =1; i<=100; i++ )
            if( (first % i==0) && (second % i==0) ){
                num = i;
                System.out.println(num);
            }
        return num;
    }



}
