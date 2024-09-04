package com.Basic;

import java.io.*;

public class CWH_111_File_Handling {
    public static void main(String[] args) {
        // Code to create a new file
/*        File myfile = new File("cwh111.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create file");
            throw new RuntimeException(e);
        }*/

        // Code to write a file
 /*       try {
            FileWriter fileWriter = new FileWriter("cwh111.txt");
            fileWriter.write("This is file from this java course\n okay now bye");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        // Code to read a file
    /*    File myfile = new File("cwh111.txt");
//        File myfile = new File("sample.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/

        // Delete a file

         File myfile = new File("sample.txt");
         if (myfile.delete()){
             System.out.println("I have deleted : "+ myfile.getName());
         }else{
             System.out.println("Some problem occurred to delete a file");
         }




    }
}
