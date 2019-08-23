package org.guptahiten;

public class search {

    public void maxElement(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i=0;i< array.length;i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Max value is " + max);
    }

    public void minElement(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i< array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("MIN value is " + min);
    }

    public void secondMax(int[] array){
        int max = Integer.MIN_VALUE;
        int smax = max;
        for (int i=0;i< array.length;i++){
            if (array[i] > max){
                smax = max;
                max = array[i];
            } else if (array[i] > smax && array[i] < max){
                smax = array[i];
            }
        }

        System.out.println("SECOND MAX is " + smax + "&&&&" + " max is " + max);
    }

    public void secondMin(int[] array){
        int min = Integer.MAX_VALUE;
        int smin = min;
        for (int i =0;i< array.length;i++){
            if (array[i] < min){
                smin = min;
                min = array[i];
            } else if (array[i] < smin && array[i] > min){
                smin = array[i];
            }
        }
        System.out.println("SECOND min is " + smin + " &&&& " + " min is " + min);
    }


    public void linearSearch(int[] array,int num){
        for (int i =0;i<array.length;i++){
            if(array[i] == num){
                System.out.println("Linear search Element at index " + i);
            }
        }
        System.out.println();
    }

    public int binarySearch1(int[] array,int l, int r, int element){

        while(l <= r){
            int mid = l + (r - l)/2;
            if (array[mid] == element){
                return mid;
            } else if (array[mid] < element){
                return binarySearch1(array,mid+1,r,element);
            } else if (array[mid] > element){
                return binarySearch1(array,l,mid-1,element);
            }
        }
        return -1;
    }

    public int binarySearch2(int[] array, int element){
        int l = 0;
        int r = array.length - 1;
        while (l <= r){
            int mid = l + (r - l) / 2 ;
            if (array[mid] == element){
                return mid;
            } else if (array[mid] > element) {
                r = mid - 1;
            } else if (array[mid] < element) {
                l = mid + 1;
            }
        }
        return -1;
    }
}
