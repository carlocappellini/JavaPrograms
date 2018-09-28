package com.carlocappellini;

public class FlourPackProblem {

    public static void main(String[] args) {
        canPack(2, 0, 5);

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
//
// //different solution

//  if(bigCount<0 || smallCount<0 || goal<0)
//            return false;
//        if(goal>(bigCount*5+smallCount))
//            return false;
//        if(goal<=(bigCount*5+smallCount)){
//            int a=goal/5;
//            goal=goal-a*5;
//            if(goal<=smallCount)
//                return true;
//        }
//        return false;
//
//    }

//different solution
//
//        if(bigCount<0||smallCount<0||goal<0){
//            return false;
//        }
//        int bigCountCapacity=bigCount*5;
//        int sum=bigCountCapacity+smallCount;
//        if(goal>sum){
//            return false;
//        }else if(goal==sum){
//            return true;
//        }else{
//            if(goal==bigCountCapacity){
//                return true;
//            }else if(goal>bigCountCapacity){
//                int rem=goal-bigCountCapacity;
//                if(rem<=smallCount){
//                    return true;
//                }else{
//                    return false;
//                }
//            }else{
//                int req=goal/5;
//                int rem=goal-(req*5);
//                if(rem<=smallCount){
//                    return true;
//                }else{
//                    return false;
//                }
//            }
//        }
//    }


        if (bigCount >= 0 || smallCount >= 0) {
            int check;
            int bigBagResult;

            bigBagResult = 5 * bigCount;
            int sum = bigBagResult + smallCount;
            check = goal % 5;

            if (check <= smallCount || sum >= goal) {
                System.out.println(bigCount + " " + smallCount + " " + goal);
                return true;

            } else {
                return false;
            }


        }
        return false;
    }
}
