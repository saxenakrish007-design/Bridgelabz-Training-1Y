package com.gla.strings;

public class GeneralAllSubstring{
    public static void main(String[] args){
        String str="Hello";
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
