package com.company;

public class Class {


    //AT
    //05YVY169

    public static boolean runSimulation(int sampleSize){
        int half =  sampleSize/2;
        int firstHalfPos = 0;
        int secondHalfPos = 0;
        int num = 0;
        for(int i = 0; i<sampleSize; i++){
            num = getInt();
            if(isTarget(num) && num>0 && i< half){
                firstHalfPos++;
            }else if(isTarget(num) && num>0 && i>= half){
                secondHalfPos++;
            }
        }
        return firstHalfPos>secondHalfPos;
    }

/*I would make sample size a variable with the final keyword so that it cannot be changed.
 It would also be a type int and visibility public because it isn't an instance variable.
 */


}