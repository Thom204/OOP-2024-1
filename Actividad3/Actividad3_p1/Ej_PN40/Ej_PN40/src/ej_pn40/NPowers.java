/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_pn40;
/**
 *
 * @author thom1
 */
public class NPowers {
    double[] sqrN;
    int[] Nsq;
    int[] Ncbd;
    int size;
       
    public NPowers(String n){
        //parser
        String[] parsedN= n.split("[ ,]+");
        this.size = parsedN.length;
        sqrN= new double[size];
        Nsq= new int[size];
        Ncbd= new int[size];
        double[] castN= new double[size];
        
        for (int i=0; i< size; i++){
            if (!parsedN[i].equals("")){
                castN[i]= Double.parseDouble(parsedN[i]);
                sqrN[i] = Math.sqrt(castN[i]);
                Nsq[i] = (int)Math.pow(castN[i], 2);
                Ncbd[i] = (int)Math.pow(castN[i], 3);
            }
        }
    }
    
    String getSqrN(){
        String res= "";
        for (double i: sqrN){
            if(String.valueOf(i).length()>7){
                res+= String.valueOf(i).substring(0, 7);
            }else{
                res+= String.valueOf(i);
            }
            res+= ", ";
        }
            
        return res;
    }
    
    String getNsq(){
        String res= "";
        for (int i: Nsq){
            res+= String.valueOf(i);
            res+= ", ";
        }
            
        return res;
    }
    
    String getNcbd(){
        String res= "";
        for (int i: Ncbd){
            res+= String.valueOf(i);
            res+= ", ";
        }
            
        return res;
    }
}
