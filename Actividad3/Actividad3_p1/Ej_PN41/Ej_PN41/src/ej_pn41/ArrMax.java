/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_pn41;


public class ArrMax {
    String[] arr;
    public ArrMax(String input){
        this.arr= input.split("[ ,]+");
    }
    
    int Max() throws NumberFormatException {
        int m= Integer.parseInt(arr[0]);
        for(String i: arr){
            int e= Integer.parseInt(i);
            System.out.println(e);
            if(e>m){
                m=e;
            }
        }
        return m;
    }
}
