package org.guptahiten;

public class Search {

    //searching in array
    //max min second-max second-min
    //simple array element search
    //linear  << binary >> jump  interpolation exponential  fibonacci

    public Search(int[] array) {
        System.out.println("\n------------------------------\n");
        maxElement(array);
        secondMax(array);
        secondMin(array);
        minElement(array);
        System.out.println("\n------------------------------\n");
    }

    private void maxElement(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("MAX Element is " + max);
   }

    private void minElement(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("MIN Element is " + min);
    }

    private void secondMax(int[] array){
        int max = Integer.MIN_VALUE;
        int secondMax = max;
        for (int i=0;i<array.length;i++){
            if (array[i] > max){
                secondMax = max;
                max = array[i];
            }else if (array[i] > secondMax){
                secondMax = array[i];
            }
        }
        System.out.println("SECOND MAX Element is " + secondMax);
    }

    private void secondMin(int[] array){
        int min = Integer.MAX_VALUE;
        int secondMin = min;
        for (int i=0;i<array.length;i++){
            if (array[i] < min){
                secondMin = min;
                min = array[i];
            } else if (array[i] < secondMin){
                secondMin = array[i];
            }

        }
        System.out.println("SECOND MIN Element is " + secondMin);
    }

    //Linear Search
    public int linearSearch(int[] array,int element){
        for (int i = 0;i<array.length;i++) {
            if (array[i] == element){
                return i;
            }
        }
        return -1;
    }

    //Binary Search
    private int binarySearch(int[] sortedArray, int l, int r, int searchElement){

       if(r >= l){
           int mid = l + (r - l) / 2;
           if (sortedArray[mid] == searchElement)
               return mid;
           if (sortedArray[mid] > searchElement)
               return binarySearch(sortedArray,l,mid - 1,searchElement);
           return binarySearch(sortedArray,mid + 1, r, searchElement);
       }
       return -1;
    }

}
