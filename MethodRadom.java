package org.arraySort;

public class MethodRadom {

    static int generateRandomNumber() {
        return (int) (Math.random() * 20) +1 ;
    }

    static void populateArray(int yourArray[]){
        for (int i = 0; i < yourArray.length; i++){
            yourArray[i]=generateRandomNumber();
        }
    }
}