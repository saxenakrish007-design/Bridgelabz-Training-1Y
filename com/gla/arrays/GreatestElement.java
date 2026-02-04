package com.gla.arrays;

public class GreatestElement {
    public static void main(String[] args) {
int[] array={10,20,30,40,50};
int max=0;
for(int i=0;i<array.length;i++){
    if(array[i]>max){
        max=array[i];
    }
}
        System.out.println("Greatest elment is: "+max);
    }
}
