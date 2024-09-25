/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_6;

// Java program to read from file "friendsContact.txt"
// and display the contacts

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.lang.NumberFormatException;

class DisplayFriends {

    public String[] displayFriends(){
        try {
            String nameNumberString;
            String name;
            String number;
            int index;

            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;
         
            int ctr= 0;
            ArrayList<String> ss= new ArrayList<>();
            
            //String[] s= new String[size];
            //System.out.println("a");
            
            while (raf.getFilePointer() < raf.length()){
                // reading line from the file.
                nameNumberString = raf.readLine();

                // splitting the string to get name and
                // number
                String[] lineSplit = nameNumberString.split("!");
                String f= lineSplit[0] + " : " + lineSplit[1];
                // separating name and number.
                //s[ctr]= nameNumberString;
                ss.add(f);
            }
            return ss.toArray(new String[0]);
        }catch (IOException ioe){
            return(null);
            //System.out.println(ioe);
        }catch (NumberFormatException nef){
            return(null);
            //System.out.println(nef);
        }
    }
}
