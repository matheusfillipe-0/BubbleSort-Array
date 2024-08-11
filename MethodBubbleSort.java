package org.arraySort;
public class MethodBubbleSort {


    static void bubbleSort(int yourArray[]) {
        for (int i = 0; i < yourArray.length; i++) {
            for (int x = 0; x < yourArray.length - 1; x++) {
                if (yourArray[x] > yourArray[x + 1]) {
                    replacement(yourArray, x, x + 1);
                }
            }
        }
    }

    static void replacement(int yourArray[], int x1, int x2) {
        int temp = yourArray[x1];
        yourArray[x1] = yourArray[x2];
        yourArray[x2] = temp;
    }
}

